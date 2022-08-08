package io.yupiik.kubernetes.bindings.v1_7_0;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpec {
    private Integer activeDeadlineSeconds;
    private CronJobSpecJobTemplateSpecTemplateSpecAffinity affinity;
    private Boolean automountServiceAccountToken;
    private List<JsonValue> containers;
    private String dnsPolicy;
    private List<JsonValue> hostAliases;
    private Boolean hostIPC;
    private Boolean hostNetwork;
    private Boolean hostPID;
    private String hostname;
    private List<JsonValue> imagePullSecrets;
    private List<JsonValue> initContainers;
    private String nodeName;
    private Map<String, String> nodeSelector;
    private String restartPolicy;
    private String schedulerName;
    private CronJobSpecJobTemplateSpecTemplateSpecSecurityContext securityContext;
    private String serviceAccount;
    private String serviceAccountName;
    private String subdomain;
    private Integer terminationGracePeriodSeconds;
    private List<JsonValue> tolerations;
    private List<JsonValue> volumes;

    public CronJobSpecJobTemplateSpecTemplateSpec() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpec(final Integer activeDeadlineSeconds,
                                                  final CronJobSpecJobTemplateSpecTemplateSpecAffinity affinity,
                                                  final Boolean automountServiceAccountToken,
                                                  final List<JsonValue> containers,
                                                  final String dnsPolicy,
                                                  final List<JsonValue> hostAliases,
                                                  final Boolean hostIPC,
                                                  final Boolean hostNetwork,
                                                  final Boolean hostPID,
                                                  final String hostname,
                                                  final List<JsonValue> imagePullSecrets,
                                                  final List<JsonValue> initContainers,
                                                  final String nodeName,
                                                  final Map<String, String> nodeSelector,
                                                  final String restartPolicy,
                                                  final String schedulerName,
                                                  final CronJobSpecJobTemplateSpecTemplateSpecSecurityContext securityContext,
                                                  final String serviceAccount,
                                                  final String serviceAccountName,
                                                  final String subdomain,
                                                  final Integer terminationGracePeriodSeconds,
                                                  final List<JsonValue> tolerations,
                                                  final List<JsonValue> volumes) {
        // no-op
    }

    public Integer getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    public void setActiveDeadlineSeconds(final Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecAffinity getAffinity() {
        return affinity;
    }

    public void setAffinity(final CronJobSpecJobTemplateSpecTemplateSpecAffinity affinity) {
        this.affinity = affinity;
    }

    public Boolean getAutomountServiceAccountToken() {
        return automountServiceAccountToken;
    }

    public void setAutomountServiceAccountToken(final Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
    }

    public List<JsonValue> getContainers() {
        return containers;
    }

    public void setContainers(final List<JsonValue> containers) {
        this.containers = containers;
    }

    public String getDnsPolicy() {
        return dnsPolicy;
    }

    public void setDnsPolicy(final String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    public List<JsonValue> getHostAliases() {
        return hostAliases;
    }

    public void setHostAliases(final List<JsonValue> hostAliases) {
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

    public List<JsonValue> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(final List<JsonValue> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    public List<JsonValue> getInitContainers() {
        return initContainers;
    }

    public void setInitContainers(final List<JsonValue> initContainers) {
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

    public CronJobSpecJobTemplateSpecTemplateSpecSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final CronJobSpecJobTemplateSpecTemplateSpecSecurityContext securityContext) {
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

    public List<JsonValue> getTolerations() {
        return tolerations;
    }

    public void setTolerations(final List<JsonValue> tolerations) {
        this.tolerations = tolerations;
    }

    public List<JsonValue> getVolumes() {
        return volumes;
    }

    public void setVolumes(final List<JsonValue> volumes) {
        this.volumes = volumes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                activeDeadlineSeconds,
                affinity,
                automountServiceAccountToken,
                containers,
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpec)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpec __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpec) __other;
        return Objects.equals(activeDeadlineSeconds, __otherCasted.activeDeadlineSeconds) &&
            Objects.equals(affinity, __otherCasted.affinity) &&
            Objects.equals(automountServiceAccountToken, __otherCasted.automountServiceAccountToken) &&
            Objects.equals(containers, __otherCasted.containers) &&
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
}
