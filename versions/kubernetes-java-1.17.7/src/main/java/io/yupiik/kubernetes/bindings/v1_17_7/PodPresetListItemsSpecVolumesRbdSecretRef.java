package io.yupiik.kubernetes.bindings.v1_17_7;

import java.util.Objects;

public class PodPresetListItemsSpecVolumesRbdSecretRef {
    private String name;

    public PodPresetListItemsSpecVolumesRbdSecretRef() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof PodPresetListItemsSpecVolumesRbdSecretRef)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesRbdSecretRef __otherCasted = (PodPresetListItemsSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
