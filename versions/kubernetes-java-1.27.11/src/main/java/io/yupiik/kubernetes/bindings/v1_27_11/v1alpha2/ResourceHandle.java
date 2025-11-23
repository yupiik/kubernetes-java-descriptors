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
package io.yupiik.kubernetes.bindings.v1_27_11.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_27_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_11.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceHandle implements Validable<ResourceHandle>, Exportable {
    private String data;
    private String driverName;

    public ResourceHandle() {
        // no-op
    }

    public ResourceHandle(final String data,
                          final String driverName) {
        this.data = data;
        this.driverName = driverName;
    }

    public String getData() {
        return data;
    }

    public void setData(final String data) {
        this.data = data;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(final String driverName) {
        this.driverName = driverName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                data,
                driverName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceHandle)) {
            return false;
        }
        final ResourceHandle __otherCasted = (ResourceHandle) __other;
        return Objects.equals(data, __otherCasted.data) &&
            Objects.equals(driverName, __otherCasted.driverName);
    }

    public ResourceHandle data(final String data) {
        this.data = data;
        return this;
    }

    public ResourceHandle driverName(final String driverName) {
        this.driverName = driverName;
        return this;
    }

    @Override
    public ResourceHandle validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (data != null ? "\"data\":\"" +  JsonStrings.escapeJson(data) + "\"" : ""),
                    (driverName != null ? "\"driverName\":\"" +  JsonStrings.escapeJson(driverName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
