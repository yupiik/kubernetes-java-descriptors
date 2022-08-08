package io.yupiik.kubernetes.bindings.v1_17_15;

import java.util.Map;
import java.util.Objects;

public class VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlexVolume {
    private String driver;
    private String fsType;
    private Map<String, String> options;
    private Boolean readOnly;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlexVolumeSecretRef secretRef;

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlexVolume() {
        // no-op
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlexVolume(final String driver,
                                                                         final String fsType,
                                                                         final Map<String, String> options,
                                                                         final Boolean readOnly,
                                                                         final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlexVolumeSecretRef secretRef) {
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

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlexVolumeSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlexVolumeSecretRef secretRef) {
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
        if (!(__other instanceof VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlexVolume)) {
            return false;
        }
        final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlexVolume __otherCasted = (VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlexVolume) __other;
        return Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
