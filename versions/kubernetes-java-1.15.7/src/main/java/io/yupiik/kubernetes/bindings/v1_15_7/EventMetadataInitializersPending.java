package io.yupiik.kubernetes.bindings.v1_15_7;

import java.util.Objects;

public class EventMetadataInitializersPending {
    private String name;

    public EventMetadataInitializersPending() {
        // no-op
    }

    public EventMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof EventMetadataInitializersPending)) {
            return false;
        }
        final EventMetadataInitializersPending __otherCasted = (EventMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
