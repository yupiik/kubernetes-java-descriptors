package io.yupiik.kubernetes.bindings.v1_15_3;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesStorageos {
    private String fsType;
    private Boolean readOnly;
    private ReplicaSetListItemsSpecTemplateSpecVolumesStorageosSecretRef secretRef;
    private String volumeName;
    private String volumeNamespace;

    public ReplicaSetListItemsSpecTemplateSpecVolumesStorageos() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesStorageos(final String fsType,
                                                               final Boolean readOnly,
                                                               final ReplicaSetListItemsSpecTemplateSpecVolumesStorageosSecretRef secretRef,
                                                               final String volumeName,
                                                               final String volumeNamespace) {
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

    public ReplicaSetListItemsSpecTemplateSpecVolumesStorageosSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicaSetListItemsSpecTemplateSpecVolumesStorageosSecretRef secretRef) {
        this.secretRef = secretRef;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(final String volumeName) {
        this.volumeName = volumeName;
    }

    public String getVolumeNamespace() {
        return volumeNamespace;
    }

    public void setVolumeNamespace(final String volumeNamespace) {
        this.volumeNamespace = volumeNamespace;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                readOnly,
                secretRef,
                volumeName,
                volumeNamespace);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesStorageos)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesStorageos __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesStorageos) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeName, __otherCasted.volumeName) &&
            Objects.equals(volumeNamespace, __otherCasted.volumeNamespace);
    }
}
