package io.yupiik.kubernetes.bindings.v1_19_12.v1;

import java.util.Objects;

public class PodSpecVolumesCinder {
    private String fsType;
    private Boolean readOnly;
    private PodSpecVolumesCinderSecretRef secretRef;
    private String volumeID;

    public PodSpecVolumesCinder() {
        // no-op
    }

    public PodSpecVolumesCinder(final String fsType,
                                final Boolean readOnly,
                                final PodSpecVolumesCinderSecretRef secretRef,
                                final String volumeID) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public PodSpecVolumesCinderSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodSpecVolumesCinderSecretRef secretRef) {
        this.secretRef = secretRef;
    }

    public String getVolumeID() {
        return volumeID;
    }

    public void setVolumeID(final String volumeID) {
        this.volumeID = volumeID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                readOnly,
                secretRef,
                volumeID);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSpecVolumesCinder)) {
            return false;
        }
        final PodSpecVolumesCinder __otherCasted = (PodSpecVolumesCinder) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
