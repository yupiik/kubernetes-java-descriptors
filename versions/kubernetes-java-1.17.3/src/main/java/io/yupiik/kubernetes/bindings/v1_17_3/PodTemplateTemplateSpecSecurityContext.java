package io.yupiik.kubernetes.bindings.v1_17_3;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecSecurityContext {
    private Integer fsGroup;
    private Integer runAsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private PodTemplateTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions;
    private List<Integer> supplementalGroups;
    private List<PodTemplateTemplateSpecSecurityContextSysctls> sysctls;
    private PodTemplateTemplateSpecSecurityContextWindowsOptions windowsOptions;

    public PodTemplateTemplateSpecSecurityContext() {
        // no-op
    }

    public PodTemplateTemplateSpecSecurityContext(final Integer fsGroup,
                                                  final Integer runAsGroup,
                                                  final Boolean runAsNonRoot,
                                                  final Integer runAsUser,
                                                  final PodTemplateTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions,
                                                  final List<Integer> supplementalGroups,
                                                  final List<PodTemplateTemplateSpecSecurityContextSysctls> sysctls,
                                                  final PodTemplateTemplateSpecSecurityContextWindowsOptions windowsOptions) {
        // no-op
    }

    public Integer getFsGroup() {
        return fsGroup;
    }

    public void setFsGroup(final Integer fsGroup) {
        this.fsGroup = fsGroup;
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

    public PodTemplateTemplateSpecSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final PodTemplateTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public List<Integer> getSupplementalGroups() {
        return supplementalGroups;
    }

    public void setSupplementalGroups(final List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    public List<PodTemplateTemplateSpecSecurityContextSysctls> getSysctls() {
        return sysctls;
    }

    public void setSysctls(final List<PodTemplateTemplateSpecSecurityContextSysctls> sysctls) {
        this.sysctls = sysctls;
    }

    public PodTemplateTemplateSpecSecurityContextWindowsOptions getWindowsOptions() {
        return windowsOptions;
    }

    public void setWindowsOptions(final PodTemplateTemplateSpecSecurityContextWindowsOptions windowsOptions) {
        this.windowsOptions = windowsOptions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsGroup,
                runAsGroup,
                runAsNonRoot,
                runAsUser,
                seLinuxOptions,
                supplementalGroups,
                sysctls,
                windowsOptions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateTemplateSpecSecurityContext)) {
            return false;
        }
        final PodTemplateTemplateSpecSecurityContext __otherCasted = (PodTemplateTemplateSpecSecurityContext) __other;
        return Objects.equals(fsGroup, __otherCasted.fsGroup) &&
            Objects.equals(runAsGroup, __otherCasted.runAsGroup) &&
            Objects.equals(runAsNonRoot, __otherCasted.runAsNonRoot) &&
            Objects.equals(runAsUser, __otherCasted.runAsUser) &&
            Objects.equals(seLinuxOptions, __otherCasted.seLinuxOptions) &&
            Objects.equals(supplementalGroups, __otherCasted.supplementalGroups) &&
            Objects.equals(sysctls, __otherCasted.sysctls) &&
            Objects.equals(windowsOptions, __otherCasted.windowsOptions);
    }
}
