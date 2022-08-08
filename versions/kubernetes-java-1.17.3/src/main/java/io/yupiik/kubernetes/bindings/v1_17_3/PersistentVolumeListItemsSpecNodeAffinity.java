package io.yupiik.kubernetes.bindings.v1_17_3;

import java.util.Objects;

public class PersistentVolumeListItemsSpecNodeAffinity {
    private PersistentVolumeListItemsSpecNodeAffinityRequired required;

    public PersistentVolumeListItemsSpecNodeAffinity() {
        // no-op
    }

    public PersistentVolumeListItemsSpecNodeAffinity(final PersistentVolumeListItemsSpecNodeAffinityRequired required) {
        // no-op
    }

    public PersistentVolumeListItemsSpecNodeAffinityRequired getRequired() {
        return required;
    }

    public void setRequired(final PersistentVolumeListItemsSpecNodeAffinityRequired required) {
        this.required = required;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                required);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeListItemsSpecNodeAffinity)) {
            return false;
        }
        final PersistentVolumeListItemsSpecNodeAffinity __otherCasted = (PersistentVolumeListItemsSpecNodeAffinity) __other;
        return Objects.equals(required, __otherCasted.required);
    }
}
