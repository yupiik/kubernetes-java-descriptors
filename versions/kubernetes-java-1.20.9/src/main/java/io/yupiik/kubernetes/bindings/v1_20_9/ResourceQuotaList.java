package io.yupiik.kubernetes.bindings.v1_20_9;

import java.util.List;
import java.util.Objects;

public class ResourceQuotaList {
    private String apiVersion;
    private List<ResourceQuotaListItems> items;
    private String kind;
    private ResourceQuotaListMetadata metadata;

    public ResourceQuotaList() {
        // no-op
    }

    public ResourceQuotaList(final String apiVersion,
                             final List<ResourceQuotaListItems> items,
                             final String kind,
                             final ResourceQuotaListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<ResourceQuotaListItems> getItems() {
        return items;
    }

    public void setItems(final List<ResourceQuotaListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ResourceQuotaListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ResourceQuotaListMetadata metadata) {
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
        if (!(__other instanceof ResourceQuotaList)) {
            return false;
        }
        final ResourceQuotaList __otherCasted = (ResourceQuotaList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
