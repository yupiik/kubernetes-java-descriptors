package io.yupiik.kubernetes.bindings.v1_19_10.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_19_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_19_10.Validable;
import io.yupiik.kubernetes.bindings.v1_19_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AWSElasticBlockStoreVolumeSource implements Validable<AWSElasticBlockStoreVolumeSource>, Exportable {
    private String fsType;
    private Integer partition;
    private Boolean readOnly;
    private String volumeID;

    public AWSElasticBlockStoreVolumeSource() {
        // no-op
    }

    public AWSElasticBlockStoreVolumeSource(final String fsType,
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
        if (!(__other instanceof AWSElasticBlockStoreVolumeSource)) {
            return false;
        }
        final AWSElasticBlockStoreVolumeSource __otherCasted = (AWSElasticBlockStoreVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(partition, __otherCasted.partition) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }

    public AWSElasticBlockStoreVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public AWSElasticBlockStoreVolumeSource partition(final Integer partition) {
        this.partition = partition;
        return this;
    }

    public AWSElasticBlockStoreVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public AWSElasticBlockStoreVolumeSource volumeID(final String volumeID) {
        this.volumeID = volumeID;
        return this;
    }

    @Override
    public AWSElasticBlockStoreVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (volumeID == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "volumeID", "volumeID",
                "Missing 'volumeID' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (fsType != null ? "\"fsType\":\"" +  JsonStrings.escapeJson(fsType) + "\"" : ""),
                    (partition != null ? "\"partition\":" + partition : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (volumeID != null ? "\"volumeID\":\"" +  JsonStrings.escapeJson(volumeID) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}