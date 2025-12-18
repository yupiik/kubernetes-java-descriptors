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
import io.yupiik.kubernetes.bindings.v1_31_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.resource.v1alpha3.DeviceClaim implements Validable<io.k8s.api.resource.v1alpha3.DeviceClaim>, Exportable {
    private List<DeviceClaimConfiguration> config;
    private List<DeviceConstraint> constraints;
    private List<DeviceRequest> requests;

    public io.k8s.api.resource.v1alpha3.DeviceClaim() {
        // no-op
    }

    public io.k8s.api.resource.v1alpha3.DeviceClaim(final List<DeviceClaimConfiguration> config,
                                                    final List<DeviceConstraint> constraints,
                                                    final List<DeviceRequest> requests) {
        this.config = config;
        this.constraints = constraints;
        this.requests = requests;
    }

    public List<DeviceClaimConfiguration> getConfig() {
        return config;
    }

    public void setConfig(final List<DeviceClaimConfiguration> config) {
        this.config = config;
    }

    public List<DeviceConstraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(final List<DeviceConstraint> constraints) {
        this.constraints = constraints;
    }

    public List<DeviceRequest> getRequests() {
        return requests;
    }

    public void setRequests(final List<DeviceRequest> requests) {
        this.requests = requests;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                config,
                constraints,
                requests);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.resource.v1alpha3.DeviceClaim)) {
            return false;
        }
        final io.k8s.api.resource.v1alpha3.DeviceClaim __otherCasted = (io.k8s.api.resource.v1alpha3.DeviceClaim) __other;
        return Objects.equals(config, __otherCasted.config) &&
            Objects.equals(constraints, __otherCasted.constraints) &&
            Objects.equals(requests, __otherCasted.requests);
    }

    public io.k8s.api.resource.v1alpha3.DeviceClaim config(final List<DeviceClaimConfiguration> config) {
        this.config = config;
        return this;
    }

    public io.k8s.api.resource.v1alpha3.DeviceClaim constraints(final List<DeviceConstraint> constraints) {
        this.constraints = constraints;
        return this;
    }

    public io.k8s.api.resource.v1alpha3.DeviceClaim requests(final List<DeviceRequest> requests) {
        this.requests = requests;
        return this;
    }

    @Override
    public io.k8s.api.resource.v1alpha3.DeviceClaim validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (config != null ? "\"config\":" + config.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (constraints != null ? "\"constraints\":" + constraints.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (requests != null ? "\"requests\":" + requests.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
