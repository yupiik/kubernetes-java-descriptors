package io.yupiik.kubernetes.bindings.v1_19_1.v1;

import java.util.Objects;

public class PodSpecVolumesEphemeral {
    private Boolean readOnly;
    private PodSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public PodSpecVolumesEphemeral() {
        // no-op
    }

    public PodSpecVolumesEphemeral(final Boolean readOnly,
                                   final PodSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
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
                readOnly,
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSpecVolumesEphemeral)) {
            return false;
        }
        final PodSpecVolumesEphemeral __otherCasted = (PodSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
