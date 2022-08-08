package io.yupiik.kubernetes.bindings.v1_19_0;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesEphemeral {
    private Boolean readOnly;
    private JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public JobSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesEphemeral(final Boolean readOnly,
                                               final JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
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
                readOnly,
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesEphemeral __otherCasted = (JobSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
