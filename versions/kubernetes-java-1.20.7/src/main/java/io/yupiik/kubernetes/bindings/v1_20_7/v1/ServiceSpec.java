package io.yupiik.kubernetes.bindings.v1_20_7.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ServiceSpec {
    private Boolean allocateLoadBalancerNodePorts;
    private String clusterIP;
    private List<String> clusterIPs;
    private List<String> externalIPs;
    private String externalName;
    private String externalTrafficPolicy;
    private Integer healthCheckNodePort;
    private List<String> ipFamilies;
    private String ipFamilyPolicy;
    private String loadBalancerIP;
    private List<String> loadBalancerSourceRanges;
    private List<ServiceSpecPorts> ports;
    private Boolean publishNotReadyAddresses;
    private Map<String, String> selector;
    private String sessionAffinity;
    private ServiceSpecSessionAffinityConfig sessionAffinityConfig;
    private List<String> topologyKeys;
    private String type;

    public ServiceSpec() {
        // no-op
    }

    public ServiceSpec(final Boolean allocateLoadBalancerNodePorts,
                       final String clusterIP,
                       final List<String> clusterIPs,
                       final List<String> externalIPs,
                       final String externalName,
                       final String externalTrafficPolicy,
                       final Integer healthCheckNodePort,
                       final List<String> ipFamilies,
                       final String ipFamilyPolicy,
                       final String loadBalancerIP,
                       final List<String> loadBalancerSourceRanges,
                       final List<ServiceSpecPorts> ports,
                       final Boolean publishNotReadyAddresses,
                       final Map<String, String> selector,
                       final String sessionAffinity,
                       final ServiceSpecSessionAffinityConfig sessionAffinityConfig,
                       final List<String> topologyKeys,
                       final String type) {
        // no-op
    }

    public Boolean getAllocateLoadBalancerNodePorts() {
        return allocateLoadBalancerNodePorts;
    }

    public void setAllocateLoadBalancerNodePorts(final Boolean allocateLoadBalancerNodePorts) {
        this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
    }

    public String getClusterIP() {
        return clusterIP;
    }

    public void setClusterIP(final String clusterIP) {
        this.clusterIP = clusterIP;
    }

    public List<String> getClusterIPs() {
        return clusterIPs;
    }

    public void setClusterIPs(final List<String> clusterIPs) {
        this.clusterIPs = clusterIPs;
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

    public List<String> getIpFamilies() {
        return ipFamilies;
    }

    public void setIpFamilies(final List<String> ipFamilies) {
        this.ipFamilies = ipFamilies;
    }

    public String getIpFamilyPolicy() {
        return ipFamilyPolicy;
    }

    public void setIpFamilyPolicy(final String ipFamilyPolicy) {
        this.ipFamilyPolicy = ipFamilyPolicy;
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

    public List<String> getTopologyKeys() {
        return topologyKeys;
    }

    public void setTopologyKeys(final List<String> topologyKeys) {
        this.topologyKeys = topologyKeys;
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
                allocateLoadBalancerNodePorts,
                clusterIP,
                clusterIPs,
                externalIPs,
                externalName,
                externalTrafficPolicy,
                healthCheckNodePort,
                ipFamilies,
                ipFamilyPolicy,
                loadBalancerIP,
                loadBalancerSourceRanges,
                ports,
                publishNotReadyAddresses,
                selector,
                sessionAffinity,
                sessionAffinityConfig,
                topologyKeys,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceSpec)) {
            return false;
        }
        final ServiceSpec __otherCasted = (ServiceSpec) __other;
        return Objects.equals(allocateLoadBalancerNodePorts, __otherCasted.allocateLoadBalancerNodePorts) &&
            Objects.equals(clusterIP, __otherCasted.clusterIP) &&
            Objects.equals(clusterIPs, __otherCasted.clusterIPs) &&
            Objects.equals(externalIPs, __otherCasted.externalIPs) &&
            Objects.equals(externalName, __otherCasted.externalName) &&
            Objects.equals(externalTrafficPolicy, __otherCasted.externalTrafficPolicy) &&
            Objects.equals(healthCheckNodePort, __otherCasted.healthCheckNodePort) &&
            Objects.equals(ipFamilies, __otherCasted.ipFamilies) &&
            Objects.equals(ipFamilyPolicy, __otherCasted.ipFamilyPolicy) &&
            Objects.equals(loadBalancerIP, __otherCasted.loadBalancerIP) &&
            Objects.equals(loadBalancerSourceRanges, __otherCasted.loadBalancerSourceRanges) &&
            Objects.equals(ports, __otherCasted.ports) &&
            Objects.equals(publishNotReadyAddresses, __otherCasted.publishNotReadyAddresses) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(sessionAffinity, __otherCasted.sessionAffinity) &&
            Objects.equals(sessionAffinityConfig, __otherCasted.sessionAffinityConfig) &&
            Objects.equals(topologyKeys, __otherCasted.topologyKeys) &&
            Objects.equals(type, __otherCasted.type);
    }
}
