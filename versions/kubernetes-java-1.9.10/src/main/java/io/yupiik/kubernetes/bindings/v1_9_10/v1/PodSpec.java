package io.yupiik.kubernetes.bindings.v1_9_10.v1;

import io.yupiik.kubernetes.bindings.v1_9_10.Validable;
import io.yupiik.kubernetes.bindings.v1_9_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PodSpec implements Validable<PodSpec> {
    private Integer activeDeadlineSeconds;
    private Affinity affinity;
    private Boolean automountServiceAccountToken;
    private List<Container> containers;
    private PodDNSConfig dnsConfig;
    private String dnsPolicy;
    private List<HostAlias> hostAliases;
    private Boolean hostIPC;
    private Boolean hostNetwork;
    private Boolean hostPID;
    private String hostname;
    private List<LocalObjectReference> imagePullSecrets;
    private List<Container> initContainers;
    private String nodeName;
    private Map<String, String> nodeSelector;
    private Integer priority;
    private String priorityClassName;
    private String restartPolicy;
    private String schedulerName;
    private PodSecurityContext securityContext;
    private String serviceAccount;
    private String serviceAccountName;
    private String subdomain;
    private Integer terminationGracePeriodSeconds;
    private List<Toleration> tolerations;
    private List<Volume> volumes;

    public PodSpec() {
        // no-op
    }

    public PodSpec(final Integer activeDeadlineSeconds,
                   final Affinity affinity,
                   final Boolean automountServiceAccountToken,
                   final List<Container> containers,
                   final PodDNSConfig dnsConfig,
                   final String dnsPolicy,
                   final List<HostAlias> hostAliases,
                   final Boolean hostIPC,
                   final Boolean hostNetwork,
                   final Boolean hostPID,
                   final String hostname,
                   final List<LocalObjectReference> imagePullSecrets,
                   final List<Container> initContainers,
                   final String nodeName,
                   final Map<String, String> nodeSelector,
                   final Integer priority,
                   final String priorityClassName,
                   final String restartPolicy,
                   final String schedulerName,
                   final PodSecurityContext securityContext,
                   final String serviceAccount,
                   final String serviceAccountName,
                   final String subdomain,
                   final Integer terminationGracePeriodSeconds,
                   final List<Toleration> tolerations,
                   final List<Volume> volumes) {
        // no-op
    }

    public Integer getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    public void setActiveDeadlineSeconds(final Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
    }

    public Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(final Affinity affinity) {
        this.affinity = affinity;
    }

    public Boolean getAutomountServiceAccountToken() {
        return automountServiceAccountToken;
    }

    public void setAutomountServiceAccountToken(final Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(final List<Container> containers) {
        this.containers = containers;
    }

    public PodDNSConfig getDnsConfig() {
        return dnsConfig;
    }

    public void setDnsConfig(final PodDNSConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    public String getDnsPolicy() {
        return dnsPolicy;
    }

    public void setDnsPolicy(final String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    public List<HostAlias> getHostAliases() {
        return hostAliases;
    }

    public void setHostAliases(final List<HostAlias> hostAliases) {
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

    public List<LocalObjectReference> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(final List<LocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    public List<Container> getInitContainers() {
        return initContainers;
    }

    public void setInitContainers(final List<Container> initContainers) {
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

    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(final String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(final String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public PodSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final PodSecurityContext securityContext) {
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

    public List<Toleration> getTolerations() {
        return tolerations;
    }

    public void setTolerations(final List<Toleration> tolerations) {
        this.tolerations = tolerations;
    }

    public List<Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(final List<Volume> volumes) {
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
                hostAliases,
                hostIPC,
                hostNetwork,
                hostPID,
                hostname,
                imagePullSecrets,
                initContainers,
                nodeName,
                nodeSelector,
                priority,
                priorityClassName,
                restartPolicy,
                schedulerName,
                securityContext,
                serviceAccount,
                serviceAccountName,
                subdomain,
                terminationGracePeriodSeconds,
                tolerations,
                volumes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSpec)) {
            return false;
        }
        final PodSpec __otherCasted = (PodSpec) __other;
        return Objects.equals(activeDeadlineSeconds, __otherCasted.activeDeadlineSeconds) &&
            Objects.equals(affinity, __otherCasted.affinity) &&
            Objects.equals(automountServiceAccountToken, __otherCasted.automountServiceAccountToken) &&
            Objects.equals(containers, __otherCasted.containers) &&
            Objects.equals(dnsConfig, __otherCasted.dnsConfig) &&
            Objects.equals(dnsPolicy, __otherCasted.dnsPolicy) &&
            Objects.equals(hostAliases, __otherCasted.hostAliases) &&
            Objects.equals(hostIPC, __otherCasted.hostIPC) &&
            Objects.equals(hostNetwork, __otherCasted.hostNetwork) &&
            Objects.equals(hostPID, __otherCasted.hostPID) &&
            Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(imagePullSecrets, __otherCasted.imagePullSecrets) &&
            Objects.equals(initContainers, __otherCasted.initContainers) &&
            Objects.equals(nodeName, __otherCasted.nodeName) &&
            Objects.equals(nodeSelector, __otherCasted.nodeSelector) &&
            Objects.equals(priority, __otherCasted.priority) &&
            Objects.equals(priorityClassName, __otherCasted.priorityClassName) &&
            Objects.equals(restartPolicy, __otherCasted.restartPolicy) &&
            Objects.equals(schedulerName, __otherCasted.schedulerName) &&
            Objects.equals(securityContext, __otherCasted.securityContext) &&
            Objects.equals(serviceAccount, __otherCasted.serviceAccount) &&
            Objects.equals(serviceAccountName, __otherCasted.serviceAccountName) &&
            Objects.equals(subdomain, __otherCasted.subdomain) &&
            Objects.equals(terminationGracePeriodSeconds, __otherCasted.terminationGracePeriodSeconds) &&
            Objects.equals(tolerations, __otherCasted.tolerations) &&
            Objects.equals(volumes, __otherCasted.volumes);
    }

    public PodSpec activeDeadlineSeconds(final Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        return this;
    }

    public PodSpec affinity(final Affinity affinity) {
        this.affinity = affinity;
        return this;
    }

    public PodSpec automountServiceAccountToken(final Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
        return this;
    }

    public PodSpec containers(final List<Container> containers) {
        this.containers = containers;
        return this;
    }

    public PodSpec dnsConfig(final PodDNSConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }

    public PodSpec dnsPolicy(final String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
        return this;
    }

    public PodSpec hostAliases(final List<HostAlias> hostAliases) {
        this.hostAliases = hostAliases;
        return this;
    }

    public PodSpec hostIPC(final Boolean hostIPC) {
        this.hostIPC = hostIPC;
        return this;
    }

    public PodSpec hostNetwork(final Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    public PodSpec hostPID(final Boolean hostPID) {
        this.hostPID = hostPID;
        return this;
    }

    public PodSpec hostname(final String hostname) {
        this.hostname = hostname;
        return this;
    }

    public PodSpec imagePullSecrets(final List<LocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }

    public PodSpec initContainers(final List<Container> initContainers) {
        this.initContainers = initContainers;
        return this;
    }

    public PodSpec nodeName(final String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public PodSpec nodeSelector(final Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    public PodSpec priority(final Integer priority) {
        this.priority = priority;
        return this;
    }

    public PodSpec priorityClassName(final String priorityClassName) {
        this.priorityClassName = priorityClassName;
        return this;
    }

    public PodSpec restartPolicy(final String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    public PodSpec schedulerName(final String schedulerName) {
        this.schedulerName = schedulerName;
        return this;
    }

    public PodSpec securityContext(final PodSecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    public PodSpec serviceAccount(final String serviceAccount) {
        this.serviceAccount = serviceAccount;
        return this;
    }

    public PodSpec serviceAccountName(final String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
        return this;
    }

    public PodSpec subdomain(final String subdomain) {
        this.subdomain = subdomain;
        return this;
    }

    public PodSpec terminationGracePeriodSeconds(final Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }

    public PodSpec tolerations(final List<Toleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }

    public PodSpec volumes(final List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }

    @Override
    public PodSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (containers == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "containers", "containers",
                "Missing 'containers' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}