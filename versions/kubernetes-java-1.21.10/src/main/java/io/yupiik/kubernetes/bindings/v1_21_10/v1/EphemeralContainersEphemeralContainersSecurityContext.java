package io.yupiik.kubernetes.bindings.v1_21_10.v1;

import java.util.Objects;

public class EphemeralContainersEphemeralContainersSecurityContext {
    private Boolean allowPrivilegeEscalation;
    private EphemeralContainersEphemeralContainersSecurityContextCapabilities capabilities;
    private Boolean privileged;
    private String procMount;
    private Boolean readOnlyRootFilesystem;
    private Integer runAsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private EphemeralContainersEphemeralContainersSecurityContextSeLinuxOptions seLinuxOptions;
    private EphemeralContainersEphemeralContainersSecurityContextSeccompProfile seccompProfile;
    private EphemeralContainersEphemeralContainersSecurityContextWindowsOptions windowsOptions;

    public EphemeralContainersEphemeralContainersSecurityContext() {
        // no-op
    }

    public EphemeralContainersEphemeralContainersSecurityContext(final Boolean allowPrivilegeEscalation,
                                                                 final EphemeralContainersEphemeralContainersSecurityContextCapabilities capabilities,
                                                                 final Boolean privileged,
                                                                 final String procMount,
                                                                 final Boolean readOnlyRootFilesystem,
                                                                 final Integer runAsGroup,
                                                                 final Boolean runAsNonRoot,
                                                                 final Integer runAsUser,
                                                                 final EphemeralContainersEphemeralContainersSecurityContextSeLinuxOptions seLinuxOptions,
                                                                 final EphemeralContainersEphemeralContainersSecurityContextSeccompProfile seccompProfile,
                                                                 final EphemeralContainersEphemeralContainersSecurityContextWindowsOptions windowsOptions) {
        // no-op
    }

    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(final Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    public EphemeralContainersEphemeralContainersSecurityContextCapabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(final EphemeralContainersEphemeralContainersSecurityContextCapabilities capabilities) {
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

    public EphemeralContainersEphemeralContainersSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final EphemeralContainersEphemeralContainersSecurityContextSeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public EphemeralContainersEphemeralContainersSecurityContextSeccompProfile getSeccompProfile() {
        return seccompProfile;
    }

    public void setSeccompProfile(final EphemeralContainersEphemeralContainersSecurityContextSeccompProfile seccompProfile) {
        this.seccompProfile = seccompProfile;
    }

    public EphemeralContainersEphemeralContainersSecurityContextWindowsOptions getWindowsOptions() {
        return windowsOptions;
    }

    public void setWindowsOptions(final EphemeralContainersEphemeralContainersSecurityContextWindowsOptions windowsOptions) {
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
                seccompProfile,
                windowsOptions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EphemeralContainersEphemeralContainersSecurityContext)) {
            return false;
        }
        final EphemeralContainersEphemeralContainersSecurityContext __otherCasted = (EphemeralContainersEphemeralContainersSecurityContext) __other;
        return Objects.equals(allowPrivilegeEscalation, __otherCasted.allowPrivilegeEscalation) &&
            Objects.equals(capabilities, __otherCasted.capabilities) &&
            Objects.equals(privileged, __otherCasted.privileged) &&
            Objects.equals(procMount, __otherCasted.procMount) &&
            Objects.equals(readOnlyRootFilesystem, __otherCasted.readOnlyRootFilesystem) &&
            Objects.equals(runAsGroup, __otherCasted.runAsGroup) &&
            Objects.equals(runAsNonRoot, __otherCasted.runAsNonRoot) &&
            Objects.equals(runAsUser, __otherCasted.runAsUser) &&
            Objects.equals(seLinuxOptions, __otherCasted.seLinuxOptions) &&
            Objects.equals(seccompProfile, __otherCasted.seccompProfile) &&
            Objects.equals(windowsOptions, __otherCasted.windowsOptions);
    }
}
