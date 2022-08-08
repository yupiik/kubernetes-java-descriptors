package io.yupiik.kubernetes.bindings.v1_18_19;

import java.util.Objects;

public class PodPresetSpecVolumesFlocker {
    private String datasetName;
    private String datasetUUID;

    public PodPresetSpecVolumesFlocker() {
        // no-op
    }

    public PodPresetSpecVolumesFlocker(final String datasetName,
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
        if (!(__other instanceof PodPresetSpecVolumesFlocker)) {
            return false;
        }
        final PodPresetSpecVolumesFlocker __otherCasted = (PodPresetSpecVolumesFlocker) __other;
        return Objects.equals(datasetName, __otherCasted.datasetName) &&
            Objects.equals(datasetUUID, __otherCasted.datasetUUID);
    }
}
