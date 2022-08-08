package io.yupiik.kubernetes.bindings.v1_22_4.v1;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate {
    private JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate(final JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                  final JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
