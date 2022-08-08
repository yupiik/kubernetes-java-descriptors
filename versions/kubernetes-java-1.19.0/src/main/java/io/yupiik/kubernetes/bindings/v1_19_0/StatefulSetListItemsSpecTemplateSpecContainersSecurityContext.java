package io.yupiik.kubernetes.bindings.v1_19_0;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersSecurityContext {
    private Boolean allowPrivilegeEscalation;
    private StatefulSetListItemsSpecTemplateSpecContainersSecurityContextCapabilities capabilities;
    private Boolean privileged;
    private String procMount;
    private Boolean readOnlyRootFilesystem;
    private Integer runAsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeLinuxOptions seLinuxOptions;
    private StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile seccompProfile;
    private StatefulSetListItemsSpecTemplateSpecContainersSecurityContextWindowsOptions windowsOptions;

    public StatefulSetListItemsSpecTemplateSpecContainersSecurityContext() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersSecurityContext(final Boolean allowPrivilegeEscalation,
                                                                         final StatefulSetListItemsSpecTemplateSpecContainersSecurityContextCapabilities capabilities,
                                                                         final Boolean privileged,
                                                                         final String procMount,
                                                                         final Boolean readOnlyRootFilesystem,
                                                                         final Integer runAsGroup,
                                                                         final Boolean runAsNonRoot,
                                                                         final Integer runAsUser,
                                                                         final StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeLinuxOptions seLinuxOptions,
                                                                         final StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile seccompProfile,
                                                                         final StatefulSetListItemsSpecTemplateSpecContainersSecurityContextWindowsOptions windowsOptions) {
        // no-op
    }

    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(final Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersSecurityContextCapabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(final StatefulSetListItemsSpecTemplateSpecContainersSecurityContextCapabilities capabilities) {
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

    public StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile getSeccompProfile() {
        return seccompProfile;
    }

    public void setSeccompProfile(final StatefulSetListItemsSpecTemplateSpecContainersSecurityContextSeccompProfile seccompProfile) {
        this.seccompProfile = seccompProfile;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersSecurityContextWindowsOptions getWindowsOptions() {
        return windowsOptions;
    }

    public void setWindowsOptions(final StatefulSetListItemsSpecTemplateSpecContainersSecurityContextWindowsOptions windowsOptions) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersSecurityContext)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersSecurityContext __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersSecurityContext) __other;
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
