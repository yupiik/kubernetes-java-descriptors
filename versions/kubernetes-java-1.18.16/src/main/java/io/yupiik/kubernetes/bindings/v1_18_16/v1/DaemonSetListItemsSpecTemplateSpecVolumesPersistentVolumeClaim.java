package io.yupiik.kubernetes.bindings.v1_18_16.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim {
    private String claimName;
    private Boolean readOnly;

    public DaemonSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim(final String claimName,
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim) __other;
        return Objects.equals(claimName, __otherCasted.claimName) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }
}
