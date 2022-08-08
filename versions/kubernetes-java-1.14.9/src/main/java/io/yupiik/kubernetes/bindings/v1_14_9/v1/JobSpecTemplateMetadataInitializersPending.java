package io.yupiik.kubernetes.bindings.v1_14_9.v1;

import java.util.Objects;

public class JobSpecTemplateMetadataInitializersPending {
    private String name;

    public JobSpecTemplateMetadataInitializersPending() {
        // no-op
    }

    public JobSpecTemplateMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof JobSpecTemplateMetadataInitializersPending)) {
            return false;
        }
        final JobSpecTemplateMetadataInitializersPending __otherCasted = (JobSpecTemplateMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
