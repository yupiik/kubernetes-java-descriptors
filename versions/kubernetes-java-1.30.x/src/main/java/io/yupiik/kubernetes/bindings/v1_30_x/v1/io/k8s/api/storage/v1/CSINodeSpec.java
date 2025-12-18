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
package io.yupiik.kubernetes.bindings.v1_30_x.v1;

import io.yupiik.kubernetes.bindings.v1_30_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_x.Validable;
import io.yupiik.kubernetes.bindings.v1_30_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.storage.v1.CSINodeSpec implements Validable<io.k8s.api.storage.v1.CSINodeSpec>, Exportable {
    private List<CSINodeDriver> drivers;

    public io.k8s.api.storage.v1.CSINodeSpec() {
        // no-op
    }

    public io.k8s.api.storage.v1.CSINodeSpec(final List<CSINodeDriver> drivers) {
        this.drivers = drivers;
    }

    public List<CSINodeDriver> getDrivers() {
        return drivers;
    }

    public void setDrivers(final List<CSINodeDriver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                drivers);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.storage.v1.CSINodeSpec)) {
            return false;
        }
        final io.k8s.api.storage.v1.CSINodeSpec __otherCasted = (io.k8s.api.storage.v1.CSINodeSpec) __other;
        return Objects.equals(drivers, __otherCasted.drivers);
    }

    public io.k8s.api.storage.v1.CSINodeSpec drivers(final List<CSINodeDriver> drivers) {
        this.drivers = drivers;
        return this;
    }

    @Override
    public io.k8s.api.storage.v1.CSINodeSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (drivers == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "drivers", "drivers",
                "Missing 'drivers' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (drivers != null ? "\"drivers\":" + drivers.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
