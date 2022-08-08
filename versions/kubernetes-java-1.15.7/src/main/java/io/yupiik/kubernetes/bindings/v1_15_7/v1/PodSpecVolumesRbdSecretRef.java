package io.yupiik.kubernetes.bindings.v1_15_7.v1;

import java.util.Objects;

public class PodSpecVolumesRbdSecretRef {
    private String name;

    public PodSpecVolumesRbdSecretRef() {
        // no-op
    }

    public PodSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof PodSpecVolumesRbdSecretRef)) {
            return false;
        }
        final PodSpecVolumesRbdSecretRef __otherCasted = (PodSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
