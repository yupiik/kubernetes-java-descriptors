package io.yupiik.kubernetes.bindings.v1_15_0.v1;

import java.util.Objects;

public class Node {
    private String apiVersion;
    private String kind;
    private NodeMetadata metadata;
    private NodeSpec spec;
    private NodeStatus status;

    public Node() {
        // no-op
    }

    public Node(final String apiVersion,
                final String kind,
                final NodeMetadata metadata,
                final NodeSpec spec,
                final NodeStatus status) {
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

    public NodeMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final NodeMetadata metadata) {
        this.metadata = metadata;
    }

    public NodeSpec getSpec() {
        return spec;
    }

    public void setSpec(final NodeSpec spec) {
        this.spec = spec;
    }

    public NodeStatus getStatus() {
        return status;
    }

    public void setStatus(final NodeStatus status) {
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
        if (!(__other instanceof Node)) {
            return false;
        }
        final Node __otherCasted = (Node) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
