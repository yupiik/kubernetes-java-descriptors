package io.yupiik.kubernetes.bindings.v1_15_1;

import java.util.Objects;

public class AuditSinkListItemsMetadataInitializersPending {
    private String name;

    public AuditSinkListItemsMetadataInitializersPending() {
        // no-op
    }

    public AuditSinkListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof AuditSinkListItemsMetadataInitializersPending)) {
            return false;
        }
        final AuditSinkListItemsMetadataInitializersPending __otherCasted = (AuditSinkListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
