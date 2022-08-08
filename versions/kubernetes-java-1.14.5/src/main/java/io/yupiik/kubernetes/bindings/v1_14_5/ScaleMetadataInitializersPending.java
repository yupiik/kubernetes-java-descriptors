package io.yupiik.kubernetes.bindings.v1_14_5;

import java.util.Objects;

public class ScaleMetadataInitializersPending {
    private String name;

    public ScaleMetadataInitializersPending() {
        // no-op
    }

    public ScaleMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ScaleMetadataInitializersPending)) {
            return false;
        }
        final ScaleMetadataInitializersPending __otherCasted = (ScaleMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
