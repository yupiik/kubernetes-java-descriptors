package io.yupiik.kubernetes.bindings.v1_7_9.v1;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecSecurityContext {
    private Integer fsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private JobSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions;
    private List<Integer> supplementalGroups;

    public JobSpecTemplateSpecSecurityContext() {
        // no-op
    }

    public JobSpecTemplateSpecSecurityContext(final Integer fsGroup,
                                              final Boolean runAsNonRoot,
                                              final Integer runAsUser,
                                              final JobSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions,
                                              final List<Integer> supplementalGroups) {
        // no-op
    }

    public Integer getFsGroup() {
        return fsGroup;
    }

    public void setFsGroup(final Integer fsGroup) {
        this.fsGroup = fsGroup;
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

    public JobSpecTemplateSpecSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final JobSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public List<Integer> getSupplementalGroups() {
        return supplementalGroups;
    }

    public void setSupplementalGroups(final List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsGroup,
                runAsNonRoot,
                runAsUser,
                seLinuxOptions,
                supplementalGroups);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobSpecTemplateSpecSecurityContext)) {
            return false;
        }
        final JobSpecTemplateSpecSecurityContext __otherCasted = (JobSpecTemplateSpecSecurityContext) __other;
        return Objects.equals(fsGroup, __otherCasted.fsGroup) &&
            Objects.equals(runAsNonRoot, __otherCasted.runAsNonRoot) &&
            Objects.equals(runAsUser, __otherCasted.runAsUser) &&
            Objects.equals(seLinuxOptions, __otherCasted.seLinuxOptions) &&
            Objects.equals(supplementalGroups, __otherCasted.supplementalGroups);
    }
}
