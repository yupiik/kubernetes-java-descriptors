package io.yupiik.kubernetes.bindings.v1_23_8;

import java.util.Objects;

public class PodSpecVolumesEphemeralVolumeClaimTemplate {
    private PodSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private PodSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public PodSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public PodSpecVolumesEphemeralVolumeClaimTemplate(final PodSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                      final PodSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public PodSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public PodSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof PodSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final PodSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (PodSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
