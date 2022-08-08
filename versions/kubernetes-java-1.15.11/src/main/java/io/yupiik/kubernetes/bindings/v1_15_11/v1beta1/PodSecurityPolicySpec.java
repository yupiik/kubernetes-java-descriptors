package io.yupiik.kubernetes.bindings.v1_15_11.v1beta1;

import java.util.List;
import java.util.Objects;

public class PodSecurityPolicySpec {
    private Boolean allowPrivilegeEscalation;
    private List<PodSecurityPolicySpecAllowedCSIDrivers> allowedCSIDrivers;
    private List<String> allowedCapabilities;
    private List<PodSecurityPolicySpecAllowedFlexVolumes> allowedFlexVolumes;
    private List<PodSecurityPolicySpecAllowedHostPaths> allowedHostPaths;
    private List<String> allowedProcMountTypes;
    private List<String> allowedUnsafeSysctls;
    private List<String> defaultAddCapabilities;
    private Boolean defaultAllowPrivilegeEscalation;
    private List<String> forbiddenSysctls;
    private PodSecurityPolicySpecFsGroup fsGroup;
    private Boolean hostIPC;
    private Boolean hostNetwork;
    private Boolean hostPID;
    private List<PodSecurityPolicySpecHostPorts> hostPorts;
    private Boolean privileged;
    private Boolean readOnlyRootFilesystem;
    private List<String> requiredDropCapabilities;
    private PodSecurityPolicySpecRunAsGroup runAsGroup;
    private PodSecurityPolicySpecRunAsUser runAsUser;
    private PodSecurityPolicySpecRuntimeClass runtimeClass;
    private PodSecurityPolicySpecSeLinux seLinux;
    private PodSecurityPolicySpecSupplementalGroups supplementalGroups;
    private List<String> volumes;

    public PodSecurityPolicySpec() {
        // no-op
    }

    public PodSecurityPolicySpec(final Boolean allowPrivilegeEscalation,
                                 final List<PodSecurityPolicySpecAllowedCSIDrivers> allowedCSIDrivers,
                                 final List<String> allowedCapabilities,
                                 final List<PodSecurityPolicySpecAllowedFlexVolumes> allowedFlexVolumes,
                                 final List<PodSecurityPolicySpecAllowedHostPaths> allowedHostPaths,
                                 final List<String> allowedProcMountTypes,
                                 final List<String> allowedUnsafeSysctls,
                                 final List<String> defaultAddCapabilities,
                                 final Boolean defaultAllowPrivilegeEscalation,
                                 final List<String> forbiddenSysctls,
                                 final PodSecurityPolicySpecFsGroup fsGroup,
                                 final Boolean hostIPC,
                                 final Boolean hostNetwork,
                                 final Boolean hostPID,
                                 final List<PodSecurityPolicySpecHostPorts> hostPorts,
                                 final Boolean privileged,
                                 final Boolean readOnlyRootFilesystem,
                                 final List<String> requiredDropCapabilities,
                                 final PodSecurityPolicySpecRunAsGroup runAsGroup,
                                 final PodSecurityPolicySpecRunAsUser runAsUser,
                                 final PodSecurityPolicySpecRuntimeClass runtimeClass,
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

    public List<PodSecurityPolicySpecAllowedCSIDrivers> getAllowedCSIDrivers() {
        return allowedCSIDrivers;
    }

    public void setAllowedCSIDrivers(final List<PodSecurityPolicySpecAllowedCSIDrivers> allowedCSIDrivers) {
        this.allowedCSIDrivers = allowedCSIDrivers;
    }

    public List<String> getAllowedCapabilities() {
        return allowedCapabilities;
    }

    public void setAllowedCapabilities(final List<String> allowedCapabilities) {
        this.allowedCapabilities = allowedCapabilities;
    }

    public List<PodSecurityPolicySpecAllowedFlexVolumes> getAllowedFlexVolumes() {
        return allowedFlexVolumes;
    }

    public void setAllowedFlexVolumes(final List<PodSecurityPolicySpecAllowedFlexVolumes> allowedFlexVolumes) {
        this.allowedFlexVolumes = allowedFlexVolumes;
    }

    public List<PodSecurityPolicySpecAllowedHostPaths> getAllowedHostPaths() {
        return allowedHostPaths;
    }

    public void setAllowedHostPaths(final List<PodSecurityPolicySpecAllowedHostPaths> allowedHostPaths) {
        this.allowedHostPaths = allowedHostPaths;
    }

    public List<String> getAllowedProcMountTypes() {
        return allowedProcMountTypes;
    }

    public void setAllowedProcMountTypes(final List<String> allowedProcMountTypes) {
        this.allowedProcMountTypes = allowedProcMountTypes;
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

    public List<PodSecurityPolicySpecHostPorts> getHostPorts() {
        return hostPorts;
    }

    public void setHostPorts(final List<PodSecurityPolicySpecHostPorts> hostPorts) {
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

    public PodSecurityPolicySpecRunAsGroup getRunAsGroup() {
        return runAsGroup;
    }

    public void setRunAsGroup(final PodSecurityPolicySpecRunAsGroup runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    public PodSecurityPolicySpecRunAsUser getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(final PodSecurityPolicySpecRunAsUser runAsUser) {
        this.runAsUser = runAsUser;
    }

    public PodSecurityPolicySpecRuntimeClass getRuntimeClass() {
        return runtimeClass;
    }

    public void setRuntimeClass(final PodSecurityPolicySpecRuntimeClass runtimeClass) {
        this.runtimeClass = runtimeClass;
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
                allowedCSIDrivers,
                allowedCapabilities,
                allowedFlexVolumes,
                allowedHostPaths,
                allowedProcMountTypes,
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
                runAsGroup,
                runAsUser,
                runtimeClass,
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
            Objects.equals(allowedCSIDrivers, __otherCasted.allowedCSIDrivers) &&
            Objects.equals(allowedCapabilities, __otherCasted.allowedCapabilities) &&
            Objects.equals(allowedFlexVolumes, __otherCasted.allowedFlexVolumes) &&
            Objects.equals(allowedHostPaths, __otherCasted.allowedHostPaths) &&
            Objects.equals(allowedProcMountTypes, __otherCasted.allowedProcMountTypes) &&
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
            Objects.equals(runAsGroup, __otherCasted.runAsGroup) &&
            Objects.equals(runAsUser, __otherCasted.runAsUser) &&
            Objects.equals(runtimeClass, __otherCasted.runtimeClass) &&
            Objects.equals(seLinux, __otherCasted.seLinux) &&
            Objects.equals(supplementalGroups, __otherCasted.supplementalGroups) &&
            Objects.equals(volumes, __otherCasted.volumes);
    }
}
