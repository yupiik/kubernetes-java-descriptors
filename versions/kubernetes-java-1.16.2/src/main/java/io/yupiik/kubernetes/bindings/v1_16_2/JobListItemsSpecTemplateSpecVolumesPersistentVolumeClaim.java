package io.yupiik.kubernetes.bindings.v1_16_2;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesPersistentVolumeClaim {
    private String claimName;
    private Boolean readOnly;

    public JobListItemsSpecTemplateSpecVolumesPersistentVolumeClaim() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesPersistentVolumeClaim(final String claimName,
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesPersistentVolumeClaim)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesPersistentVolumeClaim __otherCasted = (JobListItemsSpecTemplateSpecVolumesPersistentVolumeClaim) __other;
        return Objects.equals(claimName, __otherCasted.claimName) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }
}
