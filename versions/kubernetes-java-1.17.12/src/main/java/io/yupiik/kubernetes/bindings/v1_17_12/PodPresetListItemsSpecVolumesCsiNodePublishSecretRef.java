package io.yupiik.kubernetes.bindings.v1_17_12;

import java.util.Objects;

public class PodPresetListItemsSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public PodPresetListItemsSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof PodPresetListItemsSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesCsiNodePublishSecretRef __otherCasted = (PodPresetListItemsSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
