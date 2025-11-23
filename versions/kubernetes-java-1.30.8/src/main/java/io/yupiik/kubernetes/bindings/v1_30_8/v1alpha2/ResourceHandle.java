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
package io.yupiik.kubernetes.bindings.v1_30_8.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_8.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceHandle implements Validable<ResourceHandle>, Exportable {
    private String data;
    private String driverName;
    private StructuredResourceHandle structuredData;

    public ResourceHandle() {
        // no-op
    }

    public ResourceHandle(final String data,
                          final String driverName,
                          final StructuredResourceHandle structuredData) {
        this.data = data;
        this.driverName = driverName;
        this.structuredData = structuredData;
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

    public StructuredResourceHandle getStructuredData() {
        return structuredData;
    }

    public void setStructuredData(final StructuredResourceHandle structuredData) {
        this.structuredData = structuredData;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                data,
                driverName,
                structuredData);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceHandle)) {
            return false;
        }
        final ResourceHandle __otherCasted = (ResourceHandle) __other;
        return Objects.equals(data, __otherCasted.data) &&
            Objects.equals(driverName, __otherCasted.driverName) &&
            Objects.equals(structuredData, __otherCasted.structuredData);
    }

    public ResourceHandle data(final String data) {
        this.data = data;
        return this;
    }

    public ResourceHandle driverName(final String driverName) {
        this.driverName = driverName;
        return this;
    }

    public ResourceHandle structuredData(final StructuredResourceHandle structuredData) {
        this.structuredData = structuredData;
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
                    (driverName != null ? "\"driverName\":\"" +  JsonStrings.escapeJson(driverName) + "\"" : ""),
                    (structuredData != null ? "\"structuredData\":" + structuredData.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
