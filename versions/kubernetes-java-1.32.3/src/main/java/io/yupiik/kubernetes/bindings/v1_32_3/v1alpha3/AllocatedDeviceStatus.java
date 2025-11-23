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
package io.yupiik.kubernetes.bindings.v1_32_3.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_32_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_3.Validable;
import io.yupiik.kubernetes.bindings.v1_32_3.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AllocatedDeviceStatus implements Validable<AllocatedDeviceStatus>, Exportable {
    private List<Condition> conditions;
    private JsonObject data;
    private String device;
    private String driver;
    private NetworkDeviceData networkData;
    private String pool;

    public AllocatedDeviceStatus() {
        // no-op
    }

    public AllocatedDeviceStatus(final List<Condition> conditions,
                                 final JsonObject data,
                                 final String device,
                                 final String driver,
                                 final NetworkDeviceData networkData,
                                 final String pool) {
        this.conditions = conditions;
        this.data = data;
        this.device = device;
        this.driver = driver;
        this.networkData = networkData;
        this.pool = pool;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<Condition> conditions) {
        this.conditions = conditions;
    }

    public JsonObject getData() {
        return data;
    }

    public void setData(final JsonObject data) {
        this.data = data;
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

    public NetworkDeviceData getNetworkData() {
        return networkData;
    }

    public void setNetworkData(final NetworkDeviceData networkData) {
        this.networkData = networkData;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(final String pool) {
        this.pool = pool;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions,
                data,
                device,
                driver,
                networkData,
                pool);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AllocatedDeviceStatus)) {
            return false;
        }
        final AllocatedDeviceStatus __otherCasted = (AllocatedDeviceStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(data, __otherCasted.data) &&
            Objects.equals(device, __otherCasted.device) &&
            Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(networkData, __otherCasted.networkData) &&
            Objects.equals(pool, __otherCasted.pool);
    }

    public AllocatedDeviceStatus conditions(final List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public AllocatedDeviceStatus data(final JsonObject data) {
        this.data = data;
        return this;
    }

    public AllocatedDeviceStatus device(final String device) {
        this.device = device;
        return this;
    }

    public AllocatedDeviceStatus driver(final String driver) {
        this.driver = driver;
        return this;
    }

    public AllocatedDeviceStatus networkData(final NetworkDeviceData networkData) {
        this.networkData = networkData;
        return this;
    }

    public AllocatedDeviceStatus pool(final String pool) {
        this.pool = pool;
        return this;
    }

    @Override
    public AllocatedDeviceStatus validate() {
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
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (data != null ? "\"data\":" + data : ""),
                    (device != null ? "\"device\":\"" +  JsonStrings.escapeJson(device) + "\"" : ""),
                    (driver != null ? "\"driver\":\"" +  JsonStrings.escapeJson(driver) + "\"" : ""),
                    (networkData != null ? "\"networkData\":" + networkData.asJson() : ""),
                    (pool != null ? "\"pool\":\"" +  JsonStrings.escapeJson(pool) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
