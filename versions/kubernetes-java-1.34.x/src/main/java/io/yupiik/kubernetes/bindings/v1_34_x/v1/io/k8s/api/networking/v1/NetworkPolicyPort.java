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
import io.yupiik.kubernetes.bindings.v1_34_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.networking.v1.NetworkPolicyPort implements Validable<io.k8s.api.networking.v1.NetworkPolicyPort>, Exportable {
    private Integer endPort;
    private String port;
    private String protocol;

    public io.k8s.api.networking.v1.NetworkPolicyPort() {
        // no-op
    }

    public io.k8s.api.networking.v1.NetworkPolicyPort(final Integer endPort,
                                                      final String port,
                                                      final String protocol) {
        this.endPort = endPort;
        this.port = port;
        this.protocol = protocol;
    }

    public Integer getEndPort() {
        return endPort;
    }

    public void setEndPort(final Integer endPort) {
        this.endPort = endPort;
    }

    public String getPort() {
        return port;
    }

    public void setPort(final String port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(final String protocol) {
        this.protocol = protocol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                endPort,
                port,
                protocol);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.networking.v1.NetworkPolicyPort)) {
            return false;
        }
        final io.k8s.api.networking.v1.NetworkPolicyPort __otherCasted = (io.k8s.api.networking.v1.NetworkPolicyPort) __other;
        return Objects.equals(endPort, __otherCasted.endPort) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }

    public io.k8s.api.networking.v1.NetworkPolicyPort endPort(final Integer endPort) {
        this.endPort = endPort;
        return this;
    }

    public io.k8s.api.networking.v1.NetworkPolicyPort port(final String port) {
        this.port = port;
        return this;
    }

    public io.k8s.api.networking.v1.NetworkPolicyPort protocol(final String protocol) {
        this.protocol = protocol;
        return this;
    }

    @Override
    public io.k8s.api.networking.v1.NetworkPolicyPort validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (endPort != null ? "\"endPort\":" + endPort : ""),
                    (port != null ? "\"port\":\"" +  JsonStrings.escapeJson(port) + "\"" : ""),
                    (protocol != null ? "\"protocol\":\"" +  JsonStrings.escapeJson(protocol) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
