package io.yupiik.kubernetes.bindings.v1_18_12;

import java.util.Objects;

public class PodSecurityPolicy {
    private String apiVersion;
    private String kind;
    private PodSecurityPolicyMetadata metadata;
    private PodSecurityPolicySpec spec;

    public PodSecurityPolicy() {
        // no-op
    }

    public PodSecurityPolicy(final String apiVersion,
                             final String kind,
                             final PodSecurityPolicyMetadata metadata,
                             final PodSecurityPolicySpec spec) {
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

    public PodSecurityPolicyMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodSecurityPolicyMetadata metadata) {
        this.metadata = metadata;
    }

    public PodSecurityPolicySpec getSpec() {
        return spec;
    }

    public void setSpec(final PodSecurityPolicySpec spec) {
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
        if (!(__other instanceof PodSecurityPolicy)) {
            return false;
        }
        final PodSecurityPolicy __otherCasted = (PodSecurityPolicy) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
