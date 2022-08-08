package io.yupiik.kubernetes.bindings.v1_19_16;

import java.util.Objects;

public class PodPresetListItemsSpecVolumesFlexVolumeSecretRef {
    private String name;

    public PodPresetListItemsSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesFlexVolumeSecretRef(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodPresetListItemsSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesFlexVolumeSecretRef __otherCasted = (PodPresetListItemsSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
