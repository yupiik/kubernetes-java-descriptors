package io.yupiik.kubernetes.bindings.v1_22_3.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesEphemeral {
    private ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public ReplicationControllerSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesEphemeral(final ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesEphemeral __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
