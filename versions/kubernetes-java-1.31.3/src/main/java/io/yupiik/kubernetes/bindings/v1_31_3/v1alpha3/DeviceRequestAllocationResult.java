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
package io.yupiik.kubernetes.bindings.v1_31_3.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_31_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_3.Validable;
import io.yupiik.kubernetes.bindings.v1_31_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceRequestAllocationResult implements Validable<DeviceRequestAllocationResult>, Exportable {
    private String device;
    private String driver;
    private String pool;
    private String request;

    public DeviceRequestAllocationResult() {
        // no-op
    }

    public DeviceRequestAllocationResult(final String device,
                                         final String driver,
                                         final String pool,
                                         final String request) {
        this.device = device;
        this.driver = driver;
        this.pool = pool;
        this.request = request;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(final String device) {
        this.device = device;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(final String driver) {
        this.driver = driver;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(final String pool) {
        this.pool = pool;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(final String request) {
        this.request = request;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                device,
                driver,
                pool,
                request);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceRequestAllocationResult)) {
            return false;
        }
        final DeviceRequestAllocationResult __otherCasted = (DeviceRequestAllocationResult) __other;
        return Objects.equals(device, __otherCasted.device) &&
            Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(pool, __otherCasted.pool) &&
            Objects.equals(request, __otherCasted.request);
    }

    public DeviceRequestAllocationResult device(final String device) {
        this.device = device;
        return this;
    }

    public DeviceRequestAllocationResult driver(final String driver) {
        this.driver = driver;
        return this;
    }

    public DeviceRequestAllocationResult pool(final String pool) {
        this.pool = pool;
        return this;
    }

    public DeviceRequestAllocationResult request(final String request) {
        this.request = request;
        return this;
    }

    @Override
    public DeviceRequestAllocationResult validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (device == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "device", "device",
                "Missing 'device' attribute.", true));
        }
        if (driver == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "driver", "driver",
                "Missing 'driver' attribute.", true));
        }
        if (pool == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "pool", "pool",
                "Missing 'pool' attribute.", true));
        }
        if (request == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "request", "request",
                "Missing 'request' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (device != null ? "\"device\":\"" +  JsonStrings.escapeJson(device) + "\"" : ""),
                    (driver != null ? "\"driver\":\"" +  JsonStrings.escapeJson(driver) + "\"" : ""),
                    (pool != null ? "\"pool\":\"" +  JsonStrings.escapeJson(pool) + "\"" : ""),
                    (request != null ? "\"request\":\"" +  JsonStrings.escapeJson(request) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
