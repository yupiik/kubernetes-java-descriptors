package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesEphemeral {
    private DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public DeploymentListItemsSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesEphemeral(final DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesEphemeral __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
