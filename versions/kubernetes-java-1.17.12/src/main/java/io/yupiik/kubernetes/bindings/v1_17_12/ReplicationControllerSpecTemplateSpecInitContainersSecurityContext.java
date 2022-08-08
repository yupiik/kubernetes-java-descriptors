package io.yupiik.kubernetes.bindings.v1_17_12;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecInitContainersSecurityContext {
    private Boolean allowPrivilegeEscalation;
    private ReplicationControllerSpecTemplateSpecInitContainersSecurityContextCapabilities capabilities;
    private Boolean privileged;
    private String procMount;
    private Boolean readOnlyRootFilesystem;
    private Integer runAsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private ReplicationControllerSpecTemplateSpecInitContainersSecurityContextSeLinuxOptions seLinuxOptions;
    private ReplicationControllerSpecTemplateSpecInitContainersSecurityContextWindowsOptions windowsOptions;

    public ReplicationControllerSpecTemplateSpecInitContainersSecurityContext() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersSecurityContext(final Boolean allowPrivilegeEscalation,
                                                                              final ReplicationControllerSpecTemplateSpecInitContainersSecurityContextCapabilities capabilities,
                                                                              final Boolean privileged,
                                                                              final String procMount,
                                                                              final Boolean readOnlyRootFilesystem,
                                                                              final Integer runAsGroup,
                                                                              final Boolean runAsNonRoot,
                                                                              final Integer runAsUser,
                                                                              final ReplicationControllerSpecTemplateSpecInitContainersSecurityContextSeLinuxOptions seLinuxOptions,
                                                                              final ReplicationControllerSpecTemplateSpecInitContainersSecurityContextWindowsOptions windowsOptions) {
        // no-op
    }

    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(final Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersSecurityContextCapabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(final ReplicationControllerSpecTemplateSpecInitContainersSecurityContextCapabilities capabilities) {
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

    public ReplicationControllerSpecTemplateSpecInitContainersSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final ReplicationControllerSpecTemplateSpecInitContainersSecurityContextSeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersSecurityContextWindowsOptions getWindowsOptions() {
        return windowsOptions;
    }

    public void setWindowsOptions(final ReplicationControllerSpecTemplateSpecInitContainersSecurityContextWindowsOptions windowsOptions) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecInitContainersSecurityContext)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecInitContainersSecurityContext __otherCasted = (ReplicationControllerSpecTemplateSpecInitContainersSecurityContext) __other;
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
}
