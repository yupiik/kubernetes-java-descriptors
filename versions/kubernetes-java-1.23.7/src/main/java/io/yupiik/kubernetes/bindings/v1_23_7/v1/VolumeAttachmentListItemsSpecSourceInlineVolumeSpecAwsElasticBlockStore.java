package io.yupiik.kubernetes.bindings.v1_23_7.v1;

import java.util.Objects;

public class VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAwsElasticBlockStore {
    private String fsType;
    private Integer partition;
    private Boolean readOnly;
    private String volumeID;

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAwsElasticBlockStore() {
        // no-op
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAwsElasticBlockStore(final String fsType,
                                                                                   final Integer partition,
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

    public Integer getPartition() {
        return partition;
    }

    public void setPartition(final Integer partition) {
        this.partition = partition;
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
                partition,
                readOnly,
                volumeID);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAwsElasticBlockStore)) {
            return false;
        }
        final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAwsElasticBlockStore __otherCasted = (VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAwsElasticBlockStore) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(partition, __otherCasted.partition) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
