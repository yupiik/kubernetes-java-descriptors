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
package io.yupiik.kubernetes.bindings.v1_31_x.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_31_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_x.Validable;
import io.yupiik.kubernetes.bindings.v1_31_x.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.resource.v1alpha3.OpaqueDeviceConfiguration implements Validable<io.k8s.api.resource.v1alpha3.OpaqueDeviceConfiguration>, Exportable {
    private String driver;
    private JsonObject parameters;

    public io.k8s.api.resource.v1alpha3.OpaqueDeviceConfiguration() {
        // no-op
    }

    public io.k8s.api.resource.v1alpha3.OpaqueDeviceConfiguration(final String driver,
                                                                  final JsonObject parameters) {
        this.driver = driver;
        this.parameters = parameters;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(final String driver) {
        this.driver = driver;
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
                driver,
                parameters);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.resource.v1alpha3.OpaqueDeviceConfiguration)) {
            return false;
        }
        final io.k8s.api.resource.v1alpha3.OpaqueDeviceConfiguration __otherCasted = (io.k8s.api.resource.v1alpha3.OpaqueDeviceConfiguration) __other;
        return Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(parameters, __otherCasted.parameters);
    }

    public io.k8s.api.resource.v1alpha3.OpaqueDeviceConfiguration driver(final String driver) {
        this.driver = driver;
        return this;
    }

    public io.k8s.api.resource.v1alpha3.OpaqueDeviceConfiguration parameters(final JsonObject parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public io.k8s.api.resource.v1alpha3.OpaqueDeviceConfiguration validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (driver == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "driver", "driver",
                "Missing 'driver' attribute.", true));
        }
        if (parameters == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "parameters", "parameters",
                "Missing 'parameters' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (driver != null ? "\"driver\":\"" +  JsonStrings.escapeJson(driver) + "\"" : ""),
                    (parameters != null ? "\"parameters\":" + parameters : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
