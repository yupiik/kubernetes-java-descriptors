package io.yupiik.kubernetes.bindings.v1_19_11.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesEphemeral {
    private Boolean readOnly;
    private PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public PodTemplateListItemsTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesEphemeral(final Boolean readOnly,
                                                            final PodTemplateListItemsTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
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
                readOnly,
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesEphemeral __otherCasted = (PodTemplateListItemsTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
