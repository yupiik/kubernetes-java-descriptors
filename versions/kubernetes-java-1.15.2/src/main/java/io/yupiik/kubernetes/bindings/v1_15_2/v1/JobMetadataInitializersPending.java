package io.yupiik.kubernetes.bindings.v1_15_2.v1;

import java.util.Objects;

public class JobMetadataInitializersPending {
    private String name;

    public JobMetadataInitializersPending() {
        // no-op
    }

    public JobMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof JobMetadataInitializersPending)) {
            return false;
        }
        final JobMetadataInitializersPending __otherCasted = (JobMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
