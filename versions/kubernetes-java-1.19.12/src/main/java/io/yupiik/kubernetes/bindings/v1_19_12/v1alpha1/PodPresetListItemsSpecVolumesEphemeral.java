package io.yupiik.kubernetes.bindings.v1_19_12.v1alpha1;

import java.util.Objects;

public class PodPresetListItemsSpecVolumesEphemeral {
    private Boolean readOnly;
    private PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public PodPresetListItemsSpecVolumesEphemeral() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesEphemeral(final Boolean readOnly,
                                                  final PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final PodPresetListItemsSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
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
        if (!(__other instanceof PodPresetListItemsSpecVolumesEphemeral)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesEphemeral __otherCasted = (PodPresetListItemsSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
