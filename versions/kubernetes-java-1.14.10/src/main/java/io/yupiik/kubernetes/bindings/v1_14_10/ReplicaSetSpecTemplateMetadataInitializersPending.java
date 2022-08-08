package io.yupiik.kubernetes.bindings.v1_14_10;

import java.util.Objects;

public class ReplicaSetSpecTemplateMetadataInitializersPending {
    private String name;

    public ReplicaSetSpecTemplateMetadataInitializersPending() {
        // no-op
    }

    public ReplicaSetSpecTemplateMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateMetadataInitializersPending)) {
            return false;
        }
        final ReplicaSetSpecTemplateMetadataInitializersPending __otherCasted = (ReplicaSetSpecTemplateMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
