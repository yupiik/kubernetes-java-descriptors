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
package io.yupiik.kubernetes.bindings.v1_21_8.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_8.Validable;
import io.yupiik.kubernetes.bindings.v1_21_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ConfigMapKeySelector implements Validable<ConfigMapKeySelector>, Exportable {
    private String key;
    private String name;
    private Boolean optional;

    public ConfigMapKeySelector() {
        // no-op
    }

    public ConfigMapKeySelector(final String key,
                                final String name,
                                final Boolean optional) {
        this.key = key;
        this.name = name;
        this.optional = optional;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                key,
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ConfigMapKeySelector)) {
            return false;
        }
        final ConfigMapKeySelector __otherCasted = (ConfigMapKeySelector) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }

    public ConfigMapKeySelector key(final String key) {
        this.key = key;
        return this;
    }

    public ConfigMapKeySelector name(final String name) {
        this.name = name;
        return this;
    }

    public ConfigMapKeySelector optional(final Boolean optional) {
        this.optional = optional;
        return this;
    }

    @Override
    public ConfigMapKeySelector validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (key == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "key", "key",
                "Missing 'key' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (key != null ? "\"key\":\"" +  JsonStrings.escapeJson(key) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (optional != null ? "\"optional\":" + optional : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
