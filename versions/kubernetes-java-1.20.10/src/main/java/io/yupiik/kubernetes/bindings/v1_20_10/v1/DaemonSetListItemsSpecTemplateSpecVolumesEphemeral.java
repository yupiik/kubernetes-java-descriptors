package io.yupiik.kubernetes.bindings.v1_20_10.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesEphemeral {
    private Boolean readOnly;
    private DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeral(final Boolean readOnly,
                                                              final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                readOnly,
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesEphemeral __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
