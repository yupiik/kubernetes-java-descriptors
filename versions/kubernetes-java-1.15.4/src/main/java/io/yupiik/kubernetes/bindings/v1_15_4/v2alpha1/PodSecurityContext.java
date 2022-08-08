package io.yupiik.kubernetes.bindings.v1_15_4.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_15_4.Validable;
import io.yupiik.kubernetes.bindings.v1_15_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PodSecurityContext implements Validable<PodSecurityContext> {
    private Integer fsGroup;
    private Integer runAsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private SELinuxOptions seLinuxOptions;
    private List<Integer> supplementalGroups;
    private List<Sysctl> sysctls;
    private WindowsSecurityContextOptions windowsOptions;

    public PodSecurityContext() {
        // no-op
    }

    public PodSecurityContext(final Integer fsGroup,
                              final Integer runAsGroup,
                              final Boolean runAsNonRoot,
                              final Integer runAsUser,
                              final SELinuxOptions seLinuxOptions,
                              final List<Integer> supplementalGroups,
                              final List<Sysctl> sysctls,
                              final WindowsSecurityContextOptions windowsOptions) {
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

    public SELinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public List<Integer> getSupplementalGroups() {
        return supplementalGroups;
    }

    public void setSupplementalGroups(final List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    public List<Sysctl> getSysctls() {
        return sysctls;
    }

    public void setSysctls(final List<Sysctl> sysctls) {
        this.sysctls = sysctls;
    }

    public WindowsSecurityContextOptions getWindowsOptions() {
        return windowsOptions;
    }

    public void setWindowsOptions(final WindowsSecurityContextOptions windowsOptions) {
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
        if (!(__other instanceof PodSecurityContext)) {
            return false;
        }
        final PodSecurityContext __otherCasted = (PodSecurityContext) __other;
        return Objects.equals(fsGroup, __otherCasted.fsGroup) &&
            Objects.equals(runAsGroup, __otherCasted.runAsGroup) &&
            Objects.equals(runAsNonRoot, __otherCasted.runAsNonRoot) &&
            Objects.equals(runAsUser, __otherCasted.runAsUser) &&
            Objects.equals(seLinuxOptions, __otherCasted.seLinuxOptions) &&
            Objects.equals(supplementalGroups, __otherCasted.supplementalGroups) &&
            Objects.equals(sysctls, __otherCasted.sysctls) &&
            Objects.equals(windowsOptions, __otherCasted.windowsOptions);
    }

    public PodSecurityContext fsGroup(final Integer fsGroup) {
        this.fsGroup = fsGroup;
        return this;
    }

    public PodSecurityContext runAsGroup(final Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
        return this;
    }

    public PodSecurityContext runAsNonRoot(final Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
        return this;
    }

    public PodSecurityContext runAsUser(final Integer runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }

    public PodSecurityContext seLinuxOptions(final SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
        return this;
    }

    public PodSecurityContext supplementalGroups(final List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
        return this;
    }

    public PodSecurityContext sysctls(final List<Sysctl> sysctls) {
        this.sysctls = sysctls;
        return this;
    }

    public PodSecurityContext windowsOptions(final WindowsSecurityContextOptions windowsOptions) {
        this.windowsOptions = windowsOptions;
        return this;
    }

    @Override
    public PodSecurityContext validate() {
        return this;
    }
}
