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
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.resource.v1alpha3.ResourceClaimSpec implements Validable<io.k8s.api.resource.v1alpha3.ResourceClaimSpec>, Exportable {
    private String controller;
    private DeviceClaim devices;

    public io.k8s.api.resource.v1alpha3.ResourceClaimSpec() {
        // no-op
    }

    public io.k8s.api.resource.v1alpha3.ResourceClaimSpec(final String controller,
                                                          final DeviceClaim devices) {
        this.controller = controller;
        this.devices = devices;
    }

    public String getController() {
        return controller;
    }

    public void setController(final String controller) {
        this.controller = controller;
    }

    public DeviceClaim getDevices() {
        return devices;
    }

    public void setDevices(final DeviceClaim devices) {
        this.devices = devices;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                controller,
                devices);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.resource.v1alpha3.ResourceClaimSpec)) {
            return false;
        }
        final io.k8s.api.resource.v1alpha3.ResourceClaimSpec __otherCasted = (io.k8s.api.resource.v1alpha3.ResourceClaimSpec) __other;
        return Objects.equals(controller, __otherCasted.controller) &&
            Objects.equals(devices, __otherCasted.devices);
    }

    public io.k8s.api.resource.v1alpha3.ResourceClaimSpec controller(final String controller) {
        this.controller = controller;
        return this;
    }

    public io.k8s.api.resource.v1alpha3.ResourceClaimSpec devices(final DeviceClaim devices) {
        this.devices = devices;
        return this;
    }

    @Override
    public io.k8s.api.resource.v1alpha3.ResourceClaimSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (controller != null ? "\"controller\":\"" +  JsonStrings.escapeJson(controller) + "\"" : ""),
                    (devices != null ? "\"devices\":" + devices.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
