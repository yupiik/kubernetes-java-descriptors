package io.yupiik.kubernetes.bindings.v1_15_4;

import java.util.Objects;

public class PodPresetListItemsSpecVolumesScaleIOSecretRef {
    private String name;

    public PodPresetListItemsSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof PodPresetListItemsSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesScaleIOSecretRef __otherCasted = (PodPresetListItemsSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
