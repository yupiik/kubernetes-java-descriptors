package io.yupiik.kubernetes.bindings.v1_15_7.v1;

import java.util.Objects;

public class ControllerRevisionMetadataInitializersPending {
    private String name;

    public ControllerRevisionMetadataInitializersPending() {
        // no-op
    }

    public ControllerRevisionMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ControllerRevisionMetadataInitializersPending)) {
            return false;
        }
        final ControllerRevisionMetadataInitializersPending __otherCasted = (ControllerRevisionMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
