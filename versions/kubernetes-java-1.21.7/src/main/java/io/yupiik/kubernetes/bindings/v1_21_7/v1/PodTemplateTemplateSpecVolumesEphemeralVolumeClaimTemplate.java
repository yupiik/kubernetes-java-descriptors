package io.yupiik.kubernetes.bindings.v1_21_7.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplate {
    private PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplate(final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                      final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
