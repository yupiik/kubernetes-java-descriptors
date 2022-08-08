package io.yupiik.kubernetes.bindings.v1_20_0.v1;

import java.util.Objects;

public class PodListItemsSpecVolumesEphemeralVolumeClaimTemplate {
    private PodListItemsSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private PodListItemsSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public PodListItemsSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public PodListItemsSpecVolumesEphemeralVolumeClaimTemplate(final PodListItemsSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                               final PodListItemsSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public PodListItemsSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodListItemsSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public PodListItemsSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodListItemsSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof PodListItemsSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final PodListItemsSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (PodListItemsSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
