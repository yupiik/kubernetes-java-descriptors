package io.yupiik.kubernetes.bindings.v1_22_6.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesStorageos {
    private String fsType;
    private Boolean readOnly;
    private StatefulSetListItemsSpecTemplateSpecVolumesStorageosSecretRef secretRef;
    private String volumeName;
    private String volumeNamespace;

    public StatefulSetListItemsSpecTemplateSpecVolumesStorageos() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesStorageos(final String fsType,
                                                                final Boolean readOnly,
                                                                final StatefulSetListItemsSpecTemplateSpecVolumesStorageosSecretRef secretRef,
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

    public StatefulSetListItemsSpecTemplateSpecVolumesStorageosSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final StatefulSetListItemsSpecTemplateSpecVolumesStorageosSecretRef secretRef) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesStorageos)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesStorageos __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesStorageos) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeName, __otherCasted.volumeName) &&
            Objects.equals(volumeNamespace, __otherCasted.volumeNamespace);
    }
}
