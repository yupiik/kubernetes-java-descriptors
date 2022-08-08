package io.yupiik.kubernetes.bindings.v1_15_7;

import java.util.Objects;

public class DaemonSetMetadataInitializersPending {
    private String name;

    public DaemonSetMetadataInitializersPending() {
        // no-op
    }

    public DaemonSetMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof DaemonSetMetadataInitializersPending)) {
            return false;
        }
        final DaemonSetMetadataInitializersPending __otherCasted = (DaemonSetMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
