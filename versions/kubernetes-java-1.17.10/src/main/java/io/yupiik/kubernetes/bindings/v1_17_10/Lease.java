package io.yupiik.kubernetes.bindings.v1_17_10;

import java.util.Objects;

public class Lease {
    private String apiVersion;
    private String kind;
    private LeaseMetadata metadata;
    private LeaseSpec spec;

    public Lease() {
        // no-op
    }

    public Lease(final String apiVersion,
                 final String kind,
                 final LeaseMetadata metadata,
                 final LeaseSpec spec) {
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

    public LeaseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final LeaseMetadata metadata) {
        this.metadata = metadata;
    }

    public LeaseSpec getSpec() {
        return spec;
    }

    public void setSpec(final LeaseSpec spec) {
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
        if (!(__other instanceof Lease)) {
            return false;
        }
        final Lease __otherCasted = (Lease) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
