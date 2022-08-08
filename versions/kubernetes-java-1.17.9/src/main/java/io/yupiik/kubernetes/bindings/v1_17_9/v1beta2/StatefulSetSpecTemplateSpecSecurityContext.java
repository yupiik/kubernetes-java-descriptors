package io.yupiik.kubernetes.bindings.v1_17_9.v1beta2;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecSecurityContext {
    private Integer fsGroup;
    private Integer runAsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private StatefulSetSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions;
    private List<Integer> supplementalGroups;
    private List<StatefulSetSpecTemplateSpecSecurityContextSysctls> sysctls;
    private StatefulSetSpecTemplateSpecSecurityContextWindowsOptions windowsOptions;

    public StatefulSetSpecTemplateSpecSecurityContext() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecSecurityContext(final Integer fsGroup,
                                                      final Integer runAsGroup,
                                                      final Boolean runAsNonRoot,
                                                      final Integer runAsUser,
                                                      final StatefulSetSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions,
                                                      final List<Integer> supplementalGroups,
                                                      final List<StatefulSetSpecTemplateSpecSecurityContextSysctls> sysctls,
                                                      final StatefulSetSpecTemplateSpecSecurityContextWindowsOptions windowsOptions) {
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

    public StatefulSetSpecTemplateSpecSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final StatefulSetSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public List<Integer> getSupplementalGroups() {
        return supplementalGroups;
    }

    public void setSupplementalGroups(final List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    public List<StatefulSetSpecTemplateSpecSecurityContextSysctls> getSysctls() {
        return sysctls;
    }

    public void setSysctls(final List<StatefulSetSpecTemplateSpecSecurityContextSysctls> sysctls) {
        this.sysctls = sysctls;
    }

    public StatefulSetSpecTemplateSpecSecurityContextWindowsOptions getWindowsOptions() {
        return windowsOptions;
    }

    public void setWindowsOptions(final StatefulSetSpecTemplateSpecSecurityContextWindowsOptions windowsOptions) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecSecurityContext)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecSecurityContext __otherCasted = (StatefulSetSpecTemplateSpecSecurityContext) __other;
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
