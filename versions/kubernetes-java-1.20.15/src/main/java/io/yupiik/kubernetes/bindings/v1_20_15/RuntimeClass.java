package io.yupiik.kubernetes.bindings.v1_20_15;

import java.util.Objects;

public class RuntimeClass {
    private String apiVersion;
    private String kind;
    private RuntimeClassMetadata metadata;
    private RuntimeClassSpec spec;

    public RuntimeClass() {
        // no-op
    }

    public RuntimeClass(final String apiVersion,
                        final String kind,
                        final RuntimeClassMetadata metadata,
                        final RuntimeClassSpec spec) {
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

    public RuntimeClassMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final RuntimeClassMetadata metadata) {
        this.metadata = metadata;
    }

    public RuntimeClassSpec getSpec() {
        return spec;
    }

    public void setSpec(final RuntimeClassSpec spec) {
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
        if (!(__other instanceof RuntimeClass)) {
            return false;
        }
        final RuntimeClass __otherCasted = (RuntimeClass) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
