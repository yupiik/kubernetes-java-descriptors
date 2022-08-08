package io.yupiik.kubernetes.bindings.v1_14_10;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecSecurityContext {
    private Integer fsGroup;
    private Integer runAsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private JobListItemsSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions;
    private List<Integer> supplementalGroups;
    private List<JobListItemsSpecTemplateSpecSecurityContextSysctls> sysctls;

    public JobListItemsSpecTemplateSpecSecurityContext() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecSecurityContext(final Integer fsGroup,
                                                       final Integer runAsGroup,
                                                       final Boolean runAsNonRoot,
                                                       final Integer runAsUser,
                                                       final JobListItemsSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions,
                                                       final List<Integer> supplementalGroups,
                                                       final List<JobListItemsSpecTemplateSpecSecurityContextSysctls> sysctls) {
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

    public JobListItemsSpecTemplateSpecSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final JobListItemsSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public List<Integer> getSupplementalGroups() {
        return supplementalGroups;
    }

    public void setSupplementalGroups(final List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    public List<JobListItemsSpecTemplateSpecSecurityContextSysctls> getSysctls() {
        return sysctls;
    }

    public void setSysctls(final List<JobListItemsSpecTemplateSpecSecurityContextSysctls> sysctls) {
        this.sysctls = sysctls;
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
                sysctls);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobListItemsSpecTemplateSpecSecurityContext)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecSecurityContext __otherCasted = (JobListItemsSpecTemplateSpecSecurityContext) __other;
        return Objects.equals(fsGroup, __otherCasted.fsGroup) &&
            Objects.equals(runAsGroup, __otherCasted.runAsGroup) &&
            Objects.equals(runAsNonRoot, __otherCasted.runAsNonRoot) &&
            Objects.equals(runAsUser, __otherCasted.runAsUser) &&
            Objects.equals(seLinuxOptions, __otherCasted.seLinuxOptions) &&
            Objects.equals(supplementalGroups, __otherCasted.supplementalGroups) &&
            Objects.equals(sysctls, __otherCasted.sysctls);
    }
}
