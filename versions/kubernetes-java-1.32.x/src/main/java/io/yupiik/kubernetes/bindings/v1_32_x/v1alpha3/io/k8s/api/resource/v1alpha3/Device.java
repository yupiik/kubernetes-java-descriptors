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
import io.yupiik.kubernetes.bindings.v1_32_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_x.Validable;
import io.yupiik.kubernetes.bindings.v1_32_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.resource.v1alpha3.Device implements Validable<io.k8s.api.resource.v1alpha3.Device>, Exportable {
    private BasicDevice basic;
    private String name;

    public io.k8s.api.resource.v1alpha3.Device() {
        // no-op
    }

    public io.k8s.api.resource.v1alpha3.Device(final BasicDevice basic,
                                               final String name) {
        this.basic = basic;
        this.name = name;
    }

    public BasicDevice getBasic() {
        return basic;
    }

    public void setBasic(final BasicDevice basic) {
        this.basic = basic;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                basic,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.resource.v1alpha3.Device)) {
            return false;
        }
        final io.k8s.api.resource.v1alpha3.Device __otherCasted = (io.k8s.api.resource.v1alpha3.Device) __other;
        return Objects.equals(basic, __otherCasted.basic) &&
            Objects.equals(name, __otherCasted.name);
    }

    public io.k8s.api.resource.v1alpha3.Device basic(final BasicDevice basic) {
        this.basic = basic;
        return this;
    }

    public io.k8s.api.resource.v1alpha3.Device name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public io.k8s.api.resource.v1alpha3.Device validate() {
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
                    (basic != null ? "\"basic\":" + basic.asJson() : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
