package io.yupiik.kubernetes.bindings.v1_17_1.v1beta1;

import java.util.List;
import java.util.Objects;

public class LeaseList {
    private String apiVersion;
    private List<LeaseListItems> items;
    private String kind;
    private LeaseListMetadata metadata;

    public LeaseList() {
        // no-op
    }

    public LeaseList(final String apiVersion,
                     final List<LeaseListItems> items,
                     final String kind,
                     final LeaseListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<LeaseListItems> getItems() {
        return items;
    }

    public void setItems(final List<LeaseListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public LeaseListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final LeaseListMetadata metadata) {
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
        if (!(__other instanceof LeaseList)) {
            return false;
        }
        final LeaseList __otherCasted = (LeaseList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
