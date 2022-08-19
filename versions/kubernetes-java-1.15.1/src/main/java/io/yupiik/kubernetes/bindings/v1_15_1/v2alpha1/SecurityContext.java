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
package io.yupiik.kubernetes.bindings.v1_15_1.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_15_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_15_1.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SecurityContext implements Validable<SecurityContext>, Exportable {
    private Boolean allowPrivilegeEscalation;
    private Capabilities capabilities;
    private Boolean privileged;
    private String procMount;
    private Boolean readOnlyRootFilesystem;
    private Integer runAsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private SELinuxOptions seLinuxOptions;
    private WindowsSecurityContextOptions windowsOptions;

    public SecurityContext() {
        // no-op
    }

    public SecurityContext(final Boolean allowPrivilegeEscalation,
                           final Capabilities capabilities,
                           final Boolean privileged,
                           final String procMount,
                           final Boolean readOnlyRootFilesystem,
                           final Integer runAsGroup,
                           final Boolean runAsNonRoot,
                           final Integer runAsUser,
                           final SELinuxOptions seLinuxOptions,
                           final WindowsSecurityContextOptions windowsOptions) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        this.capabilities = capabilities;
        this.privileged = privileged;
        this.procMount = procMount;
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        this.runAsGroup = runAsGroup;
        this.runAsNonRoot = runAsNonRoot;
        this.runAsUser = runAsUser;
        this.seLinuxOptions = seLinuxOptions;
        this.windowsOptions = windowsOptions;
    }

    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(final Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    public Capabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(final Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(final Boolean privileged) {
        this.privileged = privileged;
    }

    public String getProcMount() {
        return procMount;
    }

    public void setProcMount(final String procMount) {
        this.procMount = procMount;
    }

    public Boolean getReadOnlyRootFilesystem() {
        return readOnlyRootFilesystem;
    }

    public void setReadOnlyRootFilesystem(final Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    }

    public Integer getRunAsGroup() {
        return runAsGroup;
    }

    public void setRunAsGroup(final Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    public Boolean getRunAsNonRoot() {
        return runAsNonRoot;
    }

    public void setRunAsNonRoot(final Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
    }

    public Integer getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(final Integer runAsUser) {
        this.runAsUser = runAsUser;
    }

    public SELinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public WindowsSecurityContextOptions getWindowsOptions() {
        return windowsOptions;
    }

    public void setWindowsOptions(final WindowsSecurityContextOptions windowsOptions) {
        this.windowsOptions = windowsOptions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allowPrivilegeEscalation,
                capabilities,
                privileged,
                procMount,
                readOnlyRootFilesystem,
                runAsGroup,
                runAsNonRoot,
                runAsUser,
                seLinuxOptions,
                windowsOptions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SecurityContext)) {
            return false;
        }
        final SecurityContext __otherCasted = (SecurityContext) __other;
        return Objects.equals(allowPrivilegeEscalation, __otherCasted.allowPrivilegeEscalation) &&
            Objects.equals(capabilities, __otherCasted.capabilities) &&
            Objects.equals(privileged, __otherCasted.privileged) &&
            Objects.equals(procMount, __otherCasted.procMount) &&
            Objects.equals(readOnlyRootFilesystem, __otherCasted.readOnlyRootFilesystem) &&
            Objects.equals(runAsGroup, __otherCasted.runAsGroup) &&
            Objects.equals(runAsNonRoot, __otherCasted.runAsNonRoot) &&
            Objects.equals(runAsUser, __otherCasted.runAsUser) &&
            Objects.equals(seLinuxOptions, __otherCasted.seLinuxOptions) &&
            Objects.equals(windowsOptions, __otherCasted.windowsOptions);
    }

    public SecurityContext allowPrivilegeEscalation(final Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        return this;
    }

    public SecurityContext capabilities(final Capabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    public SecurityContext privileged(final Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    public SecurityContext procMount(final String procMount) {
        this.procMount = procMount;
        return this;
    }

    public SecurityContext readOnlyRootFilesystem(final Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        return this;
    }

    public SecurityContext runAsGroup(final Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
        return this;
    }

    public SecurityContext runAsNonRoot(final Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
        return this;
    }

    public SecurityContext runAsUser(final Integer runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }

    public SecurityContext seLinuxOptions(final SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
        return this;
    }

    public SecurityContext windowsOptions(final WindowsSecurityContextOptions windowsOptions) {
        this.windowsOptions = windowsOptions;
        return this;
    }

    @Override
    public SecurityContext validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (allowPrivilegeEscalation != null ? "\"allowPrivilegeEscalation\":" + allowPrivilegeEscalation : ""),
                    (capabilities != null ? "\"capabilities\":" + capabilities.asJson() : ""),
                    (privileged != null ? "\"privileged\":" + privileged : ""),
                    (procMount != null ? "\"procMount\":\"" +  JsonStrings.escapeJson(procMount) + "\"" : ""),
                    (readOnlyRootFilesystem != null ? "\"readOnlyRootFilesystem\":" + readOnlyRootFilesystem : ""),
                    (runAsGroup != null ? "\"runAsGroup\":" + runAsGroup : ""),
                    (runAsNonRoot != null ? "\"runAsNonRoot\":" + runAsNonRoot : ""),
                    (runAsUser != null ? "\"runAsUser\":" + runAsUser : ""),
                    (seLinuxOptions != null ? "\"seLinuxOptions\":" + seLinuxOptions.asJson() : ""),
                    (windowsOptions != null ? "\"windowsOptions\":" + windowsOptions.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
