package io.yupiik.kubernetes.bindings.v1_16_15;

import java.util.Objects;

public class PodPresetListItemsSpecVolumesCephfsSecretRef {
    private String name;

    public PodPresetListItemsSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof PodPresetListItemsSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesCephfsSecretRef __otherCasted = (PodPresetListItemsSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
