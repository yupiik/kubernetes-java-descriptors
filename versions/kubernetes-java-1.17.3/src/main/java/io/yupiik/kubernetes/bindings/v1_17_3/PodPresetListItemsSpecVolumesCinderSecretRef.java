package io.yupiik.kubernetes.bindings.v1_17_3;

import java.util.Objects;

public class PodPresetListItemsSpecVolumesCinderSecretRef {
    private String name;

    public PodPresetListItemsSpecVolumesCinderSecretRef() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof PodPresetListItemsSpecVolumesCinderSecretRef)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesCinderSecretRef __otherCasted = (PodPresetListItemsSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
