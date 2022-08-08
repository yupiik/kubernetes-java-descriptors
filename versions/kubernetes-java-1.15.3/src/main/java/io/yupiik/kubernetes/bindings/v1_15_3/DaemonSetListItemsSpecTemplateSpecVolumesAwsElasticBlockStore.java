package io.yupiik.kubernetes.bindings.v1_15_3;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore {
    private String fsType;
    private Integer partition;
    private Boolean readOnly;
    private String volumeID;

    public DaemonSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore(final String fsType,
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(partition, __otherCasted.partition) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
