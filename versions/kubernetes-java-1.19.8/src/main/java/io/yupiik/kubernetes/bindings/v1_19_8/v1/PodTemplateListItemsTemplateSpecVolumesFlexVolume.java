package io.yupiik.kubernetes.bindings.v1_19_8.v1;

import java.util.Map;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesFlexVolume {
    private String driver;
    private String fsType;
    private Map<String, String> options;
    private Boolean readOnly;
    private PodTemplateListItemsTemplateSpecVolumesFlexVolumeSecretRef secretRef;

    public PodTemplateListItemsTemplateSpecVolumesFlexVolume() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesFlexVolume(final String driver,
                                                             final String fsType,
                                                             final Map<String, String> options,
                                                             final Boolean readOnly,
                                                             final PodTemplateListItemsTemplateSpecVolumesFlexVolumeSecretRef secretRef) {
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

    public PodTemplateListItemsTemplateSpecVolumesFlexVolumeSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodTemplateListItemsTemplateSpecVolumesFlexVolumeSecretRef secretRef) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesFlexVolume)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesFlexVolume __otherCasted = (PodTemplateListItemsTemplateSpecVolumesFlexVolume) __other;
        return Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
