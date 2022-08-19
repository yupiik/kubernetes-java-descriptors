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
package io.yupiik.kubernetes.bindings.v1_12_5.v1beta2;

import io.yupiik.kubernetes.bindings.v1_12_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_12_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_12_5.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ConfigMapProjection implements Validable<ConfigMapProjection>, Exportable {
    private List<KeyToPath> items;
    private String name;
    private Boolean optional;

    public ConfigMapProjection() {
        // no-op
    }

    public ConfigMapProjection(final List<KeyToPath> items,
                               final String name,
                               final Boolean optional) {
        this.items = items;
        this.name = name;
        this.optional = optional;
    }

    public List<KeyToPath> getItems() {
        return items;
    }

    public void setItems(final List<KeyToPath> items) {
        this.items = items;
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
                items,
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ConfigMapProjection)) {
            return false;
        }
        final ConfigMapProjection __otherCasted = (ConfigMapProjection) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }

    public ConfigMapProjection items(final List<KeyToPath> items) {
        this.items = items;
        return this;
    }

    public ConfigMapProjection name(final String name) {
        this.name = name;
        return this;
    }

    public ConfigMapProjection optional(final Boolean optional) {
        this.optional = optional;
        return this;
    }

    @Override
    public ConfigMapProjection validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (items != null ? "\"items\":" + items.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (optional != null ? "\"optional\":" + optional : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
