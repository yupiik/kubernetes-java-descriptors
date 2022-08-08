package io.yupiik.kubernetes.bindings.v1_11_2.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PodSecurityPolicySpec {
    private Boolean allowPrivilegeEscalation;
    private List<String> allowedCapabilities;
    private List<JsonValue> allowedFlexVolumes;
    private List<JsonValue> allowedHostPaths;
    private List<String> allowedUnsafeSysctls;
    private List<String> defaultAddCapabilities;
    private Boolean defaultAllowPrivilegeEscalation;
    private List<String> forbiddenSysctls;
    private PodSecurityPolicySpecFsGroup fsGroup;
    private Boolean hostIPC;
    private Boolean hostNetwork;
    private Boolean hostPID;
    private List<JsonValue> hostPorts;
    private Boolean privileged;
    private Boolean readOnlyRootFilesystem;
    private List<String> requiredDropCapabilities;
    private PodSecurityPolicySpecRunAsUser runAsUser;
    private PodSecurityPolicySpecSeLinux seLinux;
    private PodSecurityPolicySpecSupplementalGroups supplementalGroups;
    private List<String> volumes;

    public PodSecurityPolicySpec() {
        // no-op
    }

    public PodSecurityPolicySpec(final Boolean allowPrivilegeEscalation,
                                 final List<String> allowedCapabilities,
                                 final List<JsonValue> allowedFlexVolumes,
                                 final List<JsonValue> allowedHostPaths,
                                 final List<String> allowedUnsafeSysctls,
                                 final List<String> defaultAddCapabilities,
                                 final Boolean defaultAllowPrivilegeEscalation,
                                 final List<String> forbiddenSysctls,
                                 final PodSecurityPolicySpecFsGroup fsGroup,
                                 final Boolean hostIPC,
                                 final Boolean hostNetwork,
                                 final Boolean hostPID,
                                 final List<JsonValue> hostPorts,
                                 final Boolean privileged,
                                 final Boolean readOnlyRootFilesystem,
                                 final List<String> requiredDropCapabilities,
                                 final PodSecurityPolicySpecRunAsUser runAsUser,
                                 final PodSecurityPolicySpecSeLinux seLinux,
                                 final PodSecurityPolicySpecSupplementalGroups supplementalGroups,
                                 final List<String> volumes) {
        // no-op
    }

    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(final Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    public List<String> getAllowedCapabilities() {
        return allowedCapabilities;
    }

    public void setAllowedCapabilities(final List<String> allowedCapabilities) {
        this.allowedCapabilities = allowedCapabilities;
    }

    public List<JsonValue> getAllowedFlexVolumes() {
        return allowedFlexVolumes;
    }

    public void setAllowedFlexVolumes(final List<JsonValue> allowedFlexVolumes) {
        this.allowedFlexVolumes = allowedFlexVolumes;
    }

    public List<JsonValue> getAllowedHostPaths() {
        return allowedHostPaths;
    }

    public void setAllowedHostPaths(final List<JsonValue> allowedHostPaths) {
        this.allowedHostPaths = allowedHostPaths;
    }

    public List<String> getAllowedUnsafeSysctls() {
        return allowedUnsafeSysctls;
    }

    public void setAllowedUnsafeSysctls(final List<String> allowedUnsafeSysctls) {
        this.allowedUnsafeSysctls = allowedUnsafeSysctls;
    }

    public List<String> getDefaultAddCapabilities() {
        return defaultAddCapabilities;
    }

    public void setDefaultAddCapabilities(final List<String> defaultAddCapabilities) {
        this.defaultAddCapabilities = defaultAddCapabilities;
    }

    public Boolean getDefaultAllowPrivilegeEscalation() {
        return defaultAllowPrivilegeEscalation;
    }

    public void setDefaultAllowPrivilegeEscalation(final Boolean defaultAllowPrivilegeEscalation) {
        this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
    }

    public List<String> getForbiddenSysctls() {
        return forbiddenSysctls;
    }

    public void setForbiddenSysctls(final List<String> forbiddenSysctls) {
        this.forbiddenSysctls = forbiddenSysctls;
    }

    public PodSecurityPolicySpecFsGroup getFsGroup() {
        return fsGroup;
    }

    public void setFsGroup(final PodSecurityPolicySpecFsGroup fsGroup) {
        this.fsGroup = fsGroup;
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

    public List<JsonValue> getHostPorts() {
        return hostPorts;
    }

    public void setHostPorts(final List<JsonValue> hostPorts) {
        this.hostPorts = hostPorts;
    }

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(final Boolean privileged) {
        this.privileged = privileged;
    }

    public Boolean getReadOnlyRootFilesystem() {
        return readOnlyRootFilesystem;
    }

    public void setReadOnlyRootFilesystem(final Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    }

    public List<String> getRequiredDropCapabilities() {
        return requiredDropCapabilities;
    }

    public void setRequiredDropCapabilities(final List<String> requiredDropCapabilities) {
        this.requiredDropCapabilities = requiredDropCapabilities;
    }

    public PodSecurityPolicySpecRunAsUser getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(final PodSecurityPolicySpecRunAsUser runAsUser) {
        this.runAsUser = runAsUser;
    }

    public PodSecurityPolicySpecSeLinux getSeLinux() {
        return seLinux;
    }

    public void setSeLinux(final PodSecurityPolicySpecSeLinux seLinux) {
        this.seLinux = seLinux;
    }

    public PodSecurityPolicySpecSupplementalGroups getSupplementalGroups() {
        return supplementalGroups;
    }

    public void setSupplementalGroups(final PodSecurityPolicySpecSupplementalGroups supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    public List<String> getVolumes() {
        return volumes;
    }

    public void setVolumes(final List<String> volumes) {
        this.volumes = volumes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allowPrivilegeEscalation,
                allowedCapabilities,
                allowedFlexVolumes,
                allowedHostPaths,
                allowedUnsafeSysctls,
                defaultAddCapabilities,
                defaultAllowPrivilegeEscalation,
                forbiddenSysctls,
                fsGroup,
                hostIPC,
                hostNetwork,
                hostPID,
                hostPorts,
                privileged,
                readOnlyRootFilesystem,
                requiredDropCapabilities,
                runAsUser,
                seLinux,
                supplementalGroups,
                volumes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSecurityPolicySpec)) {
            return false;
        }
        final PodSecurityPolicySpec __otherCasted = (PodSecurityPolicySpec) __other;
        return Objects.equals(allowPrivilegeEscalation, __otherCasted.allowPrivilegeEscalation) &&
            Objects.equals(allowedCapabilities, __otherCasted.allowedCapabilities) &&
            Objects.equals(allowedFlexVolumes, __otherCasted.allowedFlexVolumes) &&
            Objects.equals(allowedHostPaths, __otherCasted.allowedHostPaths) &&
            Objects.equals(allowedUnsafeSysctls, __otherCasted.allowedUnsafeSysctls) &&
            Objects.equals(defaultAddCapabilities, __otherCasted.defaultAddCapabilities) &&
            Objects.equals(defaultAllowPrivilegeEscalation, __otherCasted.defaultAllowPrivilegeEscalation) &&
            Objects.equals(forbiddenSysctls, __otherCasted.forbiddenSysctls) &&
            Objects.equals(fsGroup, __otherCasted.fsGroup) &&
            Objects.equals(hostIPC, __otherCasted.hostIPC) &&
            Objects.equals(hostNetwork, __otherCasted.hostNetwork) &&
            Objects.equals(hostPID, __otherCasted.hostPID) &&
            Objects.equals(hostPorts, __otherCasted.hostPorts) &&
            Objects.equals(privileged, __otherCasted.privileged) &&
            Objects.equals(readOnlyRootFilesystem, __otherCasted.readOnlyRootFilesystem) &&
            Objects.equals(requiredDropCapabilities, __otherCasted.requiredDropCapabilities) &&
            Objects.equals(runAsUser, __otherCasted.runAsUser) &&
            Objects.equals(seLinux, __otherCasted.seLinux) &&
            Objects.equals(supplementalGroups, __otherCasted.supplementalGroups) &&
            Objects.equals(volumes, __otherCasted.volumes);
    }
}
