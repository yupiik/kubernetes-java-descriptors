package io.yupiik.kubernetes.bindings.v1_15_12.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateMetadataInitializersPending {
    private String name;

    public DaemonSetSpecTemplateMetadataInitializersPending() {
        // no-op
    }

    public DaemonSetSpecTemplateMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof DaemonSetSpecTemplateMetadataInitializersPending)) {
            return false;
        }
        final DaemonSetSpecTemplateMetadataInitializersPending __otherCasted = (DaemonSetSpecTemplateMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
