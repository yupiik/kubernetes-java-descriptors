package io.yupiik.kubernetes.bindings.v1_20_0.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesEphemeral {
    private Boolean readOnly;
    private DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public DeploymentListItemsSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesEphemeral(final Boolean readOnly,
                                                               final DeploymentListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
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
                readOnly,
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesEphemeral __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
