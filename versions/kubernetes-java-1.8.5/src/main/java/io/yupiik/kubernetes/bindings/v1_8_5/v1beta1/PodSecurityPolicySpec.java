/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.v1_8_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_8_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_5.Validable;
import io.yupiik.kubernetes.bindings.v1_8_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodSecurityPolicySpec implements Validable<PodSecurityPolicySpec>, Exportable {
    private Boolean allowPrivilegeEscalation;
    private List<String> allowedCapabilities;
    private List<AllowedHostPath> allowedHostPaths;
    private List<String> defaultAddCapabilities;
    private Boolean defaultAllowPrivilegeEscalation;
    private FSGroupStrategyOptions fsGroup;
    private Boolean hostIPC;
    private Boolean hostNetwork;
    private Boolean hostPID;
    private List<HostPortRange> hostPorts;
    private Boolean privileged;
    private Boolean readOnlyRootFilesystem;
    private List<String> requiredDropCapabilities;
    private RunAsUserStrategyOptions runAsUser;
    private SELinuxStrategyOptions seLinux;
    private SupplementalGroupsStrategyOptions supplementalGroups;
    private List<String> volumes;

    public PodSecurityPolicySpec() {
        // no-op
    }

    public PodSecurityPolicySpec(final Boolean allowPrivilegeEscalation,
                                 final List<String> allowedCapabilities,
                                 final List<AllowedHostPath> allowedHostPaths,
                                 final List<String> defaultAddCapabilities,
                                 final Boolean defaultAllowPrivilegeEscalation,
                                 final FSGroupStrategyOptions fsGroup,
                                 final Boolean hostIPC,
                                 final Boolean hostNetwork,
                                 final Boolean hostPID,
                                 final List<HostPortRange> hostPorts,
                                 final Boolean privileged,
                                 final Boolean readOnlyRootFilesystem,
                                 final List<String> requiredDropCapabilities,
                                 final RunAsUserStrategyOptions runAsUser,
                                 final SELinuxStrategyOptions seLinux,
                                 final SupplementalGroupsStrategyOptions supplementalGroups,
                                 final List<String> volumes) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        this.allowedCapabilities = allowedCapabilities;
        this.allowedHostPaths = allowedHostPaths;
        this.defaultAddCapabilities = defaultAddCapabilities;
        this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
        this.fsGroup = fsGroup;
        this.hostIPC = hostIPC;
        this.hostNetwork = hostNetwork;
        this.hostPID = hostPID;
        this.hostPorts = hostPorts;
        this.privileged = privileged;
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        this.requiredDropCapabilities = requiredDropCapabilities;
        this.runAsUser = runAsUser;
        this.seLinux = seLinux;
        this.supplementalGroups = supplementalGroups;
        this.volumes = volumes;
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

    public List<AllowedHostPath> getAllowedHostPaths() {
        return allowedHostPaths;
    }

    public void setAllowedHostPaths(final List<AllowedHostPath> allowedHostPaths) {
        this.allowedHostPaths = allowedHostPaths;
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

    public RunAsUserStrategyOptions getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(final RunAsUserStrategyOptions runAsUser) {
        this.runAsUser = runAsUser;
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
                allowedCapabilities,
                allowedHostPaths,
                defaultAddCapabilities,
                defaultAllowPrivilegeEscalation,
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
            Objects.equals(allowedHostPaths, __otherCasted.allowedHostPaths) &&
            Objects.equals(defaultAddCapabilities, __otherCasted.defaultAddCapabilities) &&
            Objects.equals(defaultAllowPrivilegeEscalation, __otherCasted.defaultAllowPrivilegeEscalation) &&
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

    public PodSecurityPolicySpec allowPrivilegeEscalation(final Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        return this;
    }

    public PodSecurityPolicySpec allowedCapabilities(final List<String> allowedCapabilities) {
        this.allowedCapabilities = allowedCapabilities;
        return this;
    }

    public PodSecurityPolicySpec allowedHostPaths(final List<AllowedHostPath> allowedHostPaths) {
        this.allowedHostPaths = allowedHostPaths;
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

    public PodSecurityPolicySpec runAsUser(final RunAsUserStrategyOptions runAsUser) {
        this.runAsUser = runAsUser;
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
                    (allowedCapabilities != null ? "\"allowedCapabilities\":" + allowedCapabilities.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (allowedHostPaths != null ? "\"allowedHostPaths\":" + allowedHostPaths.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (defaultAddCapabilities != null ? "\"defaultAddCapabilities\":" + defaultAddCapabilities.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (defaultAllowPrivilegeEscalation != null ? "\"defaultAllowPrivilegeEscalation\":" + defaultAllowPrivilegeEscalation : ""),
                    (fsGroup != null ? "\"fsGroup\":" + fsGroup.asJson() : ""),
                    (hostIPC != null ? "\"hostIPC\":" + hostIPC : ""),
                    (hostNetwork != null ? "\"hostNetwork\":" + hostNetwork : ""),
                    (hostPID != null ? "\"hostPID\":" + hostPID : ""),
                    (hostPorts != null ? "\"hostPorts\":" + hostPorts.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (privileged != null ? "\"privileged\":" + privileged : ""),
                    (readOnlyRootFilesystem != null ? "\"readOnlyRootFilesystem\":" + readOnlyRootFilesystem : ""),
                    (requiredDropCapabilities != null ? "\"requiredDropCapabilities\":" + requiredDropCapabilities.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (runAsUser != null ? "\"runAsUser\":" + runAsUser.asJson() : ""),
                    (seLinux != null ? "\"seLinux\":" + seLinux.asJson() : ""),
                    (supplementalGroups != null ? "\"supplementalGroups\":" + supplementalGroups.asJson() : ""),
                    (volumes != null ? "\"volumes\":" + volumes.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
