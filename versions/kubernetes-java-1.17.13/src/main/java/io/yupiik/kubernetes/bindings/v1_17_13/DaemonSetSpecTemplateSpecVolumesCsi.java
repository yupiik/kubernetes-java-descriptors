package io.yupiik.kubernetes.bindings.v1_17_13;

import java.util.Map;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesCsi {
    private String driver;
    private String fsType;
    private DaemonSetSpecTemplateSpecVolumesCsiNodePublishSecretRef nodePublishSecretRef;
    private Boolean readOnly;
    private Map<String, String> volumeAttributes;

    public DaemonSetSpecTemplateSpecVolumesCsi() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesCsi(final String driver,
                                               final String fsType,
                                               final DaemonSetSpecTemplateSpecVolumesCsiNodePublishSecretRef nodePublishSecretRef,
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

    public DaemonSetSpecTemplateSpecVolumesCsiNodePublishSecretRef getNodePublishSecretRef() {
        return nodePublishSecretRef;
    }

    public void setNodePublishSecretRef(final DaemonSetSpecTemplateSpecVolumesCsiNodePublishSecretRef nodePublishSecretRef) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesCsi)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesCsi __otherCasted = (DaemonSetSpecTemplateSpecVolumesCsi) __other;
        return Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(nodePublishSecretRef, __otherCasted.nodePublishSecretRef) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeAttributes, __otherCasted.volumeAttributes);
    }
}
