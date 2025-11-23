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
package io.yupiik.kubernetes.bindings.v1_33_0.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_33_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_0.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceClaimStatus implements Validable<ResourceClaimStatus>, Exportable {
    private AllocationResult allocation;
    private List<AllocatedDeviceStatus> devices;
    private List<ResourceClaimConsumerReference> reservedFor;

    public ResourceClaimStatus() {
        // no-op
    }

    public ResourceClaimStatus(final AllocationResult allocation,
                               final List<AllocatedDeviceStatus> devices,
                               final List<ResourceClaimConsumerReference> reservedFor) {
        this.allocation = allocation;
        this.devices = devices;
        this.reservedFor = reservedFor;
    }

    public AllocationResult getAllocation() {
        return allocation;
    }

    public void setAllocation(final AllocationResult allocation) {
        this.allocation = allocation;
    }

    public List<AllocatedDeviceStatus> getDevices() {
        return devices;
    }

    public void setDevices(final List<AllocatedDeviceStatus> devices) {
        this.devices = devices;
    }

    public List<ResourceClaimConsumerReference> getReservedFor() {
        return reservedFor;
    }

    public void setReservedFor(final List<ResourceClaimConsumerReference> reservedFor) {
        this.reservedFor = reservedFor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allocation,
                devices,
                reservedFor);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceClaimStatus)) {
            return false;
        }
        final ResourceClaimStatus __otherCasted = (ResourceClaimStatus) __other;
        return Objects.equals(allocation, __otherCasted.allocation) &&
            Objects.equals(devices, __otherCasted.devices) &&
            Objects.equals(reservedFor, __otherCasted.reservedFor);
    }

    public ResourceClaimStatus allocation(final AllocationResult allocation) {
        this.allocation = allocation;
        return this;
    }

    public ResourceClaimStatus devices(final List<AllocatedDeviceStatus> devices) {
        this.devices = devices;
        return this;
    }

    public ResourceClaimStatus reservedFor(final List<ResourceClaimConsumerReference> reservedFor) {
        this.reservedFor = reservedFor;
        return this;
    }

    @Override
    public ResourceClaimStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (allocation != null ? "\"allocation\":" + allocation.asJson() : ""),
                    (devices != null ? "\"devices\":" + devices.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (reservedFor != null ? "\"reservedFor\":" + reservedFor.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
