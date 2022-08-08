package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecEphemeralContainersSecurityContext {
    private Boolean allowPrivilegeEscalation;
    private StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextCapabilities capabilities;
    private Boolean privileged;
    private String procMount;
    private Boolean readOnlyRootFilesystem;
    private Integer runAsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextSeLinuxOptions seLinuxOptions;
    private StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile seccompProfile;
    private StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextWindowsOptions windowsOptions;

    public StatefulSetSpecTemplateSpecEphemeralContainersSecurityContext() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersSecurityContext(final Boolean allowPrivilegeEscalation,
                                                                         final StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextCapabilities capabilities,
                                                                         final Boolean privileged,
                                                                         final String procMount,
                                                                         final Boolean readOnlyRootFilesystem,
                                                                         final Integer runAsGroup,
                                                                         final Boolean runAsNonRoot,
                                                                         final Integer runAsUser,
                                                                         final StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextSeLinuxOptions seLinuxOptions,
                                                                         final StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile seccompProfile,
                                                                         final StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextWindowsOptions windowsOptions) {
        // no-op
    }

    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(final Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextCapabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(final StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextCapabilities capabilities) {
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

    public StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextSeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile getSeccompProfile() {
        return seccompProfile;
    }

    public void setSeccompProfile(final StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextSeccompProfile seccompProfile) {
        this.seccompProfile = seccompProfile;
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextWindowsOptions getWindowsOptions() {
        return windowsOptions;
    }

    public void setWindowsOptions(final StatefulSetSpecTemplateSpecEphemeralContainersSecurityContextWindowsOptions windowsOptions) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecEphemeralContainersSecurityContext)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecEphemeralContainersSecurityContext __otherCasted = (StatefulSetSpecTemplateSpecEphemeralContainersSecurityContext) __other;
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
