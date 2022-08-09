package io.yupiik.kubernetes.bindings.v1_20_10.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_20_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_10.Validable;
import io.yupiik.kubernetes.bindings.v1_20_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StorageOSPersistentVolumeSource implements Validable<StorageOSPersistentVolumeSource>, Exportable {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (fsType != null ? "\"fsType\":\"" +  JsonStrings.escapeJson(fsType) + "\"" : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (secretRef != null ? "\"secretRef\":" + secretRef.asJson() : ""),
                    (volumeName != null ? "\"volumeName\":\"" +  JsonStrings.escapeJson(volumeName) + "\"" : ""),
                    (volumeNamespace != null ? "\"volumeNamespace\":\"" +  JsonStrings.escapeJson(volumeNamespace) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
