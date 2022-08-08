package io.yupiik.kubernetes.bindings.v1_21_2;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesEphemeral {
    private DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeral(final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
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
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesEphemeral __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
