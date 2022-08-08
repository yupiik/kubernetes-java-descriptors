package io.yupiik.kubernetes.bindings.v1_23_8;

import java.util.Objects;

public class LimitRange {
    private String apiVersion;
    private String kind;
    private LimitRangeMetadata metadata;
    private LimitRangeSpec spec;

    public LimitRange() {
        // no-op
    }

    public LimitRange(final String apiVersion,
                      final String kind,
                      final LimitRangeMetadata metadata,
                      final LimitRangeSpec spec) {
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

    public LimitRangeMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final LimitRangeMetadata metadata) {
        this.metadata = metadata;
    }

    public LimitRangeSpec getSpec() {
        return spec;
    }

    public void setSpec(final LimitRangeSpec spec) {
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
        if (!(__other instanceof LimitRange)) {
            return false;
        }
        final LimitRange __otherCasted = (LimitRange) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
