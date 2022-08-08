package io.yupiik.kubernetes.bindings.v1_17_3.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesPersistentVolumeClaim {
    private String claimName;
    private Boolean readOnly;

    public PodTemplateListItemsTemplateSpecVolumesPersistentVolumeClaim() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesPersistentVolumeClaim(final String claimName,
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesPersistentVolumeClaim)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesPersistentVolumeClaim __otherCasted = (PodTemplateListItemsTemplateSpecVolumesPersistentVolumeClaim) __other;
        return Objects.equals(claimName, __otherCasted.claimName) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }
}
