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
package io.yupiik.kubernetes.bindings.v1_32_0.v1;

import io.yupiik.kubernetes.bindings.v1_32_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_0.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IngressLoadBalancerIngress implements Validable<IngressLoadBalancerIngress>, Exportable {
    private String hostname;
    private String ip;
    private List<IngressPortStatus> ports;

    public IngressLoadBalancerIngress() {
        // no-op
    }

    public IngressLoadBalancerIngress(final String hostname,
                                      final String ip,
                                      final List<IngressPortStatus> ports) {
        this.hostname = hostname;
        this.ip = ip;
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

    public List<IngressPortStatus> getPorts() {
        return ports;
    }

    public void setPorts(final List<IngressPortStatus> ports) {
        this.ports = ports;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hostname,
                ip,
                ports);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressLoadBalancerIngress)) {
            return false;
        }
        final IngressLoadBalancerIngress __otherCasted = (IngressLoadBalancerIngress) __other;
        return Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(ip, __otherCasted.ip) &&
            Objects.equals(ports, __otherCasted.ports);
    }

    public IngressLoadBalancerIngress hostname(final String hostname) {
        this.hostname = hostname;
        return this;
    }

    public IngressLoadBalancerIngress ip(final String ip) {
        this.ip = ip;
        return this;
    }

    public IngressLoadBalancerIngress ports(final List<IngressPortStatus> ports) {
        this.ports = ports;
        return this;
    }

    @Override
    public IngressLoadBalancerIngress validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (hostname != null ? "\"hostname\":\"" +  JsonStrings.escapeJson(hostname) + "\"" : ""),
                    (ip != null ? "\"ip\":\"" +  JsonStrings.escapeJson(ip) + "\"" : ""),
                    (ports != null ? "\"ports\":" + ports.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
