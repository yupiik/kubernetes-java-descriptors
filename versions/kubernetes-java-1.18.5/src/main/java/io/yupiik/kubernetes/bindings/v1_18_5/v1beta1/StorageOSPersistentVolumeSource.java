package io.yupiik.kubernetes.bindings.v1_18_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_18_5.Validable;
import io.yupiik.kubernetes.bindings.v1_18_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StorageOSPersistentVolumeSource implements Validable<StorageOSPersistentVolumeSource> {
    private String fsType;
    private Boolean readOnly;
    private ObjectReference secretRef;
    private String volumeName;
    private String volumeNamespace;

    public StorageOSPersistentVolumeSource() {
        // no-op
    }

    public StorageOSPersistentVolumeSource(final String fsType,
                                           final Boolean readOnly,
                                           final ObjectReference secretRef,
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

    public ObjectReference getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ObjectReference secretRef) {
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
        if (!(__other instanceof StorageOSPersistentVolumeSource)) {
            return false;
        }
        final StorageOSPersistentVolumeSource __otherCasted = (StorageOSPersistentVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeName, __otherCasted.volumeName) &&
            Objects.equals(volumeNamespace, __otherCasted.volumeNamespace);
    }

    public StorageOSPersistentVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public StorageOSPersistentVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public StorageOSPersistentVolumeSource secretRef(final ObjectReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public StorageOSPersistentVolumeSource volumeName(final String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

    public StorageOSPersistentVolumeSource volumeNamespace(final String volumeNamespace) {
        this.volumeNamespace = volumeNamespace;
        return this;
    }

    @Override
    public StorageOSPersistentVolumeSource validate() {
        return this;
    }
}
