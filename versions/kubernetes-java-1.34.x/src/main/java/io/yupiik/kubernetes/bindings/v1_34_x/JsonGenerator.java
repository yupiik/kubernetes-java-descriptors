/*
 * Copyright (c) 2022 - present - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.v1_34_x;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedList;

// forked from @apache/johnzon
class JsonGenerator implements AutoCloseable {
    private final transient Writer writer;
    private final char[] buffer;
    private int bufferPos = 0;
    private boolean closed;

    private final LinkedList<GeneratorState> state = new LinkedList<>();

    private enum GeneratorState {
        INITIAL(false, false),
        START_OBJECT(true, true), IN_OBJECT(true, true), AFTER_KEY(false, false),
        START_ARRAY(false, true), IN_ARRAY(false, true),
        END(false, false),
        ROOT_VALUE(false, true);

        private final boolean acceptsKey;
        private final boolean endable;

        GeneratorState(final boolean acceptsKey, final boolean endable) {
            this.acceptsKey = acceptsKey;
            this.endable = endable;
        }
    }

    JsonGenerator(final Writer writer) {
        this.writer = writer;
        this.buffer = new char[4_096];
        state.push(GeneratorState.INITIAL);
    }

    private void doWriteKey(final String name) {
        justWrite('"');
        justWrite(JsonStrings.escapeJson(name));
        justWrite('"');
        justWrite(':');
    }

    void writeStartObject() {
        prepareValue();
        state.push(GeneratorState.START_OBJECT);
        justWrite('{');
    }

    public void writeStartObject(final String name) {
        writeKey(name);
        justWrite('{');
        state.push(GeneratorState.START_OBJECT);
    }

    public void writeStartArray() {
        prepareValue();
        state.push(GeneratorState.START_ARRAY);
        justWrite('[');
    }

    public void writeStartArray(final String name) {
        writeKey(name);
        justWrite('[');
        state.push(GeneratorState.START_ARRAY);
    }

    void writeJsonValue(final String name, final Object value) {
        if (value instanceof JsonArray) {
            final var array = (JsonArray) value;
            writeStartArray(name);
            for (final var jsonValue : array) {
                writeJsonValue(jsonValue);
            }
            writeEnd();
        } else if (value instanceof JsonObject) {
            final var object = (JsonObject) value;
            writeStartObject(name);
            for (final var keyval : object.entrySet()) {
                writeJsonValue(keyval.getKey(), keyval.getValue());
            }
            writeEnd();
        } else {
            final var v = tryJsonValue(value);
            writeKey(name);
            writeValue(v.toString());
        }
    }

    void writeJsonValue(final Object value) {
        if (value instanceof JsonArray) {
            final var array = (JsonArray) value;
            writeStartArray();
            for (final var o : array) {
                writeJsonValue(o);
            }
            writeEnd();
        } else if (value instanceof JsonObject) {
            final var object = (JsonObject) value;
            writeStartObject();
            for (var keyval : object.entrySet()) {
                writeJsonValue(keyval.getKey(), keyval.getValue());
            }
            writeEnd();
        } else {
            writeValue(tryJsonValue(value).toString());
        }
    }

    private JsonValue tryJsonValue(final Object value) {
        if (value instanceof JsonValue) {
            return (JsonValue) value;
        }
        if (value instanceof JsonArray) {
            return new JsonValue((JsonArray) value);
        }
        if (value instanceof JsonObject) {
            return new JsonValue((JsonObject) value);
        }
        if (value instanceof CharSequence) {
            return new JsonValue(((CharSequence) value).toString());
        }
        if (value instanceof Number) {
            return new JsonValue(((Number) value));
        }
        if (value instanceof Boolean) {
            return new JsonValue(((Boolean) value));
        }
        throw new IllegalArgumentException("Unsupported type: " + value + " (" + value.getClass() + ")");
    }

    public void writeEnd() {
        final var last = state.pop();
        if (last == null || !last.endable || last == GeneratorState.ROOT_VALUE) {
            throw new IllegalStateException("Can't end current context: " + last);
        }
        if (last == GeneratorState.IN_ARRAY || last == GeneratorState.START_ARRAY) {
            justWrite(']');
        } else {
            justWrite('}');
        }
        alignState();
    }

    public void writeKey(final String key) {
        final GeneratorState currentState = currentState();
        if (!currentState.acceptsKey) {
            throw new IllegalStateException("state " + currentState + " does not accept a key");
        }
        if (currentState == GeneratorState.IN_OBJECT) {
            justWrite(',');
        }

        doWriteKey(key);
        state.push(GeneratorState.AFTER_KEY);
    }

    @Override
    public void close() {
        if (closed) {
            return;
        }
        IllegalStateException ex = null;
        final var state = currentState();
        if (state != GeneratorState.END && state != GeneratorState.ROOT_VALUE) {
            ex = new IllegalStateException("Invalid json, state=" + state);
        }
        try {
            if (ex == null) {
                flushBuffer();
                writer.close();
            }
        } catch (final IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        } finally {
            closed = true;
        }
        if (ex != null) {
            throw ex;
        }
    }

    private void flushBuffer() {
        if (bufferPos > 0) {
            try {
                writer.write(buffer, 0, bufferPos);
                bufferPos = 0;
            } catch (final IOException e) {
                throw new IllegalStateException(e.getMessage(), e);
            }
        }
    }

    private void justWrite(final String value) {
        final int valueLength = value.length();
        if (bufferPos + valueLength >= buffer.length) {
            int start = 0;
            int len = buffer.length - bufferPos;
            while (true) {
                int end = start + len;
                if (end > valueLength) {
                    end = valueLength;
                }

                value.getChars(start, end, buffer, bufferPos);

                bufferPos += (end - start);
                start += (len);

                if (start >= valueLength) {
                    return;
                }

                if (bufferPos >= buffer.length) {
                    flushBuffer();
                    len = buffer.length;
                }
            }
        } else {
            value.getChars(0, valueLength, buffer, bufferPos);
            bufferPos += valueLength;
        }
    }

    private void justWrite(final char value) {
        if (bufferPos >= buffer.length) {
            flushBuffer();
        }
        buffer[bufferPos++] = value;
    }

    private void prepareValue() {
        final var currentState = currentState();
        if (currentState == GeneratorState.IN_ARRAY) {
            justWrite(',');
        }
    }

    private void alignState() {
        if (currentState() == GeneratorState.AFTER_KEY) {
            state.pop();
        }
        switch (currentState()) {
            case START_ARRAY:
                swapState(GeneratorState.IN_ARRAY);
                break;
            case START_OBJECT:
                swapState(GeneratorState.IN_OBJECT);
                break;
            case INITIAL:
                state.push(GeneratorState.ROOT_VALUE);
                break;
            default:
        }
    }

    private void swapState(final GeneratorState newState) {
        state.pop();
        state.push(newState);
    }

    private GeneratorState currentState() {
        return state.peek();
    }

    private void writeValue(final String value) {
        prepareValue();
        justWrite(value);
        alignState();
    }
}

