package io.yupiik.kubernetes.bindings.v1_14_7;

import java.util.Objects;

public class JobListItemsMetadataInitializersPending {
    private String name;

    public JobListItemsMetadataInitializersPending() {
        // no-op
    }

    public JobListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof JobListItemsMetadataInitializersPending)) {
            return false;
        }
        final JobListItemsMetadataInitializersPending __otherCasted = (JobListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
