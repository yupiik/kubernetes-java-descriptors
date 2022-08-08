package io.yupiik.kubernetes.bindings.v1_20_15;

import java.util.Objects;

public class PodTemplateTemplateSpecVolumesEphemeral {
    private Boolean readOnly;
    private PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public PodTemplateTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesEphemeral(final Boolean readOnly,
                                                   final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
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
                readOnly,
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesEphemeral __otherCasted = (PodTemplateTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
