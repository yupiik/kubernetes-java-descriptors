/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
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
package io.yupiik.kubernetes.bindings.v1_8_14.v1beta1;

import io.yupiik.kubernetes.bindings.v1_8_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_14.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NetworkPolicyEgressRule implements Validable<NetworkPolicyEgressRule>, Exportable {
    private List<NetworkPolicyPort> ports;
    private List<NetworkPolicyPeer> to;

    public NetworkPolicyEgressRule() {
        // no-op
    }

    public NetworkPolicyEgressRule(final List<NetworkPolicyPort> ports,
                                   final List<NetworkPolicyPeer> to) {
        this.ports = ports;
        this.to = to;
    }

    public List<NetworkPolicyPort> getPorts() {
        return ports;
    }

    public void setPorts(final List<NetworkPolicyPort> ports) {
        this.ports = ports;
    }

    public List<NetworkPolicyPeer> getTo() {
        return to;
    }

    public void setTo(final List<NetworkPolicyPeer> to) {
        this.to = to;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ports,
                to);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyEgressRule)) {
            return false;
        }
        final NetworkPolicyEgressRule __otherCasted = (NetworkPolicyEgressRule) __other;
        return Objects.equals(ports, __otherCasted.ports) &&
            Objects.equals(to, __otherCasted.to);
    }

    public NetworkPolicyEgressRule ports(final List<NetworkPolicyPort> ports) {
        this.ports = ports;
        return this;
    }

    public NetworkPolicyEgressRule to(final List<NetworkPolicyPeer> to) {
        this.to = to;
        return this;
    }

    @Override
    public NetworkPolicyEgressRule validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (ports != null ? "\"ports\":" + ports.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (to != null ? "\"to\":" + to.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
