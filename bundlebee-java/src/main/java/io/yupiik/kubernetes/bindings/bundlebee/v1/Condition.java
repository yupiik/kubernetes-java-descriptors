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
package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;
import io.yupiik.kubernetes.bindings.bundlebee.JsonStrings;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import jakarta.json.bind.annotation.JsonbProperty;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Condition implements Validable<Condition>, Exportable {
    private String key;
    private Boolean negate;
    private ConditionType type;
    private String value;

    public Condition() {
        // no-op
    }

    public Condition(final String key,
                     final Boolean negate,
                     final ConditionType type,
                     final String value) {
        this.key = key;
        this.negate = negate;
        this.type = type;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public Boolean getNegate() {
        return negate;
    }

    public void setNegate(final Boolean negate) {
        this.negate = negate;
    }

    public ConditionType getType() {
        return type;
    }

    public void setType(final ConditionType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                key,
                negate,
                type,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Condition)) {
            return false;
        }
        final Condition __otherCasted = (Condition) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(negate, __otherCasted.negate) &&
            Objects.equals(type, __otherCasted.type) &&
            Objects.equals(value, __otherCasted.value);
    }

    public Condition key(final String key) {
        this.key = key;
        return this;
    }

    public Condition negate(final Boolean negate) {
        this.negate = negate;
        return this;
    }

    public Condition type(final ConditionType type) {
        this.type = type;
        return this;
    }

    public Condition value(final String value) {
        this.value = value;
        return this;
    }

    @Override
    public Condition validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (key != null ? "\"key\":\"" +  JsonStrings.escapeJson(key) + "\"" : ""),
                    (negate != null ? "\"negate\":" + negate : ""),
                    (type != null ? "\"type\":" + type.asJson() : ""),
                    (value != null ? "\"value\":\"" +  JsonStrings.escapeJson(value) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
