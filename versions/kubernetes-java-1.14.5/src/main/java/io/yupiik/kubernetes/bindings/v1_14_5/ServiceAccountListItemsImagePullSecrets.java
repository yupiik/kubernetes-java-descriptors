package io.yupiik.kubernetes.bindings.v1_14_5;

import java.util.Objects;

public class ServiceAccountListItemsImagePullSecrets {
    private String name;

    public ServiceAccountListItemsImagePullSecrets() {
        // no-op
    }

    public ServiceAccountListItemsImagePullSecrets(final String name) {
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
        if (!(__other instanceof ServiceAccountListItemsImagePullSecrets)) {
            return false;
        }
        final ServiceAccountListItemsImagePullSecrets __otherCasted = (ServiceAccountListItemsImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
