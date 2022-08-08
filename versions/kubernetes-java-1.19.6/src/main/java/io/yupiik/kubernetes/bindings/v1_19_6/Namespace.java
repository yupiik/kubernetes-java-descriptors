package io.yupiik.kubernetes.bindings.v1_19_6;

import java.util.Objects;

public class Namespace {
    private String apiVersion;
    private String kind;
    private NamespaceMetadata metadata;
    private NamespaceSpec spec;
    private NamespaceStatus status;

    public Namespace() {
        // no-op
    }

    public Namespace(final String apiVersion,
                     final String kind,
                     final NamespaceMetadata metadata,
                     final NamespaceSpec spec,
                     final NamespaceStatus status) {
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

    public NamespaceMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final NamespaceMetadata metadata) {
        this.metadata = metadata;
    }

    public NamespaceSpec getSpec() {
        return spec;
    }

    public void setSpec(final NamespaceSpec spec) {
        this.spec = spec;
    }

    public NamespaceStatus getStatus() {
        return status;
    }

    public void setStatus(final NamespaceStatus status) {
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
        if (!(__other instanceof Namespace)) {
            return false;
        }
        final Namespace __otherCasted = (Namespace) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
