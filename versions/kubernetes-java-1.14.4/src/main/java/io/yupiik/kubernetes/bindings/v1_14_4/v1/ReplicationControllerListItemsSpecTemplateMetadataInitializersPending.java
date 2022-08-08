package io.yupiik.kubernetes.bindings.v1_14_4.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateMetadataInitializersPending {
    private String name;

    public ReplicationControllerListItemsSpecTemplateMetadataInitializersPending() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateMetadataInitializersPending)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateMetadataInitializersPending __otherCasted = (ReplicationControllerListItemsSpecTemplateMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
