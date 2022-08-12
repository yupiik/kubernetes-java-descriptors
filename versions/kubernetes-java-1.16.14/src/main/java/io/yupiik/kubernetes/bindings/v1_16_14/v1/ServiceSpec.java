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
package io.yupiik.kubernetes.bindings.v1_16_14.v1;

import io.yupiik.kubernetes.bindings.v1_16_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_14.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_16_14.Validable;
import io.yupiik.kubernetes.bindings.v1_16_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServiceSpec implements Validable<ServiceSpec>, Exportable {
    private String clusterIP;
    private List<String> externalIPs;
    private String externalName;
    private String externalTrafficPolicy;
    private Integer healthCheckNodePort;
    private String ipFamily;
    private String loadBalancerIP;
    private List<String> loadBalancerSourceRanges;
    private List<ServicePort> ports;
    private Boolean publishNotReadyAddresses;
    private Map<String, String> selector;
    private String sessionAffinity;
    private SessionAffinityConfig sessionAffinityConfig;
    private String type;

    public ServiceSpec() {
        // no-op
    }

    public ServiceSpec(final String clusterIP,
                       final List<String> externalIPs,
                       final String externalName,
                       final String externalTrafficPolicy,
                       final Integer healthCheckNodePort,
                       final String ipFamily,
                       final String loadBalancerIP,
                       final List<String> loadBalancerSourceRanges,
                       final List<ServicePort> ports,
                       final Boolean publishNotReadyAddresses,
                       final Map<String, String> selector,
                       final String sessionAffinity,
                       final SessionAffinityConfig sessionAffinityConfig,
                       final String type) {
        // no-op
    }

    public String getClusterIP() {
        return clusterIP;
    }

    public void setClusterIP(final String clusterIP) {
        this.clusterIP = clusterIP;
    }

    public List<String> getExternalIPs() {
        return externalIPs;
    }

    public void setExternalIPs(final List<String> externalIPs) {
        this.externalIPs = externalIPs;
    }

    public String getExternalName() {
        return externalName;
    }

    public void setExternalName(final String externalName) {
        this.externalName = externalName;
    }

    public String getExternalTrafficPolicy() {
        return externalTrafficPolicy;
    }

    public void setExternalTrafficPolicy(final String externalTrafficPolicy) {
        this.externalTrafficPolicy = externalTrafficPolicy;
    }

    public Integer getHealthCheckNodePort() {
        return healthCheckNodePort;
    }

    public void setHealthCheckNodePort(final Integer healthCheckNodePort) {
        this.healthCheckNodePort = healthCheckNodePort;
    }

    public String getIpFamily() {
        return ipFamily;
    }

    public void setIpFamily(final String ipFamily) {
        this.ipFamily = ipFamily;
    }

    public String getLoadBalancerIP() {
        return loadBalancerIP;
    }

    public void setLoadBalancerIP(final String loadBalancerIP) {
        this.loadBalancerIP = loadBalancerIP;
    }

    public List<String> getLoadBalancerSourceRanges() {
        return loadBalancerSourceRanges;
    }

    public void setLoadBalancerSourceRanges(final List<String> loadBalancerSourceRanges) {
        this.loadBalancerSourceRanges = loadBalancerSourceRanges;
    }

    public List<ServicePort> getPorts() {
        return ports;
    }

    public void setPorts(final List<ServicePort> ports) {
        this.ports = ports;
    }

    public Boolean getPublishNotReadyAddresses() {
        return publishNotReadyAddresses;
    }

    public void setPublishNotReadyAddresses(final Boolean publishNotReadyAddresses) {
        this.publishNotReadyAddresses = publishNotReadyAddresses;
    }

    public Map<String, String> getSelector() {
        return selector;
    }

    public void setSelector(final Map<String, String> selector) {
        this.selector = selector;
    }

    public String getSessionAffinity() {
        return sessionAffinity;
    }

    public void setSessionAffinity(final String sessionAffinity) {
        this.sessionAffinity = sessionAffinity;
    }

    public SessionAffinityConfig getSessionAffinityConfig() {
        return sessionAffinityConfig;
    }

    public void setSessionAffinityConfig(final SessionAffinityConfig sessionAffinityConfig) {
        this.sessionAffinityConfig = sessionAffinityConfig;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clusterIP,
                externalIPs,
                externalName,
                externalTrafficPolicy,
                healthCheckNodePort,
                ipFamily,
                loadBalancerIP,
                loadBalancerSourceRanges,
                ports,
                publishNotReadyAddresses,
                selector,
                sessionAffinity,
                sessionAffinityConfig,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceSpec)) {
            return false;
        }
        final ServiceSpec __otherCasted = (ServiceSpec) __other;
        return Objects.equals(clusterIP, __otherCasted.clusterIP) &&
            Objects.equals(externalIPs, __otherCasted.externalIPs) &&
            Objects.equals(externalName, __otherCasted.externalName) &&
            Objects.equals(externalTrafficPolicy, __otherCasted.externalTrafficPolicy) &&
            Objects.equals(healthCheckNodePort, __otherCasted.healthCheckNodePort) &&
            Objects.equals(ipFamily, __otherCasted.ipFamily) &&
            Objects.equals(loadBalancerIP, __otherCasted.loadBalancerIP) &&
            Objects.equals(loadBalancerSourceRanges, __otherCasted.loadBalancerSourceRanges) &&
            Objects.equals(ports, __otherCasted.ports) &&
            Objects.equals(publishNotReadyAddresses, __otherCasted.publishNotReadyAddresses) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(sessionAffinity, __otherCasted.sessionAffinity) &&
            Objects.equals(sessionAffinityConfig, __otherCasted.sessionAffinityConfig) &&
            Objects.equals(type, __otherCasted.type);
    }

    public ServiceSpec clusterIP(final String clusterIP) {
        this.clusterIP = clusterIP;
        return this;
    }

    public ServiceSpec externalIPs(final List<String> externalIPs) {
        this.externalIPs = externalIPs;
        return this;
    }

    public ServiceSpec externalName(final String externalName) {
        this.externalName = externalName;
        return this;
    }

    public ServiceSpec externalTrafficPolicy(final String externalTrafficPolicy) {
        this.externalTrafficPolicy = externalTrafficPolicy;
        return this;
    }

    public ServiceSpec healthCheckNodePort(final Integer healthCheckNodePort) {
        this.healthCheckNodePort = healthCheckNodePort;
        return this;
    }

    public ServiceSpec ipFamily(final String ipFamily) {
        this.ipFamily = ipFamily;
        return this;
    }

    public ServiceSpec loadBalancerIP(final String loadBalancerIP) {
        this.loadBalancerIP = loadBalancerIP;
        return this;
    }

    public ServiceSpec loadBalancerSourceRanges(final List<String> loadBalancerSourceRanges) {
        this.loadBalancerSourceRanges = loadBalancerSourceRanges;
        return this;
    }

    public ServiceSpec ports(final List<ServicePort> ports) {
        this.ports = ports;
        return this;
    }

    public ServiceSpec publishNotReadyAddresses(final Boolean publishNotReadyAddresses) {
        this.publishNotReadyAddresses = publishNotReadyAddresses;
        return this;
    }

    public ServiceSpec selector(final Map<String, String> selector) {
        this.selector = selector;
        return this;
    }

    public ServiceSpec sessionAffinity(final String sessionAffinity) {
        this.sessionAffinity = sessionAffinity;
        return this;
    }

    public ServiceSpec sessionAffinityConfig(final SessionAffinityConfig sessionAffinityConfig) {
        this.sessionAffinityConfig = sessionAffinityConfig;
        return this;
    }

    public ServiceSpec type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public ServiceSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (clusterIP != null ? "\"clusterIP\":\"" +  JsonStrings.escapeJson(clusterIP) + "\"" : ""),
                    (externalIPs != null ? "\"externalIPs\":" + externalIPs.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (externalName != null ? "\"externalName\":\"" +  JsonStrings.escapeJson(externalName) + "\"" : ""),
                    (externalTrafficPolicy != null ? "\"externalTrafficPolicy\":\"" +  JsonStrings.escapeJson(externalTrafficPolicy) + "\"" : ""),
                    (healthCheckNodePort != null ? "\"healthCheckNodePort\":" + healthCheckNodePort : ""),
                    (ipFamily != null ? "\"ipFamily\":\"" +  JsonStrings.escapeJson(ipFamily) + "\"" : ""),
                    (loadBalancerIP != null ? "\"loadBalancerIP\":\"" +  JsonStrings.escapeJson(loadBalancerIP) + "\"" : ""),
                    (loadBalancerSourceRanges != null ? "\"loadBalancerSourceRanges\":" + loadBalancerSourceRanges.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (ports != null ? "\"ports\":" + ports.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (publishNotReadyAddresses != null ? "\"publishNotReadyAddresses\":" + publishNotReadyAddresses : ""),
                    (selector != null ? "\"selector\":" + selector.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (sessionAffinity != null ? "\"sessionAffinity\":\"" +  JsonStrings.escapeJson(sessionAffinity) + "\"" : ""),
                    (sessionAffinityConfig != null ? "\"sessionAffinityConfig\":" + sessionAffinityConfig.asJson() : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
