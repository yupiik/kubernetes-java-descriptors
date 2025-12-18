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
package io.yupiik.kubernetes.bindings.v1_32_x.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_32_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_x.Validable;
import jakarta.json.JsonObject;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.resource.v1alpha3.BasicDevice implements Validable<io.k8s.api.resource.v1alpha3.BasicDevice>, Exportable {
    private JsonObject attributes;
    private JsonObject capacity;

    public io.k8s.api.resource.v1alpha3.BasicDevice() {
        // no-op
    }

    public io.k8s.api.resource.v1alpha3.BasicDevice(final JsonObject attributes,
                                                    final JsonObject capacity) {
        this.attributes = attributes;
        this.capacity = capacity;
    }

    public JsonObject getAttributes() {
        return attributes;
    }

    public void setAttributes(final JsonObject attributes) {
        this.attributes = attributes;
    }

    public JsonObject getCapacity() {
        return capacity;
    }

    public void setCapacity(final JsonObject capacity) {
        this.capacity = capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                attributes,
                capacity);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.resource.v1alpha3.BasicDevice)) {
            return false;
        }
        final io.k8s.api.resource.v1alpha3.BasicDevice __otherCasted = (io.k8s.api.resource.v1alpha3.BasicDevice) __other;
        return Objects.equals(attributes, __otherCasted.attributes) &&
            Objects.equals(capacity, __otherCasted.capacity);
    }

    public io.k8s.api.resource.v1alpha3.BasicDevice attributes(final JsonObject attributes) {
        this.attributes = attributes;
        return this;
    }

    public io.k8s.api.resource.v1alpha3.BasicDevice capacity(final JsonObject capacity) {
        this.capacity = capacity;
        return this;
    }

    @Override
    public io.k8s.api.resource.v1alpha3.BasicDevice validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (attributes != null ? "\"attributes\":" + attributes : ""),
                    (capacity != null ? "\"capacity\":" + capacity : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
