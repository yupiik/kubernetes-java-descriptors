package io.yupiik.kubernetes.bindings.v1_23_7;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate {
    private ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate(final ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                                             final ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
