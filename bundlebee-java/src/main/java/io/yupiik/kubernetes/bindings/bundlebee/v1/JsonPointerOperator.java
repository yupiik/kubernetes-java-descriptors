/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
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
package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;

import jakarta.json.bind.annotation.JsonbProperty;

public enum JsonPointerOperator implements Exportable {
    @JsonbProperty("EXISTS")
    EXISTS("EXISTS"),
    @JsonbProperty("EQUALS")
    EQUALS("EQUALS"),
    @JsonbProperty("EQUALS_IGNORE_CASE")
    EQUALSIGNORECASE("EQUALS_IGNORE_CASE"),
    @JsonbProperty("NOT_EQUALS_IGNORE_CASE")
    NOTEQUALSIGNORECASE("NOT_EQUALS_IGNORE_CASE"),
    @JsonbProperty("NOT_EQUALS")
    NOTEQUALS("NOT_EQUALS"),
    @JsonbProperty("MISSING")
    MISSING("MISSING"),
    @JsonbProperty("CONTAINS")
    CONTAINS("CONTAINS");

    private String value;

    JsonPointerOperator(final String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    @Override
    public String asJson() {
        return "\"" + toString() + "\"";
    }
}
