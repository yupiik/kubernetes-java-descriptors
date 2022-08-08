package io.yupiik.kubernetes.bindings.v1_15_8.v1;

import java.util.Objects;

public class NodeListItems {
    private String apiVersion;
    private String kind;
    private NodeListItemsMetadata metadata;
    private NodeListItemsSpec spec;
    private NodeListItemsStatus status;

    public NodeListItems() {
        // no-op
    }

    public NodeListItems(final String apiVersion,
                         final String kind,
                         final NodeListItemsMetadata metadata,
                         final NodeListItemsSpec spec,
                         final NodeListItemsStatus status) {
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

    public NodeListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final NodeListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public NodeListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final NodeListItemsSpec spec) {
        this.spec = spec;
    }

    public NodeListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final NodeListItemsStatus status) {
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
        if (!(__other instanceof NodeListItems)) {
            return false;
        }
        final NodeListItems __otherCasted = (NodeListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
