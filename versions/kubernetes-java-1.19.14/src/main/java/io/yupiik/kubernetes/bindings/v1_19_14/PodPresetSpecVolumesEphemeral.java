package io.yupiik.kubernetes.bindings.v1_19_14;

import java.util.Objects;

public class PodPresetSpecVolumesEphemeral {
    private Boolean readOnly;
    private PodPresetSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public PodPresetSpecVolumesEphemeral() {
        // no-op
    }

    public PodPresetSpecVolumesEphemeral(final Boolean readOnly,
                                         final PodPresetSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public PodPresetSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final PodPresetSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
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
        if (!(__other instanceof PodPresetSpecVolumesEphemeral)) {
            return false;
        }
        final PodPresetSpecVolumesEphemeral __otherCasted = (PodPresetSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
