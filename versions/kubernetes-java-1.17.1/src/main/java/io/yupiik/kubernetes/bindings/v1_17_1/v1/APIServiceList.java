package io.yupiik.kubernetes.bindings.v1_17_1.v1;

import java.util.List;
import java.util.Objects;

public class APIServiceList {
    private String apiVersion;
    private List<APIServiceListItems> items;
    private String kind;
    private APIServiceListMetadata metadata;

    public APIServiceList() {
        // no-op
    }

    public APIServiceList(final String apiVersion,
                          final List<APIServiceListItems> items,
                          final String kind,
                          final APIServiceListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<APIServiceListItems> getItems() {
        return items;
    }

    public void setItems(final List<APIServiceListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public APIServiceListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final APIServiceListMetadata metadata) {
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
        if (!(__other instanceof APIServiceList)) {
            return false;
        }
        final APIServiceList __otherCasted = (APIServiceList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
