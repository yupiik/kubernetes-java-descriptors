package io.yupiik.kubernetes.bindings.v1_14_6.v1beta1;

import java.util.Objects;

public class CSIDriverMetadataInitializersPending {
    private String name;

    public CSIDriverMetadataInitializersPending() {
        // no-op
    }

    public CSIDriverMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof CSIDriverMetadataInitializersPending)) {
            return false;
        }
        final CSIDriverMetadataInitializersPending __otherCasted = (CSIDriverMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
