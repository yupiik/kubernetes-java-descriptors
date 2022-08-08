package io.yupiik.kubernetes.bindings.v1_16_11.v1beta2;

import java.util.Map;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesFlexVolume {
    private String driver;
    private String fsType;
    private Map<String, String> options;
    private Boolean readOnly;
    private DeploymentListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef secretRef;

    public DeploymentListItemsSpecTemplateSpecVolumesFlexVolume() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesFlexVolume(final String driver,
                                                                final String fsType,
                                                                final Map<String, String> options,
                                                                final Boolean readOnly,
                                                                final DeploymentListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef secretRef) {
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

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(final Map<String, String> options) {
        this.options = options;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final DeploymentListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef secretRef) {
        this.secretRef = secretRef;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                driver,
                fsType,
                options,
                readOnly,
                secretRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesFlexVolume)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesFlexVolume __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesFlexVolume) __other;
        return Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
