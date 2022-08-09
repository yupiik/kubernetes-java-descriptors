package io.yupiik.kubernetes.bindings.v1_15_3.v1;

import io.yupiik.kubernetes.bindings.v1_15_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_15_3.Validable;
import io.yupiik.kubernetes.bindings.v1_15_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CSIPersistentVolumeSource implements Validable<CSIPersistentVolumeSource>, Exportable {
    private SecretReference controllerExpandSecretRef;
    private SecretReference controllerPublishSecretRef;
    private String driver;
    private String fsType;
    private SecretReference nodePublishSecretRef;
    private SecretReference nodeStageSecretRef;
    private Boolean readOnly;
    private Map<String, String> volumeAttributes;
    private String volumeHandle;

    public CSIPersistentVolumeSource() {
        // no-op
    }

    public CSIPersistentVolumeSource(final SecretReference controllerExpandSecretRef,
                                     final SecretReference controllerPublishSecretRef,
                                     final String driver,
                                     final String fsType,
                                     final SecretReference nodePublishSecretRef,
                                     final SecretReference nodeStageSecretRef,
                                     final Boolean readOnly,
                                     final Map<String, String> volumeAttributes,
                                     final String volumeHandle) {
        // no-op
    }

    public SecretReference getControllerExpandSecretRef() {
        return controllerExpandSecretRef;
    }

    public void setControllerExpandSecretRef(final SecretReference controllerExpandSecretRef) {
        this.controllerExpandSecretRef = controllerExpandSecretRef;
    }

    public SecretReference getControllerPublishSecretRef() {
        return controllerPublishSecretRef;
    }

    public void setControllerPublishSecretRef(final SecretReference controllerPublishSecretRef) {
        this.controllerPublishSecretRef = controllerPublishSecretRef;
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

    public SecretReference getNodePublishSecretRef() {
        return nodePublishSecretRef;
    }

    public void setNodePublishSecretRef(final SecretReference nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
    }

    public SecretReference getNodeStageSecretRef() {
        return nodeStageSecretRef;
    }

    public void setNodeStageSecretRef(final SecretReference nodeStageSecretRef) {
        this.nodeStageSecretRef = nodeStageSecretRef;
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

    public String getVolumeHandle() {
        return volumeHandle;
    }

    public void setVolumeHandle(final String volumeHandle) {
        this.volumeHandle = volumeHandle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                controllerExpandSecretRef,
                controllerPublishSecretRef,
                driver,
                fsType,
                nodePublishSecretRef,
                nodeStageSecretRef,
                readOnly,
                volumeAttributes,
                volumeHandle);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSIPersistentVolumeSource)) {
            return false;
        }
        final CSIPersistentVolumeSource __otherCasted = (CSIPersistentVolumeSource) __other;
        return Objects.equals(controllerExpandSecretRef, __otherCasted.controllerExpandSecretRef) &&
            Objects.equals(controllerPublishSecretRef, __otherCasted.controllerPublishSecretRef) &&
            Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(nodePublishSecretRef, __otherCasted.nodePublishSecretRef) &&
            Objects.equals(nodeStageSecretRef, __otherCasted.nodeStageSecretRef) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeAttributes, __otherCasted.volumeAttributes) &&
            Objects.equals(volumeHandle, __otherCasted.volumeHandle);
    }

    public CSIPersistentVolumeSource controllerExpandSecretRef(final SecretReference controllerExpandSecretRef) {
        this.controllerExpandSecretRef = controllerExpandSecretRef;
        return this;
    }

    public CSIPersistentVolumeSource controllerPublishSecretRef(final SecretReference controllerPublishSecretRef) {
        this.controllerPublishSecretRef = controllerPublishSecretRef;
        return this;
    }

    public CSIPersistentVolumeSource driver(final String driver) {
        this.driver = driver;
        return this;
    }

    public CSIPersistentVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public CSIPersistentVolumeSource nodePublishSecretRef(final SecretReference nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
        return this;
    }

    public CSIPersistentVolumeSource nodeStageSecretRef(final SecretReference nodeStageSecretRef) {
        this.nodeStageSecretRef = nodeStageSecretRef;
        return this;
    }

    public CSIPersistentVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public CSIPersistentVolumeSource volumeAttributes(final Map<String, String> volumeAttributes) {
        this.volumeAttributes = volumeAttributes;
        return this;
    }

    public CSIPersistentVolumeSource volumeHandle(final String volumeHandle) {
        this.volumeHandle = volumeHandle;
        return this;
    }

    @Override
    public CSIPersistentVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (driver == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "driver", "driver",
                "Missing 'driver' attribute.", true));
        }
        if (volumeHandle == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "volumeHandle", "volumeHandle",
                "Missing 'volumeHandle' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (controllerExpandSecretRef != null ? "\"controllerExpandSecretRef\":" + controllerExpandSecretRef.asJson() : ""),
                    (controllerPublishSecretRef != null ? "\"controllerPublishSecretRef\":" + controllerPublishSecretRef.asJson() : ""),
                    (driver != null ? "\"driver\":\"" +  JsonStrings.escapeJson(driver) + "\"" : ""),
                    (fsType != null ? "\"fsType\":\"" +  JsonStrings.escapeJson(fsType) + "\"" : ""),
                    (nodePublishSecretRef != null ? "\"nodePublishSecretRef\":" + nodePublishSecretRef.asJson() : ""),
                    (nodeStageSecretRef != null ? "\"nodeStageSecretRef\":" + nodeStageSecretRef.asJson() : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (volumeAttributes != null ? "\"volumeAttributes\":" + volumeAttributes.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (volumeHandle != null ? "\"volumeHandle\":\"" +  JsonStrings.escapeJson(volumeHandle) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
