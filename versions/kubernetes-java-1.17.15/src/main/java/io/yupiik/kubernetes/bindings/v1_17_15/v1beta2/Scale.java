package io.yupiik.kubernetes.bindings.v1_17_15.v1beta2;

import java.util.Objects;

public class Scale {
    private String apiVersion;
    private String kind;
    private ScaleMetadata metadata;
    private ScaleSpec spec;
    private ScaleStatus status;

    public Scale() {
        // no-op
    }

    public Scale(final String apiVersion,
                 final String kind,
                 final ScaleMetadata metadata,
                 final ScaleSpec spec,
                 final ScaleStatus status) {
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

    public ScaleMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ScaleMetadata metadata) {
        this.metadata = metadata;
    }

    public ScaleSpec getSpec() {
        return spec;
    }

    public void setSpec(final ScaleSpec spec) {
        this.spec = spec;
    }

    public ScaleStatus getStatus() {
        return status;
    }

    public void setStatus(final ScaleStatus status) {
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
        if (!(__other instanceof Scale)) {
            return false;
        }
        final Scale __otherCasted = (Scale) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
