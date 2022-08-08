package io.yupiik.kubernetes.bindings.v1_21_0;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate {
    private JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate(final JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                           final JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (JobListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
