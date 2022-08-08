package io.yupiik.kubernetes.bindings.v1_14_5.v1beta1;

import java.util.List;
import java.util.Objects;

public class NetworkPolicyListItemsMetadataInitializers {
    private List<NetworkPolicyListItemsMetadataInitializersPending> pending;
    private NetworkPolicyListItemsMetadataInitializersResult result;

    public NetworkPolicyListItemsMetadataInitializers() {
        // no-op
    }

    public NetworkPolicyListItemsMetadataInitializers(final List<NetworkPolicyListItemsMetadataInitializersPending> pending,
                                                      final NetworkPolicyListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<NetworkPolicyListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<NetworkPolicyListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public NetworkPolicyListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final NetworkPolicyListItemsMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyListItemsMetadataInitializers)) {
            return false;
        }
        final NetworkPolicyListItemsMetadataInitializers __otherCasted = (NetworkPolicyListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
