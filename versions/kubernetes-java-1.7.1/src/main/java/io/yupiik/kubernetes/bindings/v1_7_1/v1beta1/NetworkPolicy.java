package io.yupiik.kubernetes.bindings.v1_7_1.v1beta1;

import java.util.Objects;

public class NetworkPolicy {
    private String apiVersion;
    private String kind;
    private NetworkPolicyMetadata metadata;
    private NetworkPolicySpec spec;

    public NetworkPolicy() {
        // no-op
    }

    public NetworkPolicy(final String apiVersion,
                         final String kind,
                         final NetworkPolicyMetadata metadata,
                         final NetworkPolicySpec spec) {
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

    public NetworkPolicyMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final NetworkPolicyMetadata metadata) {
        this.metadata = metadata;
    }

    public NetworkPolicySpec getSpec() {
        return spec;
    }

    public void setSpec(final NetworkPolicySpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicy)) {
            return false;
        }
        final NetworkPolicy __otherCasted = (NetworkPolicy) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
