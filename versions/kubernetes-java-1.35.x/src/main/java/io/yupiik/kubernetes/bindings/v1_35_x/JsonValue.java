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
package io.yupiik.kubernetes.bindings.v1_35_x;

import java.util.Objects;

public class JsonValue {
    private final String value;

    public JsonValue(final Boolean value) {
        this.value = value == null ? null : String.valueOf(value);
    }

    public JsonValue(final Number value) {
        this.value = value == null ? null : String.valueOf(value);
    }

    public JsonValue(final String value) {
        this.value = value == null ? null : ('"' + JsonStrings.escapeJson(value) + '"');
    }

    public JsonValue(final JsonObject value) {
        this.value = value == null ? null : value.toString();
    }

    public JsonValue(final JsonArray value) {
        this.value = value == null ? null : value.toString();
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(final Object __other) {
        return __other instanceof JsonValue && Objects.equals(value, ((JsonValue) __other).value);
    }
}

