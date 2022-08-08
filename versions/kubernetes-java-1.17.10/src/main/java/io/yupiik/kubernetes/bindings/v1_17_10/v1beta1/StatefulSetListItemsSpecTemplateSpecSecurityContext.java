package io.yupiik.kubernetes.bindings.v1_17_10.v1beta1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecSecurityContext {
    private Integer fsGroup;
    private Integer runAsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private StatefulSetListItemsSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions;
    private List<Integer> supplementalGroups;
    private List<StatefulSetListItemsSpecTemplateSpecSecurityContextSysctls> sysctls;
    private StatefulSetListItemsSpecTemplateSpecSecurityContextWindowsOptions windowsOptions;

    public StatefulSetListItemsSpecTemplateSpecSecurityContext() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecSecurityContext(final Integer fsGroup,
                                                               final Integer runAsGroup,
                                                               final Boolean runAsNonRoot,
                                                               final Integer runAsUser,
                                                               final StatefulSetListItemsSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions,
                                                               final List<Integer> supplementalGroups,
                                                               final List<StatefulSetListItemsSpecTemplateSpecSecurityContextSysctls> sysctls,
                                                               final StatefulSetListItemsSpecTemplateSpecSecurityContextWindowsOptions windowsOptions) {
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

    public StatefulSetListItemsSpecTemplateSpecSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final StatefulSetListItemsSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public List<Integer> getSupplementalGroups() {
        return supplementalGroups;
    }

    public void setSupplementalGroups(final List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    public List<StatefulSetListItemsSpecTemplateSpecSecurityContextSysctls> getSysctls() {
        return sysctls;
    }

    public void setSysctls(final List<StatefulSetListItemsSpecTemplateSpecSecurityContextSysctls> sysctls) {
        this.sysctls = sysctls;
    }

    public StatefulSetListItemsSpecTemplateSpecSecurityContextWindowsOptions getWindowsOptions() {
        return windowsOptions;
    }

    public void setWindowsOptions(final StatefulSetListItemsSpecTemplateSpecSecurityContextWindowsOptions windowsOptions) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecSecurityContext)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecSecurityContext __otherCasted = (StatefulSetListItemsSpecTemplateSpecSecurityContext) __other;
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
