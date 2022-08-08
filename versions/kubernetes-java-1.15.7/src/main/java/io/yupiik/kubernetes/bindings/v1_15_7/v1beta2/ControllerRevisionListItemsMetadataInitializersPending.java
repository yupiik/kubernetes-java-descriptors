package io.yupiik.kubernetes.bindings.v1_15_7.v1beta2;

import java.util.Objects;

public class ControllerRevisionListItemsMetadataInitializersPending {
    private String name;

    public ControllerRevisionListItemsMetadataInitializersPending() {
        // no-op
    }

    public ControllerRevisionListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ControllerRevisionListItemsMetadataInitializersPending)) {
            return false;
        }
        final ControllerRevisionListItemsMetadataInitializersPending __otherCasted = (ControllerRevisionListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
