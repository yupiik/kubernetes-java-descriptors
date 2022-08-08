package io.yupiik.kubernetes.bindings.v1_15_12;

import java.util.Objects;

public class PodTemplateTemplateSpecVolumesPersistentVolumeClaim {
    private String claimName;
    private Boolean readOnly;

    public PodTemplateTemplateSpecVolumesPersistentVolumeClaim() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesPersistentVolumeClaim(final String claimName,
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesPersistentVolumeClaim)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesPersistentVolumeClaim __otherCasted = (PodTemplateTemplateSpecVolumesPersistentVolumeClaim) __other;
        return Objects.equals(claimName, __otherCasted.claimName) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }
}
