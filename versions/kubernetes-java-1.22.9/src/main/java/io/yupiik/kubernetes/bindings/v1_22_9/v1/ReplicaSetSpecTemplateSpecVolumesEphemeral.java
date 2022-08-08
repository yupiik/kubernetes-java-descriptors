package io.yupiik.kubernetes.bindings.v1_22_9.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesEphemeral {
    private ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public ReplicaSetSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesEphemeral(final ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesEphemeral __otherCasted = (ReplicaSetSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
