package io.yupiik.kubernetes.bindings.v1_20_10.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesEphemeral {
    private Boolean readOnly;
    private DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public DeploymentSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesEphemeral(final Boolean readOnly,
                                                      final DeploymentSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
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
                readOnly,
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesEphemeral __otherCasted = (DeploymentSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
