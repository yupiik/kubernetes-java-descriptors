package io.yupiik.kubernetes.bindings.v1_14_3.v1;

import java.util.Objects;

public class NetworkPolicyListItemsMetadataInitializersPending {
    private String name;

    public NetworkPolicyListItemsMetadataInitializersPending() {
        // no-op
    }

    public NetworkPolicyListItemsMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof NetworkPolicyListItemsMetadataInitializersPending)) {
            return false;
        }
        final NetworkPolicyListItemsMetadataInitializersPending __otherCasted = (NetworkPolicyListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
