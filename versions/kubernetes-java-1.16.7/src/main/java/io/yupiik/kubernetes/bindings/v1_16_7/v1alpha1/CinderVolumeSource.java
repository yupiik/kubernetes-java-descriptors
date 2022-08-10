package io.yupiik.kubernetes.bindings.v1_16_7.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_16_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_16_7.Validable;
import io.yupiik.kubernetes.bindings.v1_16_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CinderVolumeSource implements Validable<CinderVolumeSource>, Exportable {
    private String fsType;
    private Boolean readOnly;
    private LocalObjectReference secretRef;
    private String volumeID;

    public CinderVolumeSource() {
        // no-op
    }

    public CinderVolumeSource(final String fsType,
                              final Boolean readOnly,
                              final LocalObjectReference secretRef,
                              final String volumeID) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public LocalObjectReference getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final LocalObjectReference secretRef) {
        this.secretRef = secretRef;
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
                readOnly,
                secretRef,
                volumeID);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CinderVolumeSource)) {
            return false;
        }
        final CinderVolumeSource __otherCasted = (CinderVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }

    public CinderVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public CinderVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public CinderVolumeSource secretRef(final LocalObjectReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public CinderVolumeSource volumeID(final String volumeID) {
        this.volumeID = volumeID;
        return this;
    }

    @Override
    public CinderVolumeSource validate() {
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
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (secretRef != null ? "\"secretRef\":" + secretRef.asJson() : ""),
                    (volumeID != null ? "\"volumeID\":\"" +  JsonStrings.escapeJson(volumeID) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}