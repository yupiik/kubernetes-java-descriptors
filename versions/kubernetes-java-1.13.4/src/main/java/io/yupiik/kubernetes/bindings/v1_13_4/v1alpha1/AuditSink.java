package io.yupiik.kubernetes.bindings.v1_13_4.v1alpha1;

import java.util.Objects;

public class AuditSink {
    private String apiVersion;
    private String kind;
    private AuditSinkMetadata metadata;
    private AuditSinkSpec spec;

    public AuditSink() {
        // no-op
    }

    public AuditSink(final String apiVersion,
                     final String kind,
                     final AuditSinkMetadata metadata,
                     final AuditSinkSpec spec) {
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

    public AuditSinkMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final AuditSinkMetadata metadata) {
        this.metadata = metadata;
    }

    public AuditSinkSpec getSpec() {
        return spec;
    }

    public void setSpec(final AuditSinkSpec spec) {
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
        if (!(__other instanceof AuditSink)) {
            return false;
        }
        final AuditSink __otherCasted = (AuditSink) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
