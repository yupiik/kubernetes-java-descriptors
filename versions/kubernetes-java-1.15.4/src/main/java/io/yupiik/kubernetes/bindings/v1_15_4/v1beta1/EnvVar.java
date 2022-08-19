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
package io.yupiik.kubernetes.bindings.v1_15_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_15_4.Validable;
import io.yupiik.kubernetes.bindings.v1_15_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EnvVar implements Validable<EnvVar>, Exportable {
    private String name;
    private String value;
    private EnvVarSource valueFrom;

    public EnvVar() {
        // no-op
    }

    public EnvVar(final String name,
                  final String value,
                  final EnvVarSource valueFrom) {
        this.name = name;
        this.value = value;
        this.valueFrom = valueFrom;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public EnvVarSource getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final EnvVarSource valueFrom) {
        this.valueFrom = valueFrom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                value,
                valueFrom);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EnvVar)) {
            return false;
        }
        final EnvVar __otherCasted = (EnvVar) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }

    public EnvVar name(final String name) {
        this.name = name;
        return this;
    }

    public EnvVar value(final String value) {
        this.value = value;
        return this;
    }

    public EnvVar valueFrom(final EnvVarSource valueFrom) {
        this.valueFrom = valueFrom;
        return this;
    }

    @Override
    public EnvVar validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (value != null ? "\"value\":\"" +  JsonStrings.escapeJson(value) + "\"" : ""),
                    (valueFrom != null ? "\"valueFrom\":" + valueFrom.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
