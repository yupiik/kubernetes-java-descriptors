package io.yupiik.kubernetes.bindings.v1_19_5;

import java.util.Objects;

public class PodPresetSpecVolumesEphemeralVolumeClaimTemplate {
    private PodPresetSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private PodPresetSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public PodPresetSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public PodPresetSpecVolumesEphemeralVolumeClaimTemplate(final PodPresetSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                            final PodPresetSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public PodPresetSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodPresetSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public PodPresetSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodPresetSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof PodPresetSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final PodPresetSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (PodPresetSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
