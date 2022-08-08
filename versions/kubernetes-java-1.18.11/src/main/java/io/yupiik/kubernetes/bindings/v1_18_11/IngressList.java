package io.yupiik.kubernetes.bindings.v1_18_11;

import java.util.List;
import java.util.Objects;

public class IngressList {
    private String apiVersion;
    private List<IngressListItems> items;
    private String kind;
    private IngressListMetadata metadata;

    public IngressList() {
        // no-op
    }

    public IngressList(final String apiVersion,
                       final List<IngressListItems> items,
                       final String kind,
                       final IngressListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<IngressListItems> getItems() {
        return items;
    }

    public void setItems(final List<IngressListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public IngressListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final IngressListMetadata metadata) {
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
        if (!(__other instanceof IngressList)) {
            return false;
        }
        final IngressList __otherCasted = (IngressList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
