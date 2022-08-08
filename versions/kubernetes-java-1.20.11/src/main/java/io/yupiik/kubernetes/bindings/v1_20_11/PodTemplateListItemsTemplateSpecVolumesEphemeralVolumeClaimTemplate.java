package io.yupiik.kubernetes.bindings.v1_20_11;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplate {
    private PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplate(final PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                               final PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
