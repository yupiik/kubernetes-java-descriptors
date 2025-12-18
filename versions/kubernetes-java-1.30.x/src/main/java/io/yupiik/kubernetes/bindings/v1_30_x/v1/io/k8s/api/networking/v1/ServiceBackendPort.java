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
import io.yupiik.kubernetes.bindings.v1_30_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.networking.v1.ServiceBackendPort implements Validable<io.k8s.api.networking.v1.ServiceBackendPort>, Exportable {
    private String name;
    private Integer number;

    public io.k8s.api.networking.v1.ServiceBackendPort() {
        // no-op
    }

    public io.k8s.api.networking.v1.ServiceBackendPort(final String name,
                                                       final Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(final Integer number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                number);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.networking.v1.ServiceBackendPort)) {
            return false;
        }
        final io.k8s.api.networking.v1.ServiceBackendPort __otherCasted = (io.k8s.api.networking.v1.ServiceBackendPort) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(number, __otherCasted.number);
    }

    public io.k8s.api.networking.v1.ServiceBackendPort name(final String name) {
        this.name = name;
        return this;
    }

    public io.k8s.api.networking.v1.ServiceBackendPort number(final Integer number) {
        this.number = number;
        return this;
    }

    @Override
    public io.k8s.api.networking.v1.ServiceBackendPort validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (number != null ? "\"number\":" + number : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
