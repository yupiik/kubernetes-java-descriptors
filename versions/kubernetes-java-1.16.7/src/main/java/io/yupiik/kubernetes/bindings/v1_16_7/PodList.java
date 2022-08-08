package io.yupiik.kubernetes.bindings.v1_16_7;

import java.util.List;
import java.util.Objects;

public class PodList {
    private String apiVersion;
    private List<PodListItems> items;
    private String kind;
    private PodListMetadata metadata;

    public PodList() {
        // no-op
    }

    public PodList(final String apiVersion,
                   final List<PodListItems> items,
                   final String kind,
                   final PodListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<PodListItems> getItems() {
        return items;
    }

    public void setItems(final List<PodListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public PodListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodListMetadata metadata) {
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
        if (!(__other instanceof PodList)) {
            return false;
        }
        final PodList __otherCasted = (PodList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
