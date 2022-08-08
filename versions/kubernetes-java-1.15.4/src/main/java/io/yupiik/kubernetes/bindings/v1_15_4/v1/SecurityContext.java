package io.yupiik.kubernetes.bindings.v1_15_4.v1;

import io.yupiik.kubernetes.bindings.v1_15_4.Validable;
import io.yupiik.kubernetes.bindings.v1_15_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SecurityContext implements Validable<SecurityContext> {
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
        // no-op
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
}
