package io.yupiik.kubernetes.bindings.v1_22_9;

import java.util.Map;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesCsi {
    private String driver;
    private String fsType;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesCsiNodePublishSecretRef nodePublishSecretRef;
    private Boolean readOnly;
    private Map<String, String> volumeAttributes;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesCsi() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesCsi(final String driver,
                                                            final String fsType,
                                                            final CronJobSpecJobTemplateSpecTemplateSpecVolumesCsiNodePublishSecretRef nodePublishSecretRef,
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

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesCsiNodePublishSecretRef getNodePublishSecretRef() {
        return nodePublishSecretRef;
    }

    public void setNodePublishSecretRef(final CronJobSpecJobTemplateSpecTemplateSpecVolumesCsiNodePublishSecretRef nodePublishSecretRef) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesCsi)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesCsi __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesCsi) __other;
        return Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(nodePublishSecretRef, __otherCasted.nodePublishSecretRef) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeAttributes, __otherCasted.volumeAttributes);
    }
}
