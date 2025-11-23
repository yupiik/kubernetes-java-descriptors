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
package io.yupiik.kubernetes.bindings.v1_28_1.v1;

import io.yupiik.kubernetes.bindings.v1_28_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_1.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerPort implements Validable<ContainerPort>, Exportable {
    private int containerPort;
    private String hostIP;
    private Integer hostPort;
    private String name;
    private String protocol;

    public ContainerPort() {
        // no-op
    }

    public ContainerPort(final int containerPort,
                         final String hostIP,
                         final Integer hostPort,
                         final String name,
                         final String protocol) {
        this.containerPort = containerPort;
        this.hostIP = hostIP;
        this.hostPort = hostPort;
        this.name = name;
        this.protocol = protocol;
    }

    public int getContainerPort() {
        return containerPort;
    }

    public void setContainerPort(final int containerPort) {
        this.containerPort = containerPort;
    }

    public String getHostIP() {
        return hostIP;
    }

    public void setHostIP(final String hostIP) {
        this.hostIP = hostIP;
    }

    public Integer getHostPort() {
        return hostPort;
    }

    public void setHostPort(final Integer hostPort) {
        this.hostPort = hostPort;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
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
                containerPort,
                hostIP,
                hostPort,
                name,
                protocol);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerPort)) {
            return false;
        }
        final ContainerPort __otherCasted = (ContainerPort) __other;
        return Objects.equals(containerPort, __otherCasted.containerPort) &&
            Objects.equals(hostIP, __otherCasted.hostIP) &&
            Objects.equals(hostPort, __otherCasted.hostPort) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }

    public ContainerPort containerPort(final int containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    public ContainerPort hostIP(final String hostIP) {
        this.hostIP = hostIP;
        return this;
    }

    public ContainerPort hostPort(final Integer hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    public ContainerPort name(final String name) {
        this.name = name;
        return this;
    }

    public ContainerPort protocol(final String protocol) {
        this.protocol = protocol;
        return this;
    }

    @Override
    public ContainerPort validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"containerPort\":" + containerPort,
                    (hostIP != null ? "\"hostIP\":\"" +  JsonStrings.escapeJson(hostIP) + "\"" : ""),
                    (hostPort != null ? "\"hostPort\":" + hostPort : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (protocol != null ? "\"protocol\":\"" +  JsonStrings.escapeJson(protocol) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
