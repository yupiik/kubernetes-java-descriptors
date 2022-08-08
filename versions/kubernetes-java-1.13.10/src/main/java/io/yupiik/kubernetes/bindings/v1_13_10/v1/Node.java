package io.yupiik.kubernetes.bindings.v1_13_10.v1;

import io.yupiik.kubernetes.bindings.v1_13_10.Validable;
import io.yupiik.kubernetes.bindings.v1_13_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Node implements Validable<Node> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private NodeSpec spec;
    private NodeStatus status;

    public Node() {
        // no-op
    }

    public Node(final String apiVersion,
                final String kind,
                final ObjectMeta metadata,
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
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

    public Node apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Node kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Node metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Node spec(final NodeSpec spec) {
        this.spec = spec;
        return this;
    }

    public Node status(final NodeStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public Node validate() {
        return this;
    }
}
