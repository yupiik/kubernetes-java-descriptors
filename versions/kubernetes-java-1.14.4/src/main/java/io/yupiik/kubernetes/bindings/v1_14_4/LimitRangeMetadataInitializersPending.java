package io.yupiik.kubernetes.bindings.v1_14_4;

import java.util.Objects;

public class LimitRangeMetadataInitializersPending {
    private String name;

    public LimitRangeMetadataInitializersPending() {
        // no-op
    }

    public LimitRangeMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof LimitRangeMetadataInitializersPending)) {
            return false;
        }
        final LimitRangeMetadataInitializersPending __otherCasted = (LimitRangeMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
