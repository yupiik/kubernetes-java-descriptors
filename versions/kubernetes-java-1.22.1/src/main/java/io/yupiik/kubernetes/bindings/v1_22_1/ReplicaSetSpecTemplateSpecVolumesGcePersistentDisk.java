package io.yupiik.kubernetes.bindings.v1_22_1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesGcePersistentDisk {
    private String fsType;
    private Integer partition;
    private String pdName;
    private Boolean readOnly;

    public ReplicaSetSpecTemplateSpecVolumesGcePersistentDisk() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesGcePersistentDisk(final String fsType,
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesGcePersistentDisk)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesGcePersistentDisk __otherCasted = (ReplicaSetSpecTemplateSpecVolumesGcePersistentDisk) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(partition, __otherCasted.partition) &&
            Objects.equals(pdName, __otherCasted.pdName) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }
}
