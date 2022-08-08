package io.yupiik.kubernetes.bindings.v1_15_12.v1;

import java.util.Map;
import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesCsi {
    private String driver;
    private String fsType;
    private DeploymentSpecTemplateSpecVolumesCsiNodePublishSecretRef nodePublishSecretRef;
    private Boolean readOnly;
    private Map<String, String> volumeAttributes;

    public DeploymentSpecTemplateSpecVolumesCsi() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesCsi(final String driver,
                                                final String fsType,
                                                final DeploymentSpecTemplateSpecVolumesCsiNodePublishSecretRef nodePublishSecretRef,
                                                final Boolean readOnly,
                                                final Map<String, String> volumeAttributes) {
        // no-op
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

    public DeploymentSpecTemplateSpecVolumesCsiNodePublishSecretRef getNodePublishSecretRef() {
        return nodePublishSecretRef;
    }

    public void setNodePublishSecretRef(final DeploymentSpecTemplateSpecVolumesCsiNodePublishSecretRef nodePublishSecretRef) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesCsi)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesCsi __otherCasted = (DeploymentSpecTemplateSpecVolumesCsi) __other;
        return Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(nodePublishSecretRef, __otherCasted.nodePublishSecretRef) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeAttributes, __otherCasted.volumeAttributes);
    }
}
