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
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.LoadBalancerIngress implements Validable<io.k8s.api.core.v1.LoadBalancerIngress>, Exportable {
    private String hostname;
    private String ip;
    private String ipMode;
    private List<PortStatus> ports;

    public io.k8s.api.core.v1.LoadBalancerIngress() {
        // no-op
    }

    public io.k8s.api.core.v1.LoadBalancerIngress(final String hostname,
                                                  final String ip,
                                                  final String ipMode,
                                                  final List<PortStatus> ports) {
        this.hostname = hostname;
        this.ip = ip;
        this.ipMode = ipMode;
        this.ports = ports;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(final String hostname) {
        this.hostname = hostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(final String ip) {
        this.ip = ip;
    }

    public String getIpMode() {
        return ipMode;
    }

    public void setIpMode(final String ipMode) {
        this.ipMode = ipMode;
    }

    public List<PortStatus> getPorts() {
        return ports;
    }

    public void setPorts(final List<PortStatus> ports) {
        this.ports = ports;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hostname,
                ip,
                ipMode,
                ports);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.LoadBalancerIngress)) {
            return false;
        }
        final io.k8s.api.core.v1.LoadBalancerIngress __otherCasted = (io.k8s.api.core.v1.LoadBalancerIngress) __other;
        return Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(ip, __otherCasted.ip) &&
            Objects.equals(ipMode, __otherCasted.ipMode) &&
            Objects.equals(ports, __otherCasted.ports);
    }

    public io.k8s.api.core.v1.LoadBalancerIngress hostname(final String hostname) {
        this.hostname = hostname;
        return this;
    }

    public io.k8s.api.core.v1.LoadBalancerIngress ip(final String ip) {
        this.ip = ip;
        return this;
    }

    public io.k8s.api.core.v1.LoadBalancerIngress ipMode(final String ipMode) {
        this.ipMode = ipMode;
        return this;
    }

    public io.k8s.api.core.v1.LoadBalancerIngress ports(final List<PortStatus> ports) {
        this.ports = ports;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.LoadBalancerIngress validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (hostname != null ? "\"hostname\":\"" +  JsonStrings.escapeJson(hostname) + "\"" : ""),
                    (ip != null ? "\"ip\":\"" +  JsonStrings.escapeJson(ip) + "\"" : ""),
                    (ipMode != null ? "\"ipMode\":\"" +  JsonStrings.escapeJson(ipMode) + "\"" : ""),
                    (ports != null ? "\"ports\":" + ports.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
