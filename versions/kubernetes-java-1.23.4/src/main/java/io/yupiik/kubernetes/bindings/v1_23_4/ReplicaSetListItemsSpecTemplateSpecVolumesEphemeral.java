package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesEphemeral {
    private ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public ReplicaSetListItemsSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesEphemeral(final ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesEphemeral __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
