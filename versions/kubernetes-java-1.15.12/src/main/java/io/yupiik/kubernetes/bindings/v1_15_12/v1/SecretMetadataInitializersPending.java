package io.yupiik.kubernetes.bindings.v1_15_12.v1;

import java.util.Objects;

public class SecretMetadataInitializersPending {
    private String name;

    public SecretMetadataInitializersPending() {
        // no-op
    }

    public SecretMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof SecretMetadataInitializersPending)) {
            return false;
        }
        final SecretMetadataInitializersPending __otherCasted = (SecretMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
