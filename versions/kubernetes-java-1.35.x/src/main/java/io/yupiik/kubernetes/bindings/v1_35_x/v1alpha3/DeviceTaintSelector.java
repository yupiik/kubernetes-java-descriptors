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
package io.yupiik.kubernetes.bindings.v1_35_x.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_35_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_35_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_35_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceTaintSelector implements Validable<DeviceTaintSelector>, Exportable {
    private String device;
    private String driver;
    private String pool;

    public DeviceTaintSelector() {
        // no-op
    }

    public DeviceTaintSelector(final String device,
                               final String driver,
                               final String pool) {
        this.device = device;
        this.driver = driver;
        this.pool = pool;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                device,
                driver,
                pool);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceTaintSelector)) {
            return false;
        }
        final DeviceTaintSelector __otherCasted = (DeviceTaintSelector) __other;
        return Objects.equals(device, __otherCasted.device) &&
            Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(pool, __otherCasted.pool);
    }

    public DeviceTaintSelector device(final String device) {
        this.device = device;
        return this;
    }

    public DeviceTaintSelector driver(final String driver) {
        this.driver = driver;
        return this;
    }

    public DeviceTaintSelector pool(final String pool) {
        this.pool = pool;
        return this;
    }

    @Override
    public DeviceTaintSelector validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (device != null ? "\"device\":\"" +  JsonStrings.escapeJson(device) + "\"" : ""),
                    (driver != null ? "\"driver\":\"" +  JsonStrings.escapeJson(driver) + "\"" : ""),
                    (pool != null ? "\"pool\":\"" +  JsonStrings.escapeJson(pool) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }

    @Override
    public String toString() {
        return asJson();
    }
}
