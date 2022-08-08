package io.yupiik.kubernetes.bindings.v1_23_6.v1;

import java.util.Objects;

public class IngressClass {
    private String apiVersion;
    private String kind;
    private IngressClassMetadata metadata;
    private IngressClassSpec spec;

    public IngressClass() {
        // no-op
    }

    public IngressClass(final String apiVersion,
                        final String kind,
                        final IngressClassMetadata metadata,
                        final IngressClassSpec spec) {
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

    public IngressClassMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final IngressClassMetadata metadata) {
        this.metadata = metadata;
    }

    public IngressClassSpec getSpec() {
        return spec;
    }

    public void setSpec(final IngressClassSpec spec) {
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
        if (!(__other instanceof IngressClass)) {
            return false;
        }
        final IngressClass __otherCasted = (IngressClass) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
