package io.yupiik.kubernetes.bindings.v1_17_16.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesCinder {
    private String fsType;
    private Boolean readOnly;
    private ReplicaSetSpecTemplateSpecVolumesCinderSecretRef secretRef;
    private String volumeID;

    public ReplicaSetSpecTemplateSpecVolumesCinder() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesCinder(final String fsType,
                                                   final Boolean readOnly,
                                                   final ReplicaSetSpecTemplateSpecVolumesCinderSecretRef secretRef,
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

    public ReplicaSetSpecTemplateSpecVolumesCinderSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicaSetSpecTemplateSpecVolumesCinderSecretRef secretRef) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesCinder)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesCinder __otherCasted = (ReplicaSetSpecTemplateSpecVolumesCinder) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
