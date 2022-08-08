package io.yupiik.kubernetes.bindings.v1_14_3.v1beta2;

import java.util.Objects;

public class DaemonSetListItemsMetadataInitializersPending {
    private String name;

    public DaemonSetListItemsMetadataInitializersPending() {
        // no-op
    }

    public DaemonSetListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof DaemonSetListItemsMetadataInitializersPending)) {
            return false;
        }
        final DaemonSetListItemsMetadataInitializersPending __otherCasted = (DaemonSetListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
