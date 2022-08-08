package io.yupiik.kubernetes.bindings.v1_19_8;

import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate {
    private DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate(final DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                         final DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
