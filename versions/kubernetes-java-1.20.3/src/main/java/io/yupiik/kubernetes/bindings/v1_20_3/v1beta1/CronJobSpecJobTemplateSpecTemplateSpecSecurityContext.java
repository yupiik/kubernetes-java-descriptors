package io.yupiik.kubernetes.bindings.v1_20_3.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecSecurityContext {
    private Integer fsGroup;
    private String fsGroupChangePolicy;
    private Integer runAsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions;
    private CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile seccompProfile;
    private List<Integer> supplementalGroups;
    private List<CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSysctls> sysctls;
    private CronJobSpecJobTemplateSpecTemplateSpecSecurityContextWindowsOptions windowsOptions;

    public CronJobSpecJobTemplateSpecTemplateSpecSecurityContext() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecSecurityContext(final Integer fsGroup,
                                                                 final String fsGroupChangePolicy,
                                                                 final Integer runAsGroup,
                                                                 final Boolean runAsNonRoot,
                                                                 final Integer runAsUser,
                                                                 final CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions,
                                                                 final CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile seccompProfile,
                                                                 final List<Integer> supplementalGroups,
                                                                 final List<CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSysctls> sysctls,
                                                                 final CronJobSpecJobTemplateSpecTemplateSpecSecurityContextWindowsOptions windowsOptions) {
        // no-op
    }

    public Integer getFsGroup() {
        return fsGroup;
    }

    public void setFsGroup(final Integer fsGroup) {
        this.fsGroup = fsGroup;
    }

    public String getFsGroupChangePolicy() {
        return fsGroupChangePolicy;
    }

    public void setFsGroupChangePolicy(final String fsGroupChangePolicy) {
        this.fsGroupChangePolicy = fsGroupChangePolicy;
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

    public CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile getSeccompProfile() {
        return seccompProfile;
    }

    public void setSeccompProfile(final CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSeccompProfile seccompProfile) {
        this.seccompProfile = seccompProfile;
    }

    public List<Integer> getSupplementalGroups() {
        return supplementalGroups;
    }

    public void setSupplementalGroups(final List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSysctls> getSysctls() {
        return sysctls;
    }

    public void setSysctls(final List<CronJobSpecJobTemplateSpecTemplateSpecSecurityContextSysctls> sysctls) {
        this.sysctls = sysctls;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecSecurityContextWindowsOptions getWindowsOptions() {
        return windowsOptions;
    }

    public void setWindowsOptions(final CronJobSpecJobTemplateSpecTemplateSpecSecurityContextWindowsOptions windowsOptions) {
        this.windowsOptions = windowsOptions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsGroup,
                fsGroupChangePolicy,
                runAsGroup,
                runAsNonRoot,
                runAsUser,
                seLinuxOptions,
                seccompProfile,
                supplementalGroups,
                sysctls,
                windowsOptions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecSecurityContext)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecSecurityContext __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecSecurityContext) __other;
        return Objects.equals(fsGroup, __otherCasted.fsGroup) &&
            Objects.equals(fsGroupChangePolicy, __otherCasted.fsGroupChangePolicy) &&
            Objects.equals(runAsGroup, __otherCasted.runAsGroup) &&
            Objects.equals(runAsNonRoot, __otherCasted.runAsNonRoot) &&
            Objects.equals(runAsUser, __otherCasted.runAsUser) &&
            Objects.equals(seLinuxOptions, __otherCasted.seLinuxOptions) &&
            Objects.equals(seccompProfile, __otherCasted.seccompProfile) &&
            Objects.equals(supplementalGroups, __otherCasted.supplementalGroups) &&
            Objects.equals(sysctls, __otherCasted.sysctls) &&
            Objects.equals(windowsOptions, __otherCasted.windowsOptions);
    }
}
