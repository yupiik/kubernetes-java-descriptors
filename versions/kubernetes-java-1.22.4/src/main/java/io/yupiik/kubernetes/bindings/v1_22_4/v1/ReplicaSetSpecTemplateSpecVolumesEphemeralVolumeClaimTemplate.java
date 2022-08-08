package io.yupiik.kubernetes.bindings.v1_22_4.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate {
    private ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate(final ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                         final ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
