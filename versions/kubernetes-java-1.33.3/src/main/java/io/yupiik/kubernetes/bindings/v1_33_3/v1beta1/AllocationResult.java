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
package io.yupiik.kubernetes.bindings.v1_33_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_33_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_3.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AllocationResult implements Validable<AllocationResult>, Exportable {
    private DeviceAllocationResult devices;
    private NodeSelector nodeSelector;

    public AllocationResult() {
        // no-op
    }

    public AllocationResult(final DeviceAllocationResult devices,
                            final NodeSelector nodeSelector) {
        this.devices = devices;
        this.nodeSelector = nodeSelector;
    }

    public DeviceAllocationResult getDevices() {
        return devices;
    }

    public void setDevices(final DeviceAllocationResult devices) {
        this.devices = devices;
    }

    public NodeSelector getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(final NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                devices,
                nodeSelector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AllocationResult)) {
            return false;
        }
        final AllocationResult __otherCasted = (AllocationResult) __other;
        return Objects.equals(devices, __otherCasted.devices) &&
            Objects.equals(nodeSelector, __otherCasted.nodeSelector);
    }

    public AllocationResult devices(final DeviceAllocationResult devices) {
        this.devices = devices;
        return this;
    }

    public AllocationResult nodeSelector(final NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    @Override
    public AllocationResult validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (devices != null ? "\"devices\":" + devices.asJson() : ""),
                    (nodeSelector != null ? "\"nodeSelector\":" + nodeSelector.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
