package io.yupiik.kubernetes.bindings.v1_16_12.v1alpha1;

import java.util.Objects;

public class PodPresetListItemsSpecVolumesAwsElasticBlockStore {
    private String fsType;
    private Integer partition;
    private Boolean readOnly;
    private String volumeID;

    public PodPresetListItemsSpecVolumesAwsElasticBlockStore() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesAwsElasticBlockStore(final String fsType,
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
        if (!(__other instanceof PodPresetListItemsSpecVolumesAwsElasticBlockStore)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesAwsElasticBlockStore __otherCasted = (PodPresetListItemsSpecVolumesAwsElasticBlockStore) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(partition, __otherCasted.partition) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }
}
