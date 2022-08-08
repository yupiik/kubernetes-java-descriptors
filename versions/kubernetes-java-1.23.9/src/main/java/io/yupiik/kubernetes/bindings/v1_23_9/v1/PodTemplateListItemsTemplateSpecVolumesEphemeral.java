package io.yupiik.kubernetes.bindings.v1_23_9.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesEphemeral {
    private PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public PodTemplateListItemsTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesEphemeral(final PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesEphemeral __otherCasted = (PodTemplateListItemsTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
