package io.yupiik.kubernetes.bindings.v1_16_5.v2alpha1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesPersistentVolumeClaim {
    private String claimName;
    private Boolean readOnly;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesPersistentVolumeClaim() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesPersistentVolumeClaim(final String claimName,
                                                                              final Boolean readOnly) {
        // no-op
    }

    public String getClaimName() {
        return claimName;
    }

    public void setClaimName(final String claimName) {
        this.claimName = claimName;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                claimName,
                readOnly);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesPersistentVolumeClaim)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesPersistentVolumeClaim __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesPersistentVolumeClaim) __other;
        return Objects.equals(claimName, __otherCasted.claimName) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }
}
