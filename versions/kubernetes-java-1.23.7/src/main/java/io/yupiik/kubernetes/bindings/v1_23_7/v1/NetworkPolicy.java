package io.yupiik.kubernetes.bindings.v1_23_7.v1;

import io.yupiik.kubernetes.bindings.v1_23_7.Validable;
import io.yupiik.kubernetes.bindings.v1_23_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NetworkPolicy implements Validable<NetworkPolicy> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private NetworkPolicySpec spec;

    public NetworkPolicy() {
        // no-op
    }

    public NetworkPolicy(final String apiVersion,
                         final String kind,
                         final ObjectMeta metadata,
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
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

    public NetworkPolicy apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public NetworkPolicy kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public NetworkPolicy metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public NetworkPolicy spec(final NetworkPolicySpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public NetworkPolicy validate() {
        return this;
    }
}
