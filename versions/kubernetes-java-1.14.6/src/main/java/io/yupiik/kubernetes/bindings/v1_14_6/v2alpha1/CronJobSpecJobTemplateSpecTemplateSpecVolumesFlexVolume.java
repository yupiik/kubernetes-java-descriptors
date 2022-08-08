package io.yupiik.kubernetes.bindings.v1_14_6.v2alpha1;

import java.util.Map;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolume {
    private String driver;
    private String fsType;
    private Map<String, String> options;
    private Boolean readOnly;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolumeSecretRef secretRef;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolume() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolume(final String driver,
                                                                   final String fsType,
                                                                   final Map<String, String> options,
                                                                   final Boolean readOnly,
                                                                   final CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolumeSecretRef secretRef) {
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

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolumeSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolumeSecretRef secretRef) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolume)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolume __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolume) __other;
        return Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
