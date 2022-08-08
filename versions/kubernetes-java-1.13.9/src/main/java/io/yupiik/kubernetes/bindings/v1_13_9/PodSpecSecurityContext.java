package io.yupiik.kubernetes.bindings.v1_13_9;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PodSpecSecurityContext {
    private Integer fsGroup;
    private Integer runAsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private PodSpecSecurityContextSeLinuxOptions seLinuxOptions;
    private List<Integer> supplementalGroups;
    private List<JsonValue> sysctls;

    public PodSpecSecurityContext() {
        // no-op
    }

    public PodSpecSecurityContext(final Integer fsGroup,
                                  final Integer runAsGroup,
                                  final Boolean runAsNonRoot,
                                  final Integer runAsUser,
                                  final PodSpecSecurityContextSeLinuxOptions seLinuxOptions,
                                  final List<Integer> supplementalGroups,
                                  final List<JsonValue> sysctls) {
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

    public PodSpecSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final PodSpecSecurityContextSeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public List<Integer> getSupplementalGroups() {
        return supplementalGroups;
    }

    public void setSupplementalGroups(final List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    public List<JsonValue> getSysctls() {
        return sysctls;
    }

    public void setSysctls(final List<JsonValue> sysctls) {
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
        if (!(__other instanceof PodSpecSecurityContext)) {
            return false;
        }
        final PodSpecSecurityContext __otherCasted = (PodSpecSecurityContext) __other;
        return Objects.equals(fsGroup, __otherCasted.fsGroup) &&
            Objects.equals(runAsGroup, __otherCasted.runAsGroup) &&
            Objects.equals(runAsNonRoot, __otherCasted.runAsNonRoot) &&
            Objects.equals(runAsUser, __otherCasted.runAsUser) &&
            Objects.equals(seLinuxOptions, __otherCasted.seLinuxOptions) &&
            Objects.equals(supplementalGroups, __otherCasted.supplementalGroups) &&
            Objects.equals(sysctls, __otherCasted.sysctls);
    }
}
