package io.yupiik.kubernetes.bindings.v1_15_12.v1beta2;

import java.util.Objects;

public class StatefulSetListItemsMetadataInitializersPending {
    private String name;

    public StatefulSetListItemsMetadataInitializersPending() {
        // no-op
    }

    public StatefulSetListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof StatefulSetListItemsMetadataInitializersPending)) {
            return false;
        }
        final StatefulSetListItemsMetadataInitializersPending __otherCasted = (StatefulSetListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
