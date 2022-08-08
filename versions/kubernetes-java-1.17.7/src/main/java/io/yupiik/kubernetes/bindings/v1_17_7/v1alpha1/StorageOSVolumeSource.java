package io.yupiik.kubernetes.bindings.v1_17_7.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_17_7.Validable;
import io.yupiik.kubernetes.bindings.v1_17_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StorageOSVolumeSource implements Validable<StorageOSVolumeSource> {
    private String fsType;
    private Boolean readOnly;
    private LocalObjectReference secretRef;
    private String volumeName;
    private String volumeNamespace;

    public StorageOSVolumeSource() {
        // no-op
    }

    public StorageOSVolumeSource(final String fsType,
                                 final Boolean readOnly,
                                 final LocalObjectReference secretRef,
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

    public LocalObjectReference getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final LocalObjectReference secretRef) {
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
        if (!(__other instanceof StorageOSVolumeSource)) {
            return false;
        }
        final StorageOSVolumeSource __otherCasted = (StorageOSVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeName, __otherCasted.volumeName) &&
            Objects.equals(volumeNamespace, __otherCasted.volumeNamespace);
    }

    public StorageOSVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public StorageOSVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public StorageOSVolumeSource secretRef(final LocalObjectReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public StorageOSVolumeSource volumeName(final String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

    public StorageOSVolumeSource volumeNamespace(final String volumeNamespace) {
        this.volumeNamespace = volumeNamespace;
        return this;
    }

    @Override
    public StorageOSVolumeSource validate() {
        return this;
    }
}
