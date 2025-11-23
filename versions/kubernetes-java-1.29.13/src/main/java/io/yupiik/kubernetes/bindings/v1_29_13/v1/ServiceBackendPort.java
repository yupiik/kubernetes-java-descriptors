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
package io.yupiik.kubernetes.bindings.v1_29_13.v1;

import io.yupiik.kubernetes.bindings.v1_29_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_13.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServiceBackendPort implements Validable<ServiceBackendPort>, Exportable {
    private String name;
    private Integer number;

    public ServiceBackendPort() {
        // no-op
    }

    public ServiceBackendPort(final String name,
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
        if (!(__other instanceof ServiceBackendPort)) {
            return false;
        }
        final ServiceBackendPort __otherCasted = (ServiceBackendPort) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(number, __otherCasted.number);
    }

    public ServiceBackendPort name(final String name) {
        this.name = name;
        return this;
    }

    public ServiceBackendPort number(final Integer number) {
        this.number = number;
        return this;
    }

    @Override
    public ServiceBackendPort validate() {
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
