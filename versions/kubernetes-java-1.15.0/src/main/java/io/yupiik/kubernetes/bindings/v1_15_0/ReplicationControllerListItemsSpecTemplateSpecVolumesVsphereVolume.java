package io.yupiik.kubernetes.bindings.v1_15_0;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesVsphereVolume {
    private String fsType;
    private String storagePolicyID;
    private String storagePolicyName;
    private String volumePath;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesVsphereVolume() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesVsphereVolume(final String fsType,
                                                                              final String storagePolicyID,
                                                                              final String storagePolicyName,
                                                                              final String volumePath) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public String getStoragePolicyID() {
        return storagePolicyID;
    }

    public void setStoragePolicyID(final String storagePolicyID) {
        this.storagePolicyID = storagePolicyID;
    }

    public String getStoragePolicyName() {
        return storagePolicyName;
    }

    public void setStoragePolicyName(final String storagePolicyName) {
        this.storagePolicyName = storagePolicyName;
    }

    public String getVolumePath() {
        return volumePath;
    }

    public void setVolumePath(final String volumePath) {
        this.volumePath = volumePath;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                storagePolicyID,
                storagePolicyName,
                volumePath);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesVsphereVolume)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesVsphereVolume __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesVsphereVolume) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(storagePolicyID, __otherCasted.storagePolicyID) &&
            Objects.equals(storagePolicyName, __otherCasted.storagePolicyName) &&
            Objects.equals(volumePath, __otherCasted.volumePath);
    }
}
