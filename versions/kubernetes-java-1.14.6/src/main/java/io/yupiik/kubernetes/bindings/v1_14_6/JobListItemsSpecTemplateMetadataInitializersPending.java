package io.yupiik.kubernetes.bindings.v1_14_6;

import java.util.Objects;

public class JobListItemsSpecTemplateMetadataInitializersPending {
    private String name;

    public JobListItemsSpecTemplateMetadataInitializersPending() {
        // no-op
    }

    public JobListItemsSpecTemplateMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof JobListItemsSpecTemplateMetadataInitializersPending)) {
            return false;
        }
        final JobListItemsSpecTemplateMetadataInitializersPending __otherCasted = (JobListItemsSpecTemplateMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
