package io.yupiik.kubernetes.bindings.v1_23_6.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecVolumesEphemeral {
    private PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public PodTemplateTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesEphemeral(final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesEphemeral __otherCasted = (PodTemplateTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
