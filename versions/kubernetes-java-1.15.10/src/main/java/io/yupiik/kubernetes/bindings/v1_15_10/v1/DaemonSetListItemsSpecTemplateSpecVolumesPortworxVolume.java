package io.yupiik.kubernetes.bindings.v1_15_10.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesPortworxVolume {
    private String fsType;
    private Boolean readOnly;
    private String volumeID;

    public DaemonSetListItemsSpecTemplateSpecVolumesPortworxVolume() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesPortworxVolume(final String fsType,
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesPortworxVolume)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesPortworxVolume __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesPortworxVolume) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
