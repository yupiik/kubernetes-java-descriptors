package io.yupiik.kubernetes.bindings.v1_17_8.v1;

import java.util.Objects;

public class PodSpecVolumesPersistentVolumeClaim {
    private String claimName;
    private Boolean readOnly;

    public PodSpecVolumesPersistentVolumeClaim() {
        // no-op
    }

    public PodSpecVolumesPersistentVolumeClaim(final String claimName,
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
        if (!(__other instanceof PodSpecVolumesPersistentVolumeClaim)) {
            return false;
        }
        final PodSpecVolumesPersistentVolumeClaim __otherCasted = (PodSpecVolumesPersistentVolumeClaim) __other;
        return Objects.equals(claimName, __otherCasted.claimName) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }
}
