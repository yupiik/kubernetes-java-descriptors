package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesEphemeral {
    private DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public DeploymentSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesEphemeral(final DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesEphemeral __otherCasted = (DeploymentSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
