package io.yupiik.kubernetes.bindings.v1_20_13;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContext {
    private Boolean allowPrivilegeEscalation;
    private StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextCapabilities capabilities;
    private Boolean privileged;
    private String procMount;
    private Boolean readOnlyRootFilesystem;
    private Integer runAsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextSeLinuxOptions seLinuxOptions;
    private StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextSeccompProfile seccompProfile;
    private StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions windowsOptions;

    public StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContext() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContext(final Boolean allowPrivilegeEscalation,
                                                                             final StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextCapabilities capabilities,
                                                                             final Boolean privileged,
                                                                             final String procMount,
                                                                             final Boolean readOnlyRootFilesystem,
                                                                             final Integer runAsGroup,
                                                                             final Boolean runAsNonRoot,
                                                                             final Integer runAsUser,
                                                                             final StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextSeLinuxOptions seLinuxOptions,
                                                                             final StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextSeccompProfile seccompProfile,
                                                                             final StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions windowsOptions) {
        // no-op
    }

    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(final Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextCapabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(final StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextCapabilities capabilities) {
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

    public StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextSeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextSeccompProfile getSeccompProfile() {
        return seccompProfile;
    }

    public void setSeccompProfile(final StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextSeccompProfile seccompProfile) {
        this.seccompProfile = seccompProfile;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions getWindowsOptions() {
        return windowsOptions;
    }

    public void setWindowsOptions(final StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContextWindowsOptions windowsOptions) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContext)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContext __otherCasted = (StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContext) __other;
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
