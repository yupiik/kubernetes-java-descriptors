package io.yupiik.kubernetes.bindings.v1_15_1.v1;

import java.util.List;
import java.util.Objects;

public class NamespaceList {
    private String apiVersion;
    private List<NamespaceListItems> items;
    private String kind;
    private NamespaceListMetadata metadata;

    public NamespaceList() {
        // no-op
    }

    public NamespaceList(final String apiVersion,
                         final List<NamespaceListItems> items,
                         final String kind,
                         final NamespaceListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<NamespaceListItems> getItems() {
        return items;
    }

    public void setItems(final List<NamespaceListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public NamespaceListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final NamespaceListMetadata metadata) {
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
        if (!(__other instanceof NamespaceList)) {
            return false;
        }
        final NamespaceList __otherCasted = (NamespaceList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
