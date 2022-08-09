package io.yupiik.kubernetes.bindings.v1_18_20.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_18_20.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_20.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_20.Validable;
import io.yupiik.kubernetes.bindings.v1_18_20.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodSpec implements Validable<PodSpec>, Exportable {
    private Integer activeDeadlineSeconds;
    private Affinity affinity;
    private Boolean automountServiceAccountToken;
    private List<Container> containers;
    private PodDNSConfig dnsConfig;
    private String dnsPolicy;
    private Boolean enableServiceLinks;
    private List<EphemeralContainer> ephemeralContainers;
    private List<HostAlias> hostAliases;
    private Boolean hostIPC;
    private Boolean hostNetwork;
    private Boolean hostPID;
    private String hostname;
    private List<LocalObjectReference> imagePullSecrets;
    private List<Container> initContainers;
    private String nodeName;
    private Map<String, String> nodeSelector;
    private JsonObject overhead;
    private String preemptionPolicy;
    private Integer priority;
    private String priorityClassName;
    private List<PodReadinessGate> readinessGates;
    private String restartPolicy;
    private String runtimeClassName;
    private String schedulerName;
    private PodSecurityContext securityContext;
    private String serviceAccount;
    private String serviceAccountName;
    private Boolean shareProcessNamespace;
    private String subdomain;
    private Integer terminationGracePeriodSeconds;
    private List<Toleration> tolerations;
    private List<TopologySpreadConstraint> topologySpreadConstraints;
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
                   final Boolean enableServiceLinks,
                   final List<EphemeralContainer> ephemeralContainers,
                   final List<HostAlias> hostAliases,
                   final Boolean hostIPC,
                   final Boolean hostNetwork,
                   final Boolean hostPID,
                   final String hostname,
                   final List<LocalObjectReference> imagePullSecrets,
                   final List<Container> initContainers,
                   final String nodeName,
                   final Map<String, String> nodeSelector,
                   final JsonObject overhead,
                   final String preemptionPolicy,
                   final Integer priority,
                   final String priorityClassName,
                   final List<PodReadinessGate> readinessGates,
                   final String restartPolicy,
                   final String runtimeClassName,
                   final String schedulerName,
                   final PodSecurityContext securityContext,
                   final String serviceAccount,
                   final String serviceAccountName,
                   final Boolean shareProcessNamespace,
                   final String subdomain,
                   final Integer terminationGracePeriodSeconds,
                   final List<Toleration> tolerations,
                   final List<TopologySpreadConstraint> topologySpreadConstraints,
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

    public Boolean getEnableServiceLinks() {
        return enableServiceLinks;
    }

    public void setEnableServiceLinks(final Boolean enableServiceLinks) {
        this.enableServiceLinks = enableServiceLinks;
    }

    public List<EphemeralContainer> getEphemeralContainers() {
        return ephemeralContainers;
    }

    public void setEphemeralContainers(final List<EphemeralContainer> ephemeralContainers) {
        this.ephemeralContainers = ephemeralContainers;
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

    public JsonObject getOverhead() {
        return overhead;
    }

    public void setOverhead(final JsonObject overhead) {
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

    public List<PodReadinessGate> getReadinessGates() {
        return readinessGates;
    }

    public void setReadinessGates(final List<PodReadinessGate> readinessGates) {
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

    public List<Toleration> getTolerations() {
        return tolerations;
    }

    public void setTolerations(final List<Toleration> tolerations) {
        this.tolerations = tolerations;
    }

    public List<TopologySpreadConstraint> getTopologySpreadConstraints() {
        return topologySpreadConstraints;
    }

    public void setTopologySpreadConstraints(final List<TopologySpreadConstraint> topologySpreadConstraints) {
        this.topologySpreadConstraints = topologySpreadConstraints;
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
                shareProcessNamespace,
                subdomain,
                terminationGracePeriodSeconds,
                tolerations,
                topologySpreadConstraints,
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
            Objects.equals(shareProcessNamespace, __otherCasted.shareProcessNamespace) &&
            Objects.equals(subdomain, __otherCasted.subdomain) &&
            Objects.equals(terminationGracePeriodSeconds, __otherCasted.terminationGracePeriodSeconds) &&
            Objects.equals(tolerations, __otherCasted.tolerations) &&
            Objects.equals(topologySpreadConstraints, __otherCasted.topologySpreadConstraints) &&
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

    public PodSpec enableServiceLinks(final Boolean enableServiceLinks) {
        this.enableServiceLinks = enableServiceLinks;
        return this;
    }

    public PodSpec ephemeralContainers(final List<EphemeralContainer> ephemeralContainers) {
        this.ephemeralContainers = ephemeralContainers;
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

    public PodSpec overhead(final JsonObject overhead) {
        this.overhead = overhead;
        return this;
    }

    public PodSpec preemptionPolicy(final String preemptionPolicy) {
        this.preemptionPolicy = preemptionPolicy;
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

    public PodSpec readinessGates(final List<PodReadinessGate> readinessGates) {
        this.readinessGates = readinessGates;
        return this;
    }

    public PodSpec restartPolicy(final String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    public PodSpec runtimeClassName(final String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
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

    public PodSpec shareProcessNamespace(final Boolean shareProcessNamespace) {
        this.shareProcessNamespace = shareProcessNamespace;
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

    public PodSpec topologySpreadConstraints(final List<TopologySpreadConstraint> topologySpreadConstraints) {
        this.topologySpreadConstraints = topologySpreadConstraints;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (activeDeadlineSeconds != null ? "\"activeDeadlineSeconds\":" + activeDeadlineSeconds : ""),
                    (affinity != null ? "\"affinity\":" + affinity.asJson() : ""),
                    (automountServiceAccountToken != null ? "\"automountServiceAccountToken\":" + automountServiceAccountToken : ""),
                    (containers != null ? "\"containers\":" + containers.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (dnsConfig != null ? "\"dnsConfig\":" + dnsConfig.asJson() : ""),
                    (dnsPolicy != null ? "\"dnsPolicy\":\"" +  JsonStrings.escapeJson(dnsPolicy) + "\"" : ""),
                    (enableServiceLinks != null ? "\"enableServiceLinks\":" + enableServiceLinks : ""),
                    (ephemeralContainers != null ? "\"ephemeralContainers\":" + ephemeralContainers.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (hostAliases != null ? "\"hostAliases\":" + hostAliases.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (hostIPC != null ? "\"hostIPC\":" + hostIPC : ""),
                    (hostNetwork != null ? "\"hostNetwork\":" + hostNetwork : ""),
                    (hostPID != null ? "\"hostPID\":" + hostPID : ""),
                    (hostname != null ? "\"hostname\":\"" +  JsonStrings.escapeJson(hostname) + "\"" : ""),
                    (imagePullSecrets != null ? "\"imagePullSecrets\":" + imagePullSecrets.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (initContainers != null ? "\"initContainers\":" + initContainers.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (nodeName != null ? "\"nodeName\":\"" +  JsonStrings.escapeJson(nodeName) + "\"" : ""),
                    (nodeSelector != null ? "\"nodeSelector\":" + nodeSelector.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (overhead != null ? "\"overhead\":" + overhead : ""),
                    (preemptionPolicy != null ? "\"preemptionPolicy\":\"" +  JsonStrings.escapeJson(preemptionPolicy) + "\"" : ""),
                    (priority != null ? "\"priority\":" + priority : ""),
                    (priorityClassName != null ? "\"priorityClassName\":\"" +  JsonStrings.escapeJson(priorityClassName) + "\"" : ""),
                    (readinessGates != null ? "\"readinessGates\":" + readinessGates.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (restartPolicy != null ? "\"restartPolicy\":\"" +  JsonStrings.escapeJson(restartPolicy) + "\"" : ""),
                    (runtimeClassName != null ? "\"runtimeClassName\":\"" +  JsonStrings.escapeJson(runtimeClassName) + "\"" : ""),
                    (schedulerName != null ? "\"schedulerName\":\"" +  JsonStrings.escapeJson(schedulerName) + "\"" : ""),
                    (securityContext != null ? "\"securityContext\":" + securityContext.asJson() : ""),
                    (serviceAccount != null ? "\"serviceAccount\":\"" +  JsonStrings.escapeJson(serviceAccount) + "\"" : ""),
                    (serviceAccountName != null ? "\"serviceAccountName\":\"" +  JsonStrings.escapeJson(serviceAccountName) + "\"" : ""),
                    (shareProcessNamespace != null ? "\"shareProcessNamespace\":" + shareProcessNamespace : ""),
                    (subdomain != null ? "\"subdomain\":\"" +  JsonStrings.escapeJson(subdomain) + "\"" : ""),
                    (terminationGracePeriodSeconds != null ? "\"terminationGracePeriodSeconds\":" + terminationGracePeriodSeconds : ""),
                    (tolerations != null ? "\"tolerations\":" + tolerations.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (topologySpreadConstraints != null ? "\"topologySpreadConstraints\":" + topologySpreadConstraints.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (volumes != null ? "\"volumes\":" + volumes.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
