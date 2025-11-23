package io.yupiik.kubernetes.bindings.v1_22_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_22_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_0.Validable;
import io.yupiik.kubernetes.bindings.v1_22_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CSIVolumeSource implements Validable<CSIVolumeSource>, Exportable {
    private String driver;
    private String fsType;
    private LocalObjectReference nodePublishSecretRef;
    private Boolean readOnly;
    private Map<String, String> volumeAttributes;

    public CSIVolumeSource() {
        // no-op
    }

    public CSIVolumeSource(final String driver,
                           final String fsType,
                           final LocalObjectReference nodePublishSecretRef,
                           final Boolean readOnly,
                           final Map<String, String> volumeAttributes) {
        this.driver = driver;
        this.fsType = fsType;
        this.nodePublishSecretRef = nodePublishSecretRef;
        this.readOnly = readOnly;
        this.volumeAttributes = volumeAttributes;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(final String driver) {
        this.driver = driver;
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public LocalObjectReference getNodePublishSecretRef() {
        return nodePublishSecretRef;
    }

    public void setNodePublishSecretRef(final LocalObjectReference nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public Map<String, String> getVolumeAttributes() {
        return volumeAttributes;
    }

    public void setVolumeAttributes(final Map<String, String> volumeAttributes) {
        this.volumeAttributes = volumeAttributes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                driver,
                fsType,
                nodePublishSecretRef,
                readOnly,
                volumeAttributes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSIVolumeSource)) {
            return false;
        }
        final CSIVolumeSource __otherCasted = (CSIVolumeSource) __other;
        return Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(nodePublishSecretRef, __otherCasted.nodePublishSecretRef) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeAttributes, __otherCasted.volumeAttributes);
    }

    public CSIVolumeSource driver(final String driver) {
        this.driver = driver;
        return this;
    }

    public CSIVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public CSIVolumeSource nodePublishSecretRef(final LocalObjectReference nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
        return this;
    }

    public CSIVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public CSIVolumeSource volumeAttributes(final Map<String, String> volumeAttributes) {
        this.volumeAttributes = volumeAttributes;
        return this;
    }

    @Override
    public CSIVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (driver == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "driver", "driver",
                "Missing 'driver' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (driver != null ? "\"driver\":\"" +  JsonStrings.escapeJson(driver) + "\"" : ""),
                    (fsType != null ? "\"fsType\":\"" +  JsonStrings.escapeJson(fsType) + "\"" : ""),
                    (nodePublishSecretRef != null ? "\"nodePublishSecretRef\":" + nodePublishSecretRef.asJson() : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (volumeAttributes != null ? "\"volumeAttributes\":" + volumeAttributes.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
