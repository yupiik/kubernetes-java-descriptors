package io.yupiik.kubernetes.bindings.v1_21_8.v1;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesEphemeral {
    private JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public JobSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesEphemeral(final JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesEphemeral __otherCasted = (JobSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
