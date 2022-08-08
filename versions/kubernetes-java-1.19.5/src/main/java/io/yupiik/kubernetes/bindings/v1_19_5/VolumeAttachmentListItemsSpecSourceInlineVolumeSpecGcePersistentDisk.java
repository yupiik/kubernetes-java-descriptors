package io.yupiik.kubernetes.bindings.v1_19_5;

import java.util.Objects;

public class VolumeAttachmentListItemsSpecSourceInlineVolumeSpecGcePersistentDisk {
    private String fsType;
    private Integer partition;
    private String pdName;
    private Boolean readOnly;

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecGcePersistentDisk() {
        // no-op
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecGcePersistentDisk(final String fsType,
                                                                                final Integer partition,
                                                                                final String pdName,
                                                                                final Boolean readOnly) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public Integer getPartition() {
        return partition;
    }

    public void setPartition(final Integer partition) {
        this.partition = partition;
    }

    public String getPdName() {
        return pdName;
    }

    public void setPdName(final String pdName) {
        this.pdName = pdName;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                partition,
                pdName,
                readOnly);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentListItemsSpecSourceInlineVolumeSpecGcePersistentDisk)) {
            return false;
        }
        final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecGcePersistentDisk __otherCasted = (VolumeAttachmentListItemsSpecSourceInlineVolumeSpecGcePersistentDisk) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(partition, __otherCasted.partition) &&
            Objects.equals(pdName, __otherCasted.pdName) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }
}
