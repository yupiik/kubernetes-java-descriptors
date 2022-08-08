package io.yupiik.kubernetes.bindings.v1_15_10.v1beta1;

import java.util.List;
import java.util.Objects;

public class PodSecurityPolicyListItemsSpec {
    private Boolean allowPrivilegeEscalation;
    private List<PodSecurityPolicyListItemsSpecAllowedCSIDrivers> allowedCSIDrivers;
    private List<String> allowedCapabilities;
    private List<PodSecurityPolicyListItemsSpecAllowedFlexVolumes> allowedFlexVolumes;
    private List<PodSecurityPolicyListItemsSpecAllowedHostPaths> allowedHostPaths;
    private List<String> allowedProcMountTypes;
    private List<String> allowedUnsafeSysctls;
    private List<String> defaultAddCapabilities;
    private Boolean defaultAllowPrivilegeEscalation;
    private List<String> forbiddenSysctls;
    private PodSecurityPolicyListItemsSpecFsGroup fsGroup;
    private Boolean hostIPC;
    private Boolean hostNetwork;
    private Boolean hostPID;
    private List<PodSecurityPolicyListItemsSpecHostPorts> hostPorts;
    private Boolean privileged;
    private Boolean readOnlyRootFilesystem;
    private List<String> requiredDropCapabilities;
    private PodSecurityPolicyListItemsSpecRunAsGroup runAsGroup;
    private PodSecurityPolicyListItemsSpecRunAsUser runAsUser;
    private PodSecurityPolicyListItemsSpecRuntimeClass runtimeClass;
    private PodSecurityPolicyListItemsSpecSeLinux seLinux;
    private PodSecurityPolicyListItemsSpecSupplementalGroups supplementalGroups;
    private List<String> volumes;

    public PodSecurityPolicyListItemsSpec() {
        // no-op
    }

    public PodSecurityPolicyListItemsSpec(final Boolean allowPrivilegeEscalation,
                                          final List<PodSecurityPolicyListItemsSpecAllowedCSIDrivers> allowedCSIDrivers,
                                          final List<String> allowedCapabilities,
                                          final List<PodSecurityPolicyListItemsSpecAllowedFlexVolumes> allowedFlexVolumes,
                                          final List<PodSecurityPolicyListItemsSpecAllowedHostPaths> allowedHostPaths,
                                          final List<String> allowedProcMountTypes,
                                          final List<String> allowedUnsafeSysctls,
                                          final List<String> defaultAddCapabilities,
                                          final Boolean defaultAllowPrivilegeEscalation,
                                          final List<String> forbiddenSysctls,
                                          final PodSecurityPolicyListItemsSpecFsGroup fsGroup,
                                          final Boolean hostIPC,
                                          final Boolean hostNetwork,
                                          final Boolean hostPID,
                                          final List<PodSecurityPolicyListItemsSpecHostPorts> hostPorts,
                                          final Boolean privileged,
                                          final Boolean readOnlyRootFilesystem,
                                          final List<String> requiredDropCapabilities,
                                          final PodSecurityPolicyListItemsSpecRunAsGroup runAsGroup,
                                          final PodSecurityPolicyListItemsSpecRunAsUser runAsUser,
                                          final PodSecurityPolicyListItemsSpecRuntimeClass runtimeClass,
                                          final PodSecurityPolicyListItemsSpecSeLinux seLinux,
                                          final PodSecurityPolicyListItemsSpecSupplementalGroups supplementalGroups,
                                          final List<String> volumes) {
        // no-op
    }

    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(final Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    public List<PodSecurityPolicyListItemsSpecAllowedCSIDrivers> getAllowedCSIDrivers() {
        return allowedCSIDrivers;
    }

    public void setAllowedCSIDrivers(final List<PodSecurityPolicyListItemsSpecAllowedCSIDrivers> allowedCSIDrivers) {
        this.allowedCSIDrivers = allowedCSIDrivers;
    }

    public List<String> getAllowedCapabilities() {
        return allowedCapabilities;
    }

    public void setAllowedCapabilities(final List<String> allowedCapabilities) {
        this.allowedCapabilities = allowedCapabilities;
    }

    public List<PodSecurityPolicyListItemsSpecAllowedFlexVolumes> getAllowedFlexVolumes() {
        return allowedFlexVolumes;
    }

    public void setAllowedFlexVolumes(final List<PodSecurityPolicyListItemsSpecAllowedFlexVolumes> allowedFlexVolumes) {
        this.allowedFlexVolumes = allowedFlexVolumes;
    }

    public List<PodSecurityPolicyListItemsSpecAllowedHostPaths> getAllowedHostPaths() {
        return allowedHostPaths;
    }

    public void setAllowedHostPaths(final List<PodSecurityPolicyListItemsSpecAllowedHostPaths> allowedHostPaths) {
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

    public PodSecurityPolicyListItemsSpecFsGroup getFsGroup() {
        return fsGroup;
    }

    public void setFsGroup(final PodSecurityPolicyListItemsSpecFsGroup fsGroup) {
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

    public List<PodSecurityPolicyListItemsSpecHostPorts> getHostPorts() {
        return hostPorts;
    }

    public void setHostPorts(final List<PodSecurityPolicyListItemsSpecHostPorts> hostPorts) {
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

    public PodSecurityPolicyListItemsSpecRunAsGroup getRunAsGroup() {
        return runAsGroup;
    }

    public void setRunAsGroup(final PodSecurityPolicyListItemsSpecRunAsGroup runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    public PodSecurityPolicyListItemsSpecRunAsUser getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(final PodSecurityPolicyListItemsSpecRunAsUser runAsUser) {
        this.runAsUser = runAsUser;
    }

    public PodSecurityPolicyListItemsSpecRuntimeClass getRuntimeClass() {
        return runtimeClass;
    }

    public void setRuntimeClass(final PodSecurityPolicyListItemsSpecRuntimeClass runtimeClass) {
        this.runtimeClass = runtimeClass;
    }

    public PodSecurityPolicyListItemsSpecSeLinux getSeLinux() {
        return seLinux;
    }

    public void setSeLinux(final PodSecurityPolicyListItemsSpecSeLinux seLinux) {
        this.seLinux = seLinux;
    }

    public PodSecurityPolicyListItemsSpecSupplementalGroups getSupplementalGroups() {
        return supplementalGroups;
    }

    public void setSupplementalGroups(final PodSecurityPolicyListItemsSpecSupplementalGroups supplementalGroups) {
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
        if (!(__other instanceof PodSecurityPolicyListItemsSpec)) {
            return false;
        }
        final PodSecurityPolicyListItemsSpec __otherCasted = (PodSecurityPolicyListItemsSpec) __other;
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
