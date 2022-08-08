package io.yupiik.kubernetes.bindings.v1_21_1;

import java.util.Map;
import java.util.Objects;

public class PersistentVolumeSpecCsi {
    private PersistentVolumeSpecCsiControllerExpandSecretRef controllerExpandSecretRef;
    private PersistentVolumeSpecCsiControllerPublishSecretRef controllerPublishSecretRef;
    private String driver;
    private String fsType;
    private PersistentVolumeSpecCsiNodePublishSecretRef nodePublishSecretRef;
    private PersistentVolumeSpecCsiNodeStageSecretRef nodeStageSecretRef;
    private Boolean readOnly;
    private Map<String, String> volumeAttributes;
    private String volumeHandle;

    public PersistentVolumeSpecCsi() {
        // no-op
    }

    public PersistentVolumeSpecCsi(final PersistentVolumeSpecCsiControllerExpandSecretRef controllerExpandSecretRef,
                                   final PersistentVolumeSpecCsiControllerPublishSecretRef controllerPublishSecretRef,
                                   final String driver,
                                   final String fsType,
                                   final PersistentVolumeSpecCsiNodePublishSecretRef nodePublishSecretRef,
                                   final PersistentVolumeSpecCsiNodeStageSecretRef nodeStageSecretRef,
                                   final Boolean readOnly,
                                   final Map<String, String> volumeAttributes,
                                   final String volumeHandle) {
        // no-op
    }

    public PersistentVolumeSpecCsiControllerExpandSecretRef getControllerExpandSecretRef() {
        return controllerExpandSecretRef;
    }

    public void setControllerExpandSecretRef(final PersistentVolumeSpecCsiControllerExpandSecretRef controllerExpandSecretRef) {
        this.controllerExpandSecretRef = controllerExpandSecretRef;
    }

    public PersistentVolumeSpecCsiControllerPublishSecretRef getControllerPublishSecretRef() {
        return controllerPublishSecretRef;
    }

    public void setControllerPublishSecretRef(final PersistentVolumeSpecCsiControllerPublishSecretRef controllerPublishSecretRef) {
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

    public PersistentVolumeSpecCsiNodePublishSecretRef getNodePublishSecretRef() {
        return nodePublishSecretRef;
    }

    public void setNodePublishSecretRef(final PersistentVolumeSpecCsiNodePublishSecretRef nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
    }

    public PersistentVolumeSpecCsiNodeStageSecretRef getNodeStageSecretRef() {
        return nodeStageSecretRef;
    }

    public void setNodeStageSecretRef(final PersistentVolumeSpecCsiNodeStageSecretRef nodeStageSecretRef) {
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
        if (!(__other instanceof PersistentVolumeSpecCsi)) {
            return false;
        }
        final PersistentVolumeSpecCsi __otherCasted = (PersistentVolumeSpecCsi) __other;
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
}
