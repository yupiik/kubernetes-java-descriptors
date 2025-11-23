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
package io.yupiik.kubernetes.bindings.v1_33_0.v1beta2;

import io.yupiik.kubernetes.bindings.v1_33_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_0.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceAllocationResult implements Validable<DeviceAllocationResult>, Exportable {
    private List<DeviceAllocationConfiguration> config;
    private List<DeviceRequestAllocationResult> results;

    public DeviceAllocationResult() {
        // no-op
    }

    public DeviceAllocationResult(final List<DeviceAllocationConfiguration> config,
                                  final List<DeviceRequestAllocationResult> results) {
        this.config = config;
        this.results = results;
    }

    public List<DeviceAllocationConfiguration> getConfig() {
        return config;
    }

    public void setConfig(final List<DeviceAllocationConfiguration> config) {
        this.config = config;
    }

    public List<DeviceRequestAllocationResult> getResults() {
        return results;
    }

    public void setResults(final List<DeviceRequestAllocationResult> results) {
        this.results = results;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                config,
                results);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceAllocationResult)) {
            return false;
        }
        final DeviceAllocationResult __otherCasted = (DeviceAllocationResult) __other;
        return Objects.equals(config, __otherCasted.config) &&
            Objects.equals(results, __otherCasted.results);
    }

    public DeviceAllocationResult config(final List<DeviceAllocationConfiguration> config) {
        this.config = config;
        return this;
    }

    public DeviceAllocationResult results(final List<DeviceRequestAllocationResult> results) {
        this.results = results;
        return this;
    }

    @Override
    public DeviceAllocationResult validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (config != null ? "\"config\":" + config.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (results != null ? "\"results\":" + results.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
