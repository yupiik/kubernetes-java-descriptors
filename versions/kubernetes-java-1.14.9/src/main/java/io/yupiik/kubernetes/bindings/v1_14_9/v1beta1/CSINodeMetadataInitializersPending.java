package io.yupiik.kubernetes.bindings.v1_14_9.v1beta1;

import java.util.Objects;

public class CSINodeMetadataInitializersPending {
    private String name;

    public CSINodeMetadataInitializersPending() {
        // no-op
    }

    public CSINodeMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof CSINodeMetadataInitializersPending)) {
            return false;
        }
        final CSINodeMetadataInitializersPending __otherCasted = (CSINodeMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
