package io.yupiik.kubernetes.bindings.v1_20_14.v1;

import java.util.Objects;

public class PodListItemsSpecVolumesPersistentVolumeClaim {
    private String claimName;
    private Boolean readOnly;

    public PodListItemsSpecVolumesPersistentVolumeClaim() {
        // no-op
    }

    public PodListItemsSpecVolumesPersistentVolumeClaim(final String claimName,
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
        if (!(__other instanceof PodListItemsSpecVolumesPersistentVolumeClaim)) {
            return false;
        }
        final PodListItemsSpecVolumesPersistentVolumeClaim __otherCasted = (PodListItemsSpecVolumesPersistentVolumeClaim) __other;
        return Objects.equals(claimName, __otherCasted.claimName) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }
}
