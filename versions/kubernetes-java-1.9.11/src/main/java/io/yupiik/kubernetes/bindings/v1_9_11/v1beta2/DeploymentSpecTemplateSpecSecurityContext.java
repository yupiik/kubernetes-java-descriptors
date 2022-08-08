package io.yupiik.kubernetes.bindings.v1_9_11.v1beta2;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecSecurityContext {
    private Integer fsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private DeploymentSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions;
    private List<Integer> supplementalGroups;

    public DeploymentSpecTemplateSpecSecurityContext() {
        // no-op
    }

    public DeploymentSpecTemplateSpecSecurityContext(final Integer fsGroup,
                                                     final Boolean runAsNonRoot,
                                                     final Integer runAsUser,
                                                     final DeploymentSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions,
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

    public DeploymentSpecTemplateSpecSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final DeploymentSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecSecurityContext)) {
            return false;
        }
        final DeploymentSpecTemplateSpecSecurityContext __otherCasted = (DeploymentSpecTemplateSpecSecurityContext) __other;
        return Objects.equals(fsGroup, __otherCasted.fsGroup) &&
            Objects.equals(runAsNonRoot, __otherCasted.runAsNonRoot) &&
            Objects.equals(runAsUser, __otherCasted.runAsUser) &&
            Objects.equals(seLinuxOptions, __otherCasted.seLinuxOptions) &&
            Objects.equals(supplementalGroups, __otherCasted.supplementalGroups);
    }
}
