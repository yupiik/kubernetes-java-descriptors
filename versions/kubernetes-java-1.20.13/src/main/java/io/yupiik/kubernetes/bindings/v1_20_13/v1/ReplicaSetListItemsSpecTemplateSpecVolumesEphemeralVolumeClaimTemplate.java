package io.yupiik.kubernetes.bindings.v1_20_13.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate {
    private ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate(final ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                                  final ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
