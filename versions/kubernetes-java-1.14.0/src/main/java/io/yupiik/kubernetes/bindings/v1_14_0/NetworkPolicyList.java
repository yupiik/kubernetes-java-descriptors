package io.yupiik.kubernetes.bindings.v1_14_0;

import java.util.List;
import java.util.Objects;

public class NetworkPolicyList {
    private String apiVersion;
    private List<NetworkPolicyListItems> items;
    private String kind;
    private NetworkPolicyListMetadata metadata;

    public NetworkPolicyList() {
        // no-op
    }

    public NetworkPolicyList(final String apiVersion,
                             final List<NetworkPolicyListItems> items,
                             final String kind,
                             final NetworkPolicyListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<NetworkPolicyListItems> getItems() {
        return items;
    }

    public void setItems(final List<NetworkPolicyListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public NetworkPolicyListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final NetworkPolicyListMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                items,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyList)) {
            return false;
        }
        final NetworkPolicyList __otherCasted = (NetworkPolicyList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
