package io.yupiik.kubernetes.bindings.v1_14_8;

import java.util.Objects;

public class PersistentVolumeSpecNodeAffinity {
    private PersistentVolumeSpecNodeAffinityRequired required;

    public PersistentVolumeSpecNodeAffinity() {
        // no-op
    }

    public PersistentVolumeSpecNodeAffinity(final PersistentVolumeSpecNodeAffinityRequired required) {
        // no-op
    }

    public PersistentVolumeSpecNodeAffinityRequired getRequired() {
        return required;
    }

    public void setRequired(final PersistentVolumeSpecNodeAffinityRequired required) {
        this.required = required;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                required);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeSpecNodeAffinity)) {
            return false;
        }
        final PersistentVolumeSpecNodeAffinity __otherCasted = (PersistentVolumeSpecNodeAffinity) __other;
        return Objects.equals(required, __otherCasted.required);
    }
}
