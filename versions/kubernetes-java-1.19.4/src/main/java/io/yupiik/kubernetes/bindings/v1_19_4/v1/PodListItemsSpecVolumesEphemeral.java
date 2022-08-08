package io.yupiik.kubernetes.bindings.v1_19_4.v1;

import java.util.Objects;

public class PodListItemsSpecVolumesEphemeral {
    private Boolean readOnly;
    private PodListItemsSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public PodListItemsSpecVolumesEphemeral() {
        // no-op
    }

    public PodListItemsSpecVolumesEphemeral(final Boolean readOnly,
                                            final PodListItemsSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public PodListItemsSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final PodListItemsSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
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
        if (!(__other instanceof PodListItemsSpecVolumesEphemeral)) {
            return false;
        }
        final PodListItemsSpecVolumesEphemeral __otherCasted = (PodListItemsSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
