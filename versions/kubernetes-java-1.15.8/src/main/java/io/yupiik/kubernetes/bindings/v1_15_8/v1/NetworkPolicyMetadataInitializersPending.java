package io.yupiik.kubernetes.bindings.v1_15_8.v1;

import java.util.Objects;

public class NetworkPolicyMetadataInitializersPending {
    private String name;

    public NetworkPolicyMetadataInitializersPending() {
        // no-op
    }

    public NetworkPolicyMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof NetworkPolicyMetadataInitializersPending)) {
            return false;
        }
        final NetworkPolicyMetadataInitializersPending __otherCasted = (NetworkPolicyMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
