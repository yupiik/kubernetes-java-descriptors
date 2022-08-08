package io.yupiik.kubernetes.bindings.v1_14_0;

import java.util.Objects;

public class PodListItemsSpecImagePullSecrets {
    private String name;

    public PodListItemsSpecImagePullSecrets() {
        // no-op
    }

    public PodListItemsSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof PodListItemsSpecImagePullSecrets)) {
            return false;
        }
        final PodListItemsSpecImagePullSecrets __otherCasted = (PodListItemsSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
