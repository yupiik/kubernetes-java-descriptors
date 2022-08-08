package io.yupiik.kubernetes.bindings.v1_19_7;

import java.util.Objects;

public class PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplate {
    private PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplate(final PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                     final PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
