package io.yupiik.kubernetes.bindings.v1_24_2;

import java.util.Objects;

public class NetworkPolicy {
    private String apiVersion;
    private String kind;
    private NetworkPolicyMetadata metadata;
    private NetworkPolicySpec spec;
    private NetworkPolicyStatus status;

    public NetworkPolicy() {
        // no-op
    }

    public NetworkPolicy(final String apiVersion,
                         final String kind,
                         final NetworkPolicyMetadata metadata,
                         final NetworkPolicySpec spec,
                         final NetworkPolicyStatus status) {
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

    public NetworkPolicyStatus getStatus() {
        return status;
    }

    public void setStatus(final NetworkPolicyStatus status) {
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
        if (!(__other instanceof NetworkPolicy)) {
            return false;
        }
        final NetworkPolicy __otherCasted = (NetworkPolicy) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
