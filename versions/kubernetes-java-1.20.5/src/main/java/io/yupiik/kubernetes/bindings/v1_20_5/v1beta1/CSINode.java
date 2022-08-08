package io.yupiik.kubernetes.bindings.v1_20_5.v1beta1;

import java.util.Objects;

public class CSINode {
    private String apiVersion;
    private String kind;
    private CSINodeMetadata metadata;
    private CSINodeSpec spec;

    public CSINode() {
        // no-op
    }

    public CSINode(final String apiVersion,
                   final String kind,
                   final CSINodeMetadata metadata,
                   final CSINodeSpec spec) {
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

    public CSINodeMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CSINodeMetadata metadata) {
        this.metadata = metadata;
    }

    public CSINodeSpec getSpec() {
        return spec;
    }

    public void setSpec(final CSINodeSpec spec) {
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
        if (!(__other instanceof CSINode)) {
            return false;
        }
        final CSINode __otherCasted = (CSINode) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
