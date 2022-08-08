package io.yupiik.kubernetes.bindings.v1_14_6.v1;

import java.util.Objects;

public class StatefulSetMetadataInitializersPending {
    private String name;

    public StatefulSetMetadataInitializersPending() {
        // no-op
    }

    public StatefulSetMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof StatefulSetMetadataInitializersPending)) {
            return false;
        }
        final StatefulSetMetadataInitializersPending __otherCasted = (StatefulSetMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
