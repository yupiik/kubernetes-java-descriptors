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
package io.yupiik.kubernetes.bindings.v1_10_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_10_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_10_1.Validable;
import io.yupiik.kubernetes.bindings.v1_10_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NetworkPolicyPort implements Validable<NetworkPolicyPort>, Exportable {
    private String port;
    private String protocol;

    public NetworkPolicyPort() {
        // no-op
    }

    public NetworkPolicyPort(final String port,
                             final String protocol) {
        // no-op
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
                port,
                protocol);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyPort)) {
            return false;
        }
        final NetworkPolicyPort __otherCasted = (NetworkPolicyPort) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }

    public NetworkPolicyPort port(final String port) {
        this.port = port;
        return this;
    }

    public NetworkPolicyPort protocol(final String protocol) {
        this.protocol = protocol;
        return this;
    }

    @Override
    public NetworkPolicyPort validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (port != null ? "\"port\":\"" +  JsonStrings.escapeJson(port) + "\"" : ""),
                    (protocol != null ? "\"protocol\":\"" +  JsonStrings.escapeJson(protocol) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
