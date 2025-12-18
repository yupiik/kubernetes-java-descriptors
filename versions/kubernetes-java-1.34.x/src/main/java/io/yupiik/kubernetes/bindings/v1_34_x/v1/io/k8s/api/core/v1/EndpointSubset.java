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
package io.yupiik.kubernetes.bindings.v1_34_x.v1;

import io.yupiik.kubernetes.bindings.v1_34_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.EndpointSubset implements Validable<io.k8s.api.core.v1.EndpointSubset>, Exportable {
    private List<EndpointAddress> addresses;
    private List<EndpointAddress> notReadyAddresses;
    private List<EndpointPort> ports;

    public io.k8s.api.core.v1.EndpointSubset() {
        // no-op
    }

    public io.k8s.api.core.v1.EndpointSubset(final List<EndpointAddress> addresses,
                                             final List<EndpointAddress> notReadyAddresses,
                                             final List<EndpointPort> ports) {
        this.addresses = addresses;
        this.notReadyAddresses = notReadyAddresses;
        this.ports = ports;
    }

    public List<EndpointAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(final List<EndpointAddress> addresses) {
        this.addresses = addresses;
    }

    public List<EndpointAddress> getNotReadyAddresses() {
        return notReadyAddresses;
    }

    public void setNotReadyAddresses(final List<EndpointAddress> notReadyAddresses) {
        this.notReadyAddresses = notReadyAddresses;
    }

    public List<EndpointPort> getPorts() {
        return ports;
    }

    public void setPorts(final List<EndpointPort> ports) {
        this.ports = ports;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                addresses,
                notReadyAddresses,
                ports);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.EndpointSubset)) {
            return false;
        }
        final io.k8s.api.core.v1.EndpointSubset __otherCasted = (io.k8s.api.core.v1.EndpointSubset) __other;
        return Objects.equals(addresses, __otherCasted.addresses) &&
            Objects.equals(notReadyAddresses, __otherCasted.notReadyAddresses) &&
            Objects.equals(ports, __otherCasted.ports);
    }

    public io.k8s.api.core.v1.EndpointSubset addresses(final List<EndpointAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public io.k8s.api.core.v1.EndpointSubset notReadyAddresses(final List<EndpointAddress> notReadyAddresses) {
        this.notReadyAddresses = notReadyAddresses;
        return this;
    }

    public io.k8s.api.core.v1.EndpointSubset ports(final List<EndpointPort> ports) {
        this.ports = ports;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.EndpointSubset validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (addresses != null ? "\"addresses\":" + addresses.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (notReadyAddresses != null ? "\"notReadyAddresses\":" + notReadyAddresses.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (ports != null ? "\"ports\":" + ports.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
