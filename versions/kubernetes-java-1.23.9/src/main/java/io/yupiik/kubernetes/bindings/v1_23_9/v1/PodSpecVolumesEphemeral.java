package io.yupiik.kubernetes.bindings.v1_23_9.v1;

import java.util.Objects;

public class PodSpecVolumesEphemeral {
    private PodSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public PodSpecVolumesEphemeral() {
        // no-op
    }

    public PodSpecVolumesEphemeral(final PodSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public PodSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final PodSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSpecVolumesEphemeral)) {
            return false;
        }
        final PodSpecVolumesEphemeral __otherCasted = (PodSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
