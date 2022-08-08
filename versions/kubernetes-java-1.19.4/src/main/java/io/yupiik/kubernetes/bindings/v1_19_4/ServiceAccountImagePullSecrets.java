package io.yupiik.kubernetes.bindings.v1_19_4;

import java.util.Objects;

public class ServiceAccountImagePullSecrets {
    private String name;

    public ServiceAccountImagePullSecrets() {
        // no-op
    }

    public ServiceAccountImagePullSecrets(final String name) {
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
        if (!(__other instanceof ServiceAccountImagePullSecrets)) {
            return false;
        }
        final ServiceAccountImagePullSecrets __otherCasted = (ServiceAccountImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
