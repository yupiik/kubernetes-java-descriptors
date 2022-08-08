package io.yupiik.kubernetes.bindings.v1_24_2;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesEphemeral {
    private JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public JobListItemsSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesEphemeral(final JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesEphemeral __otherCasted = (JobListItemsSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
