package io.yupiik.kubernetes.bindings.v1_14_1;

import java.util.Objects;

public class PodSecurityPolicyMetadataInitializersPending {
    private String name;

    public PodSecurityPolicyMetadataInitializersPending() {
        // no-op
    }

    public PodSecurityPolicyMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof PodSecurityPolicyMetadataInitializersPending)) {
            return false;
        }
        final PodSecurityPolicyMetadataInitializersPending __otherCasted = (PodSecurityPolicyMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
