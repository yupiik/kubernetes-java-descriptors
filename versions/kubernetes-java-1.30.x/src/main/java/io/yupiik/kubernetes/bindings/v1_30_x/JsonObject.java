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
package io.yupiik.kubernetes.bindings.v1_30_x;

import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class JsonObject extends LinkedHashMap<String, Object> {
    /**
     * @param content object content, values can only be typed as JsonObject | JsonArray | JsonValue..
     */
    public JsonObject(final Map<String, Object> content) {
        putAll(content);
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }

        final var writer = new StringWriter(512);
        try (writer;
             final var generator = new JsonGenerator(writer)) {
            generator.writeStartObject();
            forEach(generator::writeJsonValue);
            generator.writeEnd();
        } catch (final IOException e) {
            throw new IllegalStateException(e);
        }
        return writer.toString();
    }
}

