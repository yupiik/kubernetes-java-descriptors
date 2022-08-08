package io.yupiik.kubernetes.bindings.v1_22_11;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ServiceListItemsSpec {
    private Boolean allocateLoadBalancerNodePorts;
    private String clusterIP;
    private List<String> clusterIPs;
    private List<String> externalIPs;
    private String externalName;
    private String externalTrafficPolicy;
    private Integer healthCheckNodePort;
    private String internalTrafficPolicy;
    private List<String> ipFamilies;
    private String ipFamilyPolicy;
    private String loadBalancerClass;
    private String loadBalancerIP;
    private List<String> loadBalancerSourceRanges;
    private List<ServiceListItemsSpecPorts> ports;
    private Boolean publishNotReadyAddresses;
    private Map<String, String> selector;
    private String sessionAffinity;
    private ServiceListItemsSpecSessionAffinityConfig sessionAffinityConfig;
    private String type;

    public ServiceListItemsSpec() {
        // no-op
    }

    public ServiceListItemsSpec(final Boolean allocateLoadBalancerNodePorts,
                                final String clusterIP,
                                final List<String> clusterIPs,
                                final List<String> externalIPs,
                                final String externalName,
                                final String externalTrafficPolicy,
                                final Integer healthCheckNodePort,
                                final String internalTrafficPolicy,
                                final List<String> ipFamilies,
                                final String ipFamilyPolicy,
                                final String loadBalancerClass,
                                final String loadBalancerIP,
                                final List<String> loadBalancerSourceRanges,
                                final List<ServiceListItemsSpecPorts> ports,
                                final Boolean publishNotReadyAddresses,
                                final Map<String, String> selector,
                                final String sessionAffinity,
                                final ServiceListItemsSpecSessionAffinityConfig sessionAffinityConfig,
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

    public String getInternalTrafficPolicy() {
        return internalTrafficPolicy;
    }

    public void setInternalTrafficPolicy(final String internalTrafficPolicy) {
        this.internalTrafficPolicy = internalTrafficPolicy;
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

    public String getLoadBalancerClass() {
        return loadBalancerClass;
    }

    public void setLoadBalancerClass(final String loadBalancerClass) {
        this.loadBalancerClass = loadBalancerClass;
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

    public List<ServiceListItemsSpecPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<ServiceListItemsSpecPorts> ports) {
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

    public ServiceListItemsSpecSessionAffinityConfig getSessionAffinityConfig() {
        return sessionAffinityConfig;
    }

    public void setSessionAffinityConfig(final ServiceListItemsSpecSessionAffinityConfig sessionAffinityConfig) {
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
                allocateLoadBalancerNodePorts,
                clusterIP,
                clusterIPs,
                externalIPs,
                externalName,
                externalTrafficPolicy,
                healthCheckNodePort,
                internalTrafficPolicy,
                ipFamilies,
                ipFamilyPolicy,
                loadBalancerClass,
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
        if (!(__other instanceof ServiceListItemsSpec)) {
            return false;
        }
        final ServiceListItemsSpec __otherCasted = (ServiceListItemsSpec) __other;
        return Objects.equals(allocateLoadBalancerNodePorts, __otherCasted.allocateLoadBalancerNodePorts) &&
            Objects.equals(clusterIP, __otherCasted.clusterIP) &&
            Objects.equals(clusterIPs, __otherCasted.clusterIPs) &&
            Objects.equals(externalIPs, __otherCasted.externalIPs) &&
            Objects.equals(externalName, __otherCasted.externalName) &&
            Objects.equals(externalTrafficPolicy, __otherCasted.externalTrafficPolicy) &&
            Objects.equals(healthCheckNodePort, __otherCasted.healthCheckNodePort) &&
            Objects.equals(internalTrafficPolicy, __otherCasted.internalTrafficPolicy) &&
            Objects.equals(ipFamilies, __otherCasted.ipFamilies) &&
            Objects.equals(ipFamilyPolicy, __otherCasted.ipFamilyPolicy) &&
            Objects.equals(loadBalancerClass, __otherCasted.loadBalancerClass) &&
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
