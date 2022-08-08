package io.yupiik.kubernetes.bindings.v1_19_2.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate {
    private DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate(final DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                                  final DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
