package io.yupiik.kubernetes.bindings.v1_18_11;

import java.util.Objects;

public class PodPresetSpecVolumesCinder {
    private String fsType;
    private Boolean readOnly;
    private PodPresetSpecVolumesCinderSecretRef secretRef;
    private String volumeID;

    public PodPresetSpecVolumesCinder() {
        // no-op
    }

    public PodPresetSpecVolumesCinder(final String fsType,
                                      final Boolean readOnly,
                                      final PodPresetSpecVolumesCinderSecretRef secretRef,
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

    public PodPresetSpecVolumesCinderSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodPresetSpecVolumesCinderSecretRef secretRef) {
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
        if (!(__other instanceof PodPresetSpecVolumesCinder)) {
            return false;
        }
        final PodPresetSpecVolumesCinder __otherCasted = (PodPresetSpecVolumesCinder) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
