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
package io.yupiik.kubernetes.bindings.v1_19_4.v1;

import io.yupiik.kubernetes.bindings.v1_19_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_19_4.Validable;
import io.yupiik.kubernetes.bindings.v1_19_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServicePort implements Validable<ServicePort>, Exportable {
    private String appProtocol;
    private String name;
    private Integer nodePort;
    private int port;
    private String protocol;
    private String targetPort;

    public ServicePort() {
        // no-op
    }

    public ServicePort(final String appProtocol,
                       final String name,
                       final Integer nodePort,
                       final int port,
                       final String protocol,
                       final String targetPort) {
        // no-op
    }

    public String getAppProtocol() {
        return appProtocol;
    }

    public void setAppProtocol(final String appProtocol) {
        this.appProtocol = appProtocol;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getNodePort() {
        return nodePort;
    }

    public void setNodePort(final Integer nodePort) {
        this.nodePort = nodePort;
    }

    public int getPort() {
        return port;
    }

    public void setPort(final int port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(final String protocol) {
        this.protocol = protocol;
    }

    public String getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(final String targetPort) {
        this.targetPort = targetPort;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                appProtocol,
                name,
                nodePort,
                port,
                protocol,
                targetPort);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServicePort)) {
            return false;
        }
        final ServicePort __otherCasted = (ServicePort) __other;
        return Objects.equals(appProtocol, __otherCasted.appProtocol) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nodePort, __otherCasted.nodePort) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol) &&
            Objects.equals(targetPort, __otherCasted.targetPort);
    }

    public ServicePort appProtocol(final String appProtocol) {
        this.appProtocol = appProtocol;
        return this;
    }

    public ServicePort name(final String name) {
        this.name = name;
        return this;
    }

    public ServicePort nodePort(final Integer nodePort) {
        this.nodePort = nodePort;
        return this;
    }

    public ServicePort port(final int port) {
        this.port = port;
        return this;
    }

    public ServicePort protocol(final String protocol) {
        this.protocol = protocol;
        return this;
    }

    public ServicePort targetPort(final String targetPort) {
        this.targetPort = targetPort;
        return this;
    }

    @Override
    public ServicePort validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (appProtocol != null ? "\"appProtocol\":\"" +  JsonStrings.escapeJson(appProtocol) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (nodePort != null ? "\"nodePort\":" + nodePort : ""),
                    "\"port\":" + port,
                    (protocol != null ? "\"protocol\":\"" +  JsonStrings.escapeJson(protocol) + "\"" : ""),
                    (targetPort != null ? "\"targetPort\":\"" +  JsonStrings.escapeJson(targetPort) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
