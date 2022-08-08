package io.yupiik.kubernetes.bindings.v1_16_9.v1;

import java.util.Objects;

public class PodListItemsSpecInitContainersEnvFromSecretRef {
    private String name;
    private Boolean optional;

    public PodListItemsSpecInitContainersEnvFromSecretRef() {
        // no-op
    }

    public PodListItemsSpecInitContainersEnvFromSecretRef(final String name,
                                                          final Boolean optional) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecInitContainersEnvFromSecretRef)) {
            return false;
        }
        final PodListItemsSpecInitContainersEnvFromSecretRef __otherCasted = (PodListItemsSpecInitContainersEnvFromSecretRef) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
