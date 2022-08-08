package io.yupiik.kubernetes.bindings.v1_15_4;

import java.util.Map;
import java.util.Objects;

public class PersistentVolumeListItemsSpecCsi {
    private PersistentVolumeListItemsSpecCsiControllerExpandSecretRef controllerExpandSecretRef;
    private PersistentVolumeListItemsSpecCsiControllerPublishSecretRef controllerPublishSecretRef;
    private String driver;
    private String fsType;
    private PersistentVolumeListItemsSpecCsiNodePublishSecretRef nodePublishSecretRef;
    private PersistentVolumeListItemsSpecCsiNodeStageSecretRef nodeStageSecretRef;
    private Boolean readOnly;
    private Map<String, String> volumeAttributes;
    private String volumeHandle;

    public PersistentVolumeListItemsSpecCsi() {
        // no-op
    }

    public PersistentVolumeListItemsSpecCsi(final PersistentVolumeListItemsSpecCsiControllerExpandSecretRef controllerExpandSecretRef,
                                            final PersistentVolumeListItemsSpecCsiControllerPublishSecretRef controllerPublishSecretRef,
                                            final String driver,
                                            final String fsType,
                                            final PersistentVolumeListItemsSpecCsiNodePublishSecretRef nodePublishSecretRef,
                                            final PersistentVolumeListItemsSpecCsiNodeStageSecretRef nodeStageSecretRef,
                                            final Boolean readOnly,
                                            final Map<String, String> volumeAttributes,
                                            final String volumeHandle) {
        // no-op
    }

    public PersistentVolumeListItemsSpecCsiControllerExpandSecretRef getControllerExpandSecretRef() {
        return controllerExpandSecretRef;
    }

    public void setControllerExpandSecretRef(final PersistentVolumeListItemsSpecCsiControllerExpandSecretRef controllerExpandSecretRef) {
        this.controllerExpandSecretRef = controllerExpandSecretRef;
    }

    public PersistentVolumeListItemsSpecCsiControllerPublishSecretRef getControllerPublishSecretRef() {
        return controllerPublishSecretRef;
    }

    public void setControllerPublishSecretRef(final PersistentVolumeListItemsSpecCsiControllerPublishSecretRef controllerPublishSecretRef) {
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

    public PersistentVolumeListItemsSpecCsiNodePublishSecretRef getNodePublishSecretRef() {
        return nodePublishSecretRef;
    }

    public void setNodePublishSecretRef(final PersistentVolumeListItemsSpecCsiNodePublishSecretRef nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
    }

    public PersistentVolumeListItemsSpecCsiNodeStageSecretRef getNodeStageSecretRef() {
        return nodeStageSecretRef;
    }

    public void setNodeStageSecretRef(final PersistentVolumeListItemsSpecCsiNodeStageSecretRef nodeStageSecretRef) {
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
        if (!(__other instanceof PersistentVolumeListItemsSpecCsi)) {
            return false;
        }
        final PersistentVolumeListItemsSpecCsi __otherCasted = (PersistentVolumeListItemsSpecCsi) __other;
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
