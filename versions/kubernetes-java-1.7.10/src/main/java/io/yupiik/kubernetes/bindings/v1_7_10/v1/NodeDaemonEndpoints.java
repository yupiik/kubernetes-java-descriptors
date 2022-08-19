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
package io.yupiik.kubernetes.bindings.v1_7_10.v1;

import io.yupiik.kubernetes.bindings.v1_7_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_10.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeDaemonEndpoints implements Validable<NodeDaemonEndpoints>, Exportable {
    private DaemonEndpoint kubeletEndpoint;

    public NodeDaemonEndpoints() {
        // no-op
    }

    public NodeDaemonEndpoints(final DaemonEndpoint kubeletEndpoint) {
        this.kubeletEndpoint = kubeletEndpoint;
    }

    public DaemonEndpoint getKubeletEndpoint() {
        return kubeletEndpoint;
    }

    public void setKubeletEndpoint(final DaemonEndpoint kubeletEndpoint) {
        this.kubeletEndpoint = kubeletEndpoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                kubeletEndpoint);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeDaemonEndpoints)) {
            return false;
        }
        final NodeDaemonEndpoints __otherCasted = (NodeDaemonEndpoints) __other;
        return Objects.equals(kubeletEndpoint, __otherCasted.kubeletEndpoint);
    }

    public NodeDaemonEndpoints kubeletEndpoint(final DaemonEndpoint kubeletEndpoint) {
        this.kubeletEndpoint = kubeletEndpoint;
        return this;
    }

    @Override
    public NodeDaemonEndpoints validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (kubeletEndpoint != null ? "\"kubeletEndpoint\":" + kubeletEndpoint.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
