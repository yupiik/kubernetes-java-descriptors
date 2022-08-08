package io.yupiik.kubernetes.bindings.v1_14_3;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ServiceSpec {
    private String clusterIP;
    private List<String> externalIPs;
    private String externalName;
    private String externalTrafficPolicy;
    private Integer healthCheckNodePort;
    private String loadBalancerIP;
    private List<String> loadBalancerSourceRanges;
    private List<ServiceSpecPorts> ports;
    private Boolean publishNotReadyAddresses;
    private Map<String, String> selector;
    private String sessionAffinity;
    private ServiceSpecSessionAffinityConfig sessionAffinityConfig;
    private String type;

    public ServiceSpec() {
        // no-op
    }

    public ServiceSpec(final String clusterIP,
                       final List<String> externalIPs,
                       final String externalName,
                       final String externalTrafficPolicy,
                       final Integer healthCheckNodePort,
                       final String loadBalancerIP,
                       final List<String> loadBalancerSourceRanges,
                       final List<ServiceSpecPorts> ports,
                       final Boolean publishNotReadyAddresses,
                       final Map<String, String> selector,
                       final String sessionAffinity,
                       final ServiceSpecSessionAffinityConfig sessionAffinityConfig,
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

    public List<ServiceSpecPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<ServiceSpecPorts> ports) {
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

    public ServiceSpecSessionAffinityConfig getSessionAffinityConfig() {
        return sessionAffinityConfig;
    }

    public void setSessionAffinityConfig(final ServiceSpecSessionAffinityConfig sessionAffinityConfig) {
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
            Objects.equals(loadBalancerIP, __otherCasted.loadBalancerIP) &&
            Objects.equals(loadBalancerSourceRanges, __otherCasted.loadBalancerSourceRanges) &&
            Objects.equals(ports, __otherCasted.ports) &&
            Objects.equals(publishNotReadyAddresses, __otherCasted.publishNotReadyAddresses) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(sessionAffinity, __otherCasted.sessionAffinity) &&
            Objects.equals(sessionAffinityConfig, __otherCasted.sessionAffinityConfig) &&
            Objects.equals(type, __otherCasted.type);
    }
}
