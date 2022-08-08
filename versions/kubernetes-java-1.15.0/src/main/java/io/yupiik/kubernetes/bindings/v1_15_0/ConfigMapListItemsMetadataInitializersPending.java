package io.yupiik.kubernetes.bindings.v1_15_0;

import java.util.Objects;

public class ConfigMapListItemsMetadataInitializersPending {
    private String name;

    public ConfigMapListItemsMetadataInitializersPending() {
        // no-op
    }

    public ConfigMapListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ConfigMapListItemsMetadataInitializersPending)) {
            return false;
        }
        final ConfigMapListItemsMetadataInitializersPending __otherCasted = (ConfigMapListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
