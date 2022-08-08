package io.yupiik.kubernetes.bindings.v1_15_11;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesPortworxVolume {
    private String fsType;
    private Boolean readOnly;
    private String volumeID;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesPortworxVolume() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesPortworxVolume(final String fsType,
                                                                               final Boolean readOnly,
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
                volumeID);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesPortworxVolume)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesPortworxVolume __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesPortworxVolume) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
