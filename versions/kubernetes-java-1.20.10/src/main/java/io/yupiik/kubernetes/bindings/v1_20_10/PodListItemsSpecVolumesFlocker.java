package io.yupiik.kubernetes.bindings.v1_20_10;

import java.util.Objects;

public class PodListItemsSpecVolumesFlocker {
    private String datasetName;
    private String datasetUUID;

    public PodListItemsSpecVolumesFlocker() {
        // no-op
    }

    public PodListItemsSpecVolumesFlocker(final String datasetName,
                                          final String datasetUUID) {
        // no-op
    }

    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(final String datasetName) {
        this.datasetName = datasetName;
    }

    public String getDatasetUUID() {
        return datasetUUID;
    }

    public void setDatasetUUID(final String datasetUUID) {
        this.datasetUUID = datasetUUID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                datasetName,
                datasetUUID);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecVolumesFlocker)) {
            return false;
        }
        final PodListItemsSpecVolumesFlocker __otherCasted = (PodListItemsSpecVolumesFlocker) __other;
        return Objects.equals(datasetName, __otherCasted.datasetName) &&
            Objects.equals(datasetUUID, __otherCasted.datasetUUID);
    }
}
