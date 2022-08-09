package io.yupiik.kubernetes.bindings.v1_17_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_17_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_0.Validable;
import io.yupiik.kubernetes.bindings.v1_17_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodSecurityPolicySpec implements Validable<PodSecurityPolicySpec>, Exportable {
    private Boolean allowPrivilegeEscalation;
    private List<AllowedCSIDriver> allowedCSIDrivers;
    private List<String> allowedCapabilities;
    private List<AllowedFlexVolume> allowedFlexVolumes;
    private List<AllowedHostPath> allowedHostPaths;
    private List<String> allowedProcMountTypes;
    private List<String> allowedUnsafeSysctls;
    private List<String> defaultAddCapabilities;
    private Boolean defaultAllowPrivilegeEscalation;
    private List<String> forbiddenSysctls;
    private FSGroupStrategyOptions fsGroup;
    private Boolean hostIPC;
    private Boolean hostNetwork;
    private Boolean hostPID;
    private List<HostPortRange> hostPorts;
    private Boolean privileged;
    private Boolean readOnlyRootFilesystem;
    private List<String> requiredDropCapabilities;
    private RunAsGroupStrategyOptions runAsGroup;
    private RunAsUserStrategyOptions runAsUser;
    private RuntimeClassStrategyOptions runtimeClass;
    private SELinuxStrategyOptions seLinux;
    private SupplementalGroupsStrategyOptions supplementalGroups;
    private List<String> volumes;

    public PodSecurityPolicySpec() {
        // no-op
    }

    public PodSecurityPolicySpec(final Boolean allowPrivilegeEscalation,
                                 final List<AllowedCSIDriver> allowedCSIDrivers,
                                 final List<String> allowedCapabilities,
                                 final List<AllowedFlexVolume> allowedFlexVolumes,
                                 final List<AllowedHostPath> allowedHostPaths,
                                 final List<String> allowedProcMountTypes,
                                 final List<String> allowedUnsafeSysctls,
                                 final List<String> defaultAddCapabilities,
                                 final Boolean defaultAllowPrivilegeEscalation,
                                 final List<String> forbiddenSysctls,
                                 final FSGroupStrategyOptions fsGroup,
                                 final Boolean hostIPC,
                                 final Boolean hostNetwork,
                                 final Boolean hostPID,
                                 final List<HostPortRange> hostPorts,
                                 final Boolean privileged,
                                 final Boolean readOnlyRootFilesystem,
                                 final List<String> requiredDropCapabilities,
                                 final RunAsGroupStrategyOptions runAsGroup,
                                 final RunAsUserStrategyOptions runAsUser,
                                 final RuntimeClassStrategyOptions runtimeClass,
                                 final SELinuxStrategyOptions seLinux,
                                 final SupplementalGroupsStrategyOptions supplementalGroups,
                                 final List<String> volumes) {
        // no-op
    }

    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(final Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    public List<AllowedCSIDriver> getAllowedCSIDrivers() {
        return allowedCSIDrivers;
    }

    public void setAllowedCSIDrivers(final List<AllowedCSIDriver> allowedCSIDrivers) {
        this.allowedCSIDrivers = allowedCSIDrivers;
    }

    public List<String> getAllowedCapabilities() {
        return allowedCapabilities;
    }

    public void setAllowedCapabilities(final List<String> allowedCapabilities) {
        this.allowedCapabilities = allowedCapabilities;
    }

    public List<AllowedFlexVolume> getAllowedFlexVolumes() {
        return allowedFlexVolumes;
    }

    public void setAllowedFlexVolumes(final List<AllowedFlexVolume> allowedFlexVolumes) {
        this.allowedFlexVolumes = allowedFlexVolumes;
    }

    public List<AllowedHostPath> getAllowedHostPaths() {
        return allowedHostPaths;
    }

    public void setAllowedHostPaths(final List<AllowedHostPath> allowedHostPaths) {
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

    public FSGroupStrategyOptions getFsGroup() {
        return fsGroup;
    }

    public void setFsGroup(final FSGroupStrategyOptions fsGroup) {
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

    public List<HostPortRange> getHostPorts() {
        return hostPorts;
    }

    public void setHostPorts(final List<HostPortRange> hostPorts) {
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

    public RunAsGroupStrategyOptions getRunAsGroup() {
        return runAsGroup;
    }

    public void setRunAsGroup(final RunAsGroupStrategyOptions runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    public RunAsUserStrategyOptions getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(final RunAsUserStrategyOptions runAsUser) {
        this.runAsUser = runAsUser;
    }

    public RuntimeClassStrategyOptions getRuntimeClass() {
        return runtimeClass;
    }

    public void setRuntimeClass(final RuntimeClassStrategyOptions runtimeClass) {
        this.runtimeClass = runtimeClass;
    }

    public SELinuxStrategyOptions getSeLinux() {
        return seLinux;
    }

    public void setSeLinux(final SELinuxStrategyOptions seLinux) {
        this.seLinux = seLinux;
    }

    public SupplementalGroupsStrategyOptions getSupplementalGroups() {
        return supplementalGroups;
    }

    public void setSupplementalGroups(final SupplementalGroupsStrategyOptions supplementalGroups) {
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

    public PodSecurityPolicySpec allowPrivilegeEscalation(final Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        return this;
    }

    public PodSecurityPolicySpec allowedCSIDrivers(final List<AllowedCSIDriver> allowedCSIDrivers) {
        this.allowedCSIDrivers = allowedCSIDrivers;
        return this;
    }

    public PodSecurityPolicySpec allowedCapabilities(final List<String> allowedCapabilities) {
        this.allowedCapabilities = allowedCapabilities;
        return this;
    }

    public PodSecurityPolicySpec allowedFlexVolumes(final List<AllowedFlexVolume> allowedFlexVolumes) {
        this.allowedFlexVolumes = allowedFlexVolumes;
        return this;
    }

    public PodSecurityPolicySpec allowedHostPaths(final List<AllowedHostPath> allowedHostPaths) {
        this.allowedHostPaths = allowedHostPaths;
        return this;
    }

    public PodSecurityPolicySpec allowedProcMountTypes(final List<String> allowedProcMountTypes) {
        this.allowedProcMountTypes = allowedProcMountTypes;
        return this;
    }

    public PodSecurityPolicySpec allowedUnsafeSysctls(final List<String> allowedUnsafeSysctls) {
        this.allowedUnsafeSysctls = allowedUnsafeSysctls;
        return this;
    }

    public PodSecurityPolicySpec defaultAddCapabilities(final List<String> defaultAddCapabilities) {
        this.defaultAddCapabilities = defaultAddCapabilities;
        return this;
    }

    public PodSecurityPolicySpec defaultAllowPrivilegeEscalation(final Boolean defaultAllowPrivilegeEscalation) {
        this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
        return this;
    }

    public PodSecurityPolicySpec forbiddenSysctls(final List<String> forbiddenSysctls) {
        this.forbiddenSysctls = forbiddenSysctls;
        return this;
    }

    public PodSecurityPolicySpec fsGroup(final FSGroupStrategyOptions fsGroup) {
        this.fsGroup = fsGroup;
        return this;
    }

    public PodSecurityPolicySpec hostIPC(final Boolean hostIPC) {
        this.hostIPC = hostIPC;
        return this;
    }

    public PodSecurityPolicySpec hostNetwork(final Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    public PodSecurityPolicySpec hostPID(final Boolean hostPID) {
        this.hostPID = hostPID;
        return this;
    }

    public PodSecurityPolicySpec hostPorts(final List<HostPortRange> hostPorts) {
        this.hostPorts = hostPorts;
        return this;
    }

    public PodSecurityPolicySpec privileged(final Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    public PodSecurityPolicySpec readOnlyRootFilesystem(final Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        return this;
    }

    public PodSecurityPolicySpec requiredDropCapabilities(final List<String> requiredDropCapabilities) {
        this.requiredDropCapabilities = requiredDropCapabilities;
        return this;
    }

    public PodSecurityPolicySpec runAsGroup(final RunAsGroupStrategyOptions runAsGroup) {
        this.runAsGroup = runAsGroup;
        return this;
    }

    public PodSecurityPolicySpec runAsUser(final RunAsUserStrategyOptions runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }

    public PodSecurityPolicySpec runtimeClass(final RuntimeClassStrategyOptions runtimeClass) {
        this.runtimeClass = runtimeClass;
        return this;
    }

    public PodSecurityPolicySpec seLinux(final SELinuxStrategyOptions seLinux) {
        this.seLinux = seLinux;
        return this;
    }

    public PodSecurityPolicySpec supplementalGroups(final SupplementalGroupsStrategyOptions supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
        return this;
    }

    public PodSecurityPolicySpec volumes(final List<String> volumes) {
        this.volumes = volumes;
        return this;
    }

    @Override
    public PodSecurityPolicySpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (fsGroup == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "fsGroup", "fsGroup",
                "Missing 'fsGroup' attribute.", true));
        }
        if (runAsUser == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "runAsUser", "runAsUser",
                "Missing 'runAsUser' attribute.", true));
        }
        if (seLinux == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "seLinux", "seLinux",
                "Missing 'seLinux' attribute.", true));
        }
        if (supplementalGroups == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "supplementalGroups", "supplementalGroups",
                "Missing 'supplementalGroups' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (allowPrivilegeEscalation != null ? "\"allowPrivilegeEscalation\":" + allowPrivilegeEscalation : ""),
                    (allowedCSIDrivers != null ? "\"allowedCSIDrivers\":" + allowedCSIDrivers.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (allowedCapabilities != null ? "\"allowedCapabilities\":" + allowedCapabilities.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (allowedFlexVolumes != null ? "\"allowedFlexVolumes\":" + allowedFlexVolumes.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (allowedHostPaths != null ? "\"allowedHostPaths\":" + allowedHostPaths.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (allowedProcMountTypes != null ? "\"allowedProcMountTypes\":" + allowedProcMountTypes.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (allowedUnsafeSysctls != null ? "\"allowedUnsafeSysctls\":" + allowedUnsafeSysctls.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (defaultAddCapabilities != null ? "\"defaultAddCapabilities\":" + defaultAddCapabilities.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (defaultAllowPrivilegeEscalation != null ? "\"defaultAllowPrivilegeEscalation\":" + defaultAllowPrivilegeEscalation : ""),
                    (forbiddenSysctls != null ? "\"forbiddenSysctls\":" + forbiddenSysctls.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (fsGroup != null ? "\"fsGroup\":" + fsGroup.asJson() : ""),
                    (hostIPC != null ? "\"hostIPC\":" + hostIPC : ""),
                    (hostNetwork != null ? "\"hostNetwork\":" + hostNetwork : ""),
                    (hostPID != null ? "\"hostPID\":" + hostPID : ""),
                    (hostPorts != null ? "\"hostPorts\":" + hostPorts.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (privileged != null ? "\"privileged\":" + privileged : ""),
                    (readOnlyRootFilesystem != null ? "\"readOnlyRootFilesystem\":" + readOnlyRootFilesystem : ""),
                    (requiredDropCapabilities != null ? "\"requiredDropCapabilities\":" + requiredDropCapabilities.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (runAsGroup != null ? "\"runAsGroup\":" + runAsGroup.asJson() : ""),
                    (runAsUser != null ? "\"runAsUser\":" + runAsUser.asJson() : ""),
                    (runtimeClass != null ? "\"runtimeClass\":" + runtimeClass.asJson() : ""),
                    (seLinux != null ? "\"seLinux\":" + seLinux.asJson() : ""),
                    (supplementalGroups != null ? "\"supplementalGroups\":" + supplementalGroups.asJson() : ""),
                    (volumes != null ? "\"volumes\":" + volumes.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
