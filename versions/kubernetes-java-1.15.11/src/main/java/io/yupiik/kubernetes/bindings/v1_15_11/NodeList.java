package io.yupiik.kubernetes.bindings.v1_15_11;

import java.util.List;
import java.util.Objects;

public class NodeList {
    private String apiVersion;
    private List<NodeListItems> items;
    private String kind;
    private NodeListMetadata metadata;

    public NodeList() {
        // no-op
    }

    public NodeList(final String apiVersion,
                    final List<NodeListItems> items,
                    final String kind,
                    final NodeListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<NodeListItems> getItems() {
        return items;
    }

    public void setItems(final List<NodeListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public NodeListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final NodeListMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                items,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeList)) {
            return false;
        }
        final NodeList __otherCasted = (NodeList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
