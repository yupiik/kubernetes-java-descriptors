package io.yupiik.kubernetes.bindings.v1_24_0;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral {
    private ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral(final ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
