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
package io.yupiik.kubernetes.bindings.v1_32_x.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_32_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.resource.v1alpha3.DeviceAllocationResult implements Validable<io.k8s.api.resource.v1alpha3.DeviceAllocationResult>, Exportable {
    private List<DeviceAllocationConfiguration> config;
    private List<DeviceRequestAllocationResult> results;

    public io.k8s.api.resource.v1alpha3.DeviceAllocationResult() {
        // no-op
    }

    public io.k8s.api.resource.v1alpha3.DeviceAllocationResult(final List<DeviceAllocationConfiguration> config,
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
        if (!(__other instanceof io.k8s.api.resource.v1alpha3.DeviceAllocationResult)) {
            return false;
        }
        final io.k8s.api.resource.v1alpha3.DeviceAllocationResult __otherCasted = (io.k8s.api.resource.v1alpha3.DeviceAllocationResult) __other;
        return Objects.equals(config, __otherCasted.config) &&
            Objects.equals(results, __otherCasted.results);
    }

    public io.k8s.api.resource.v1alpha3.DeviceAllocationResult config(final List<DeviceAllocationConfiguration> config) {
        this.config = config;
        return this;
    }

    public io.k8s.api.resource.v1alpha3.DeviceAllocationResult results(final List<DeviceRequestAllocationResult> results) {
        this.results = results;
        return this;
    }

    @Override
    public io.k8s.api.resource.v1alpha3.DeviceAllocationResult validate() {
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
