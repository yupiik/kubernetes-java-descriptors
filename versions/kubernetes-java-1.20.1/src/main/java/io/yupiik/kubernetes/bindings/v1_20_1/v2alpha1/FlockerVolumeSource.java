package io.yupiik.kubernetes.bindings.v1_20_1.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_20_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_1.Validable;
import io.yupiik.kubernetes.bindings.v1_20_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class FlockerVolumeSource implements Validable<FlockerVolumeSource>, Exportable {
    private String datasetName;
    private String datasetUUID;

    public FlockerVolumeSource() {
        // no-op
    }

    public FlockerVolumeSource(final String datasetName,
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
        if (!(__other instanceof FlockerVolumeSource)) {
            return false;
        }
        final FlockerVolumeSource __otherCasted = (FlockerVolumeSource) __other;
        return Objects.equals(datasetName, __otherCasted.datasetName) &&
            Objects.equals(datasetUUID, __otherCasted.datasetUUID);
    }

    public FlockerVolumeSource datasetName(final String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    public FlockerVolumeSource datasetUUID(final String datasetUUID) {
        this.datasetUUID = datasetUUID;
        return this;
    }

    @Override
    public FlockerVolumeSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (datasetName != null ? "\"datasetName\":\"" +  JsonStrings.escapeJson(datasetName) + "\"" : ""),
                    (datasetUUID != null ? "\"datasetUUID\":\"" +  JsonStrings.escapeJson(datasetUUID) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
