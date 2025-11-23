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
package io.yupiik.kubernetes.bindings.v1_30_9.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_9.Validable;
import jakarta.json.JsonObject;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VendorParameters implements Validable<VendorParameters>, Exportable {
    private String driverName;
    private JsonObject parameters;

    public VendorParameters() {
        // no-op
    }

    public VendorParameters(final String driverName,
                            final JsonObject parameters) {
        this.driverName = driverName;
        this.parameters = parameters;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(final String driverName) {
        this.driverName = driverName;
    }

    public JsonObject getParameters() {
        return parameters;
    }

    public void setParameters(final JsonObject parameters) {
        this.parameters = parameters;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                driverName,
                parameters);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VendorParameters)) {
            return false;
        }
        final VendorParameters __otherCasted = (VendorParameters) __other;
        return Objects.equals(driverName, __otherCasted.driverName) &&
            Objects.equals(parameters, __otherCasted.parameters);
    }

    public VendorParameters driverName(final String driverName) {
        this.driverName = driverName;
        return this;
    }

    public VendorParameters parameters(final JsonObject parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public VendorParameters validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (driverName != null ? "\"driverName\":\"" +  JsonStrings.escapeJson(driverName) + "\"" : ""),
                    (parameters != null ? "\"parameters\":" + parameters : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
