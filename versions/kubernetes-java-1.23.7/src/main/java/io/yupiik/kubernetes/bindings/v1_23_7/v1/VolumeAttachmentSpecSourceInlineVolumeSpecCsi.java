package io.yupiik.kubernetes.bindings.v1_23_7.v1;

import java.util.Map;
import java.util.Objects;

public class VolumeAttachmentSpecSourceInlineVolumeSpecCsi {
    private VolumeAttachmentSpecSourceInlineVolumeSpecCsiControllerExpandSecretRef controllerExpandSecretRef;
    private VolumeAttachmentSpecSourceInlineVolumeSpecCsiControllerPublishSecretRef controllerPublishSecretRef;
    private String driver;
    private String fsType;
    private VolumeAttachmentSpecSourceInlineVolumeSpecCsiNodePublishSecretRef nodePublishSecretRef;
    private VolumeAttachmentSpecSourceInlineVolumeSpecCsiNodeStageSecretRef nodeStageSecretRef;
    private Boolean readOnly;
    private Map<String, String> volumeAttributes;
    private String volumeHandle;

    public VolumeAttachmentSpecSourceInlineVolumeSpecCsi() {
        // no-op
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecCsi(final VolumeAttachmentSpecSourceInlineVolumeSpecCsiControllerExpandSecretRef controllerExpandSecretRef,
                                                         final VolumeAttachmentSpecSourceInlineVolumeSpecCsiControllerPublishSecretRef controllerPublishSecretRef,
                                                         final String driver,
                                                         final String fsType,
                                                         final VolumeAttachmentSpecSourceInlineVolumeSpecCsiNodePublishSecretRef nodePublishSecretRef,
                                                         final VolumeAttachmentSpecSourceInlineVolumeSpecCsiNodeStageSecretRef nodeStageSecretRef,
                                                         final Boolean readOnly,
                                                         final Map<String, String> volumeAttributes,
                                                         final String volumeHandle) {
        // no-op
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecCsiControllerExpandSecretRef getControllerExpandSecretRef() {
        return controllerExpandSecretRef;
    }

    public void setControllerExpandSecretRef(final VolumeAttachmentSpecSourceInlineVolumeSpecCsiControllerExpandSecretRef controllerExpandSecretRef) {
        this.controllerExpandSecretRef = controllerExpandSecretRef;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecCsiControllerPublishSecretRef getControllerPublishSecretRef() {
        return controllerPublishSecretRef;
    }

    public void setControllerPublishSecretRef(final VolumeAttachmentSpecSourceInlineVolumeSpecCsiControllerPublishSecretRef controllerPublishSecretRef) {
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

    public VolumeAttachmentSpecSourceInlineVolumeSpecCsiNodePublishSecretRef getNodePublishSecretRef() {
        return nodePublishSecretRef;
    }

    public void setNodePublishSecretRef(final VolumeAttachmentSpecSourceInlineVolumeSpecCsiNodePublishSecretRef nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecCsiNodeStageSecretRef getNodeStageSecretRef() {
        return nodeStageSecretRef;
    }

    public void setNodeStageSecretRef(final VolumeAttachmentSpecSourceInlineVolumeSpecCsiNodeStageSecretRef nodeStageSecretRef) {
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
        if (!(__other instanceof VolumeAttachmentSpecSourceInlineVolumeSpecCsi)) {
            return false;
        }
        final VolumeAttachmentSpecSourceInlineVolumeSpecCsi __otherCasted = (VolumeAttachmentSpecSourceInlineVolumeSpecCsi) __other;
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
