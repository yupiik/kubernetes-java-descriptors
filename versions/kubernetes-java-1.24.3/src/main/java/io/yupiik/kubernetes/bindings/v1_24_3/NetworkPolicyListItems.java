package io.yupiik.kubernetes.bindings.v1_24_3;

import java.util.Objects;

public class NetworkPolicyListItems {
    private String apiVersion;
    private String kind;
    private NetworkPolicyListItemsMetadata metadata;
    private NetworkPolicyListItemsSpec spec;
    private NetworkPolicyListItemsStatus status;

    public NetworkPolicyListItems() {
        // no-op
    }

    public NetworkPolicyListItems(final String apiVersion,
                                  final String kind,
                                  final NetworkPolicyListItemsMetadata metadata,
                                  final NetworkPolicyListItemsSpec spec,
                                  final NetworkPolicyListItemsStatus status) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public NetworkPolicyListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final NetworkPolicyListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public NetworkPolicyListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final NetworkPolicyListItemsSpec spec) {
        this.spec = spec;
    }

    public NetworkPolicyListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final NetworkPolicyListItemsStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyListItems)) {
            return false;
        }
        final NetworkPolicyListItems __otherCasted = (NetworkPolicyListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
