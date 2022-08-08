package io.yupiik.kubernetes.bindings.v1_20_2.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate {
    private ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate(final ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                                    final ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
