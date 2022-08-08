package io.yupiik.kubernetes.bindings.v1_23_7;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PodListItemsSpec {
    private Integer activeDeadlineSeconds;
    private PodListItemsSpecAffinity affinity;
    private Boolean automountServiceAccountToken;
    private List<PodListItemsSpecContainers> containers;
    private PodListItemsSpecDnsConfig dnsConfig;
    private String dnsPolicy;
    private Boolean enableServiceLinks;
    private List<PodListItemsSpecEphemeralContainers> ephemeralContainers;
    private List<PodListItemsSpecHostAliases> hostAliases;
    private Boolean hostIPC;
    private Boolean hostNetwork;
    private Boolean hostPID;
    private String hostname;
    private List<PodListItemsSpecImagePullSecrets> imagePullSecrets;
    private List<PodListItemsSpecInitContainers> initContainers;
    private String nodeName;
    private Map<String, String> nodeSelector;
    private PodListItemsSpecOs os;
    private Map<String, String> overhead;
    private String preemptionPolicy;
    private Integer priority;
    private String priorityClassName;
    private List<PodListItemsSpecReadinessGates> readinessGates;
    private String restartPolicy;
    private String runtimeClassName;
    private String schedulerName;
    private PodListItemsSpecSecurityContext securityContext;
    private String serviceAccount;
    private String serviceAccountName;
    private Boolean setHostnameAsFQDN;
    private Boolean shareProcessNamespace;
    private String subdomain;
    private Integer terminationGracePeriodSeconds;
    private List<PodListItemsSpecTolerations> tolerations;
    private List<PodListItemsSpecTopologySpreadConstraints> topologySpreadConstraints;
    private List<PodListItemsSpecVolumes> volumes;

    public PodListItemsSpec() {
        // no-op
    }

    public PodListItemsSpec(final Integer activeDeadlineSeconds,
                            final PodListItemsSpecAffinity affinity,
                            final Boolean automountServiceAccountToken,
                            final List<PodListItemsSpecContainers> containers,
                            final PodListItemsSpecDnsConfig dnsConfig,
                            final String dnsPolicy,
                            final Boolean enableServiceLinks,
                            final List<PodListItemsSpecEphemeralContainers> ephemeralContainers,
                            final List<PodListItemsSpecHostAliases> hostAliases,
                            final Boolean hostIPC,
                            final Boolean hostNetwork,
                            final Boolean hostPID,
                            final String hostname,
                            final List<PodListItemsSpecImagePullSecrets> imagePullSecrets,
                            final List<PodListItemsSpecInitContainers> initContainers,
                            final String nodeName,
                            final Map<String, String> nodeSelector,
                            final PodListItemsSpecOs os,
                            final Map<String, String> overhead,
                            final String preemptionPolicy,
                            final Integer priority,
                            final String priorityClassName,
                            final List<PodListItemsSpecReadinessGates> readinessGates,
                            final String restartPolicy,
                            final String runtimeClassName,
                            final String schedulerName,
                            final PodListItemsSpecSecurityContext securityContext,
                            final String serviceAccount,
                            final String serviceAccountName,
                            final Boolean setHostnameAsFQDN,
                            final Boolean shareProcessNamespace,
                            final String subdomain,
                            final Integer terminationGracePeriodSeconds,
                            final List<PodListItemsSpecTolerations> tolerations,
                            final List<PodListItemsSpecTopologySpreadConstraints> topologySpreadConstraints,
                            final List<PodListItemsSpecVolumes> volumes) {
        // no-op
    }

    public Integer getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    public void setActiveDeadlineSeconds(final Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
    }

    public PodListItemsSpecAffinity getAffinity() {
        return affinity;
    }

    public void setAffinity(final PodListItemsSpecAffinity affinity) {
        this.affinity = affinity;
    }

    public Boolean getAutomountServiceAccountToken() {
        return automountServiceAccountToken;
    }

    public void setAutomountServiceAccountToken(final Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
    }

    public List<PodListItemsSpecContainers> getContainers() {
        return containers;
    }

    public void setContainers(final List<PodListItemsSpecContainers> containers) {
        this.containers = containers;
    }

    public PodListItemsSpecDnsConfig getDnsConfig() {
        return dnsConfig;
    }

    public void setDnsConfig(final PodListItemsSpecDnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    public String getDnsPolicy() {
        return dnsPolicy;
    }

    public void setDnsPolicy(final String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    public Boolean getEnableServiceLinks() {
        return enableServiceLinks;
    }

    public void setEnableServiceLinks(final Boolean enableServiceLinks) {
        this.enableServiceLinks = enableServiceLinks;
    }

    public List<PodListItemsSpecEphemeralContainers> getEphemeralContainers() {
        return ephemeralContainers;
    }

    public void setEphemeralContainers(final List<PodListItemsSpecEphemeralContainers> ephemeralContainers) {
        this.ephemeralContainers = ephemeralContainers;
    }

    public List<PodListItemsSpecHostAliases> getHostAliases() {
        return hostAliases;
    }

    public void setHostAliases(final List<PodListItemsSpecHostAliases> hostAliases) {
        this.hostAliases = hostAliases;
    }

    public Boolean getHostIPC() {
        return hostIPC;
    }

    public void setHostIPC(final Boolean hostIPC) {
        this.hostIPC = hostIPC;
    }

    public Boolean getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(final Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    public Boolean getHostPID() {
        return hostPID;
    }

    public void setHostPID(final Boolean hostPID) {
        this.hostPID = hostPID;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(final String hostname) {
        this.hostname = hostname;
    }

    public List<PodListItemsSpecImagePullSecrets> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(final List<PodListItemsSpecImagePullSecrets> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    public List<PodListItemsSpecInitContainers> getInitContainers() {
        return initContainers;
    }

    public void setInitContainers(final List<PodListItemsSpecInitContainers> initContainers) {
        this.initContainers = initContainers;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(final String nodeName) {
        this.nodeName = nodeName;
    }

    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(final Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public PodListItemsSpecOs getOs() {
        return os;
    }

    public void setOs(final PodListItemsSpecOs os) {
        this.os = os;
    }

    public Map<String, String> getOverhead() {
        return overhead;
    }

    public void setOverhead(final Map<String, String> overhead) {
        this.overhead = overhead;
    }

    public String getPreemptionPolicy() {
        return preemptionPolicy;
    }

    public void setPreemptionPolicy(final String preemptionPolicy) {
        this.preemptionPolicy = preemptionPolicy;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(final Integer priority) {
        this.priority = priority;
    }

    public String getPriorityClassName() {
        return priorityClassName;
    }

    public void setPriorityClassName(final String priorityClassName) {
        this.priorityClassName = priorityClassName;
    }

    public List<PodListItemsSpecReadinessGates> getReadinessGates() {
        return readinessGates;
    }

    public void setReadinessGates(final List<PodListItemsSpecReadinessGates> readinessGates) {
        this.readinessGates = readinessGates;
    }

    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(final String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public String getRuntimeClassName() {
        return runtimeClassName;
    }

    public void setRuntimeClassName(final String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
    }

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(final String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public PodListItemsSpecSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final PodListItemsSpecSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public String getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(final String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public String getServiceAccountName() {
        return serviceAccountName;
    }

    public void setServiceAccountName(final String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    public Boolean getSetHostnameAsFQDN() {
        return setHostnameAsFQDN;
    }

    public void setSetHostnameAsFQDN(final Boolean setHostnameAsFQDN) {
        this.setHostnameAsFQDN = setHostnameAsFQDN;
    }

    public Boolean getShareProcessNamespace() {
        return shareProcessNamespace;
    }

    public void setShareProcessNamespace(final Boolean shareProcessNamespace) {
        this.shareProcessNamespace = shareProcessNamespace;
    }

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(final String subdomain) {
        this.subdomain = subdomain;
    }

    public Integer getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(final Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    public List<PodListItemsSpecTolerations> getTolerations() {
        return tolerations;
    }

    public void setTolerations(final List<PodListItemsSpecTolerations> tolerations) {
        this.tolerations = tolerations;
    }

    public List<PodListItemsSpecTopologySpreadConstraints> getTopologySpreadConstraints() {
        return topologySpreadConstraints;
    }

    public void setTopologySpreadConstraints(final List<PodListItemsSpecTopologySpreadConstraints> topologySpreadConstraints) {
        this.topologySpreadConstraints = topologySpreadConstraints;
    }

    public List<PodListItemsSpecVolumes> getVolumes() {
        return volumes;
    }

    public void setVolumes(final List<PodListItemsSpecVolumes> volumes) {
        this.volumes = volumes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                activeDeadlineSeconds,
                affinity,
                automountServiceAccountToken,
                containers,
                dnsConfig,
                dnsPolicy,
                enableServiceLinks,
                ephemeralContainers,
                hostAliases,
                hostIPC,
                hostNetwork,
                hostPID,
                hostname,
                imagePullSecrets,
                initContainers,
                nodeName,
                nodeSelector,
                os,
                overhead,
                preemptionPolicy,
                priority,
                priorityClassName,
                readinessGates,
                restartPolicy,
                runtimeClassName,
                schedulerName,
                securityContext,
                serviceAccount,
                serviceAccountName,
                setHostnameAsFQDN,
                shareProcessNamespace,
                subdomain,
                terminationGracePeriodSeconds,
                tolerations,
                topologySpreadConstraints,
                volumes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpec)) {
            return false;
        }
        final PodListItemsSpec __otherCasted = (PodListItemsSpec) __other;
        return Objects.equals(activeDeadlineSeconds, __otherCasted.activeDeadlineSeconds) &&
            Objects.equals(affinity, __otherCasted.affinity) &&
            Objects.equals(automountServiceAccountToken, __otherCasted.automountServiceAccountToken) &&
            Objects.equals(containers, __otherCasted.containers) &&
            Objects.equals(dnsConfig, __otherCasted.dnsConfig) &&
            Objects.equals(dnsPolicy, __otherCasted.dnsPolicy) &&
            Objects.equals(enableServiceLinks, __otherCasted.enableServiceLinks) &&
            Objects.equals(ephemeralContainers, __otherCasted.ephemeralContainers) &&
            Objects.equals(hostAliases, __otherCasted.hostAliases) &&
            Objects.equals(hostIPC, __otherCasted.hostIPC) &&
            Objects.equals(hostNetwork, __otherCasted.hostNetwork) &&
            Objects.equals(hostPID, __otherCasted.hostPID) &&
            Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(imagePullSecrets, __otherCasted.imagePullSecrets) &&
            Objects.equals(initContainers, __otherCasted.initContainers) &&
            Objects.equals(nodeName, __otherCasted.nodeName) &&
            Objects.equals(nodeSelector, __otherCasted.nodeSelector) &&
            Objects.equals(os, __otherCasted.os) &&
            Objects.equals(overhead, __otherCasted.overhead) &&
            Objects.equals(preemptionPolicy, __otherCasted.preemptionPolicy) &&
            Objects.equals(priority, __otherCasted.priority) &&
            Objects.equals(priorityClassName, __otherCasted.priorityClassName) &&
            Objects.equals(readinessGates, __otherCasted.readinessGates) &&
            Objects.equals(restartPolicy, __otherCasted.restartPolicy) &&
            Objects.equals(runtimeClassName, __otherCasted.runtimeClassName) &&
            Objects.equals(schedulerName, __otherCasted.schedulerName) &&
            Objects.equals(securityContext, __otherCasted.securityContext) &&
            Objects.equals(serviceAccount, __otherCasted.serviceAccount) &&
            Objects.equals(serviceAccountName, __otherCasted.serviceAccountName) &&
            Objects.equals(setHostnameAsFQDN, __otherCasted.setHostnameAsFQDN) &&
            Objects.equals(shareProcessNamespace, __otherCasted.shareProcessNamespace) &&
            Objects.equals(subdomain, __otherCasted.subdomain) &&
            Objects.equals(terminationGracePeriodSeconds, __otherCasted.terminationGracePeriodSeconds) &&
            Objects.equals(tolerations, __otherCasted.tolerations) &&
            Objects.equals(topologySpreadConstraints, __otherCasted.topologySpreadConstraints) &&
            Objects.equals(volumes, __otherCasted.volumes);
    }
}
