package io.yupiik.kubernetes.bindings.v1_22_9.v1;

import java.util.Objects;

public class PodListItemsSpecVolumesEphemeral {
    private PodListItemsSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public PodListItemsSpecVolumesEphemeral() {
        // no-op
    }

    public PodListItemsSpecVolumesEphemeral(final PodListItemsSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
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
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecVolumesEphemeral)) {
            return false;
        }
        final PodListItemsSpecVolumesEphemeral __otherCasted = (PodListItemsSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
