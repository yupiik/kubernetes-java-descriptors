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

public class io.k8s.api.networking.v1.NetworkPolicyIngressRule implements Validable<io.k8s.api.networking.v1.NetworkPolicyIngressRule>, Exportable {
    private List<NetworkPolicyPeer> from;
    private List<NetworkPolicyPort> ports;

    public io.k8s.api.networking.v1.NetworkPolicyIngressRule() {
        // no-op
    }

    public io.k8s.api.networking.v1.NetworkPolicyIngressRule(final List<NetworkPolicyPeer> from,
                                                             final List<NetworkPolicyPort> ports) {
        this.from = from;
        this.ports = ports;
    }

    public List<NetworkPolicyPeer> getFrom() {
        return from;
    }

    public void setFrom(final List<NetworkPolicyPeer> from) {
        this.from = from;
    }

    public List<NetworkPolicyPort> getPorts() {
        return ports;
    }

    public void setPorts(final List<NetworkPolicyPort> ports) {
        this.ports = ports;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                from,
                ports);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.networking.v1.NetworkPolicyIngressRule)) {
            return false;
        }
        final io.k8s.api.networking.v1.NetworkPolicyIngressRule __otherCasted = (io.k8s.api.networking.v1.NetworkPolicyIngressRule) __other;
        return Objects.equals(from, __otherCasted.from) &&
            Objects.equals(ports, __otherCasted.ports);
    }

    public io.k8s.api.networking.v1.NetworkPolicyIngressRule from(final List<NetworkPolicyPeer> from) {
        this.from = from;
        return this;
    }

    public io.k8s.api.networking.v1.NetworkPolicyIngressRule ports(final List<NetworkPolicyPort> ports) {
        this.ports = ports;
        return this;
    }

    @Override
    public io.k8s.api.networking.v1.NetworkPolicyIngressRule validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (from != null ? "\"from\":" + from.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (ports != null ? "\"ports\":" + ports.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
