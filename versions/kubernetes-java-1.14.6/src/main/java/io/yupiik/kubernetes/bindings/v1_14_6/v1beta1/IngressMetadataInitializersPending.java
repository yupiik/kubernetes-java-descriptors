package io.yupiik.kubernetes.bindings.v1_14_6.v1beta1;

import java.util.Objects;

public class IngressMetadataInitializersPending {
    private String name;

    public IngressMetadataInitializersPending() {
        // no-op
    }

    public IngressMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof IngressMetadataInitializersPending)) {
            return false;
        }
        final IngressMetadataInitializersPending __otherCasted = (IngressMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
