package io.yupiik.kubernetes.bindings.v1_15_6;

import java.util.Objects;

public class AuditSinkMetadataInitializersPending {
    private String name;

    public AuditSinkMetadataInitializersPending() {
        // no-op
    }

    public AuditSinkMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof AuditSinkMetadataInitializersPending)) {
            return false;
        }
        final AuditSinkMetadataInitializersPending __otherCasted = (AuditSinkMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
