package io.yupiik.kubernetes.bindings.v1_21_11.v1;

import java.util.List;
import java.util.Objects;

public class IngressClassList {
    private String apiVersion;
    private List<IngressClassListItems> items;
    private String kind;
    private IngressClassListMetadata metadata;

    public IngressClassList() {
        // no-op
    }

    public IngressClassList(final String apiVersion,
                            final List<IngressClassListItems> items,
                            final String kind,
                            final IngressClassListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<IngressClassListItems> getItems() {
        return items;
    }

    public void setItems(final List<IngressClassListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public IngressClassListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final IngressClassListMetadata metadata) {
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
        if (!(__other instanceof IngressClassList)) {
            return false;
        }
        final IngressClassList __otherCasted = (IngressClassList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
