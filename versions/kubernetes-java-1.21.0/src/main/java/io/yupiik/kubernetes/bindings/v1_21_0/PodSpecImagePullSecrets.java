package io.yupiik.kubernetes.bindings.v1_21_0;

import java.util.Objects;

public class PodSpecImagePullSecrets {
    private String name;

    public PodSpecImagePullSecrets() {
        // no-op
    }

    public PodSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof PodSpecImagePullSecrets)) {
            return false;
        }
        final PodSpecImagePullSecrets __otherCasted = (PodSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
