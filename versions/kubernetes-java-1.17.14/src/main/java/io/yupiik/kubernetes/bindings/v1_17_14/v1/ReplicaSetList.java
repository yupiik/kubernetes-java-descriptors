package io.yupiik.kubernetes.bindings.v1_17_14.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetList {
    private String apiVersion;
    private List<ReplicaSetListItems> items;
    private String kind;
    private ReplicaSetListMetadata metadata;

    public ReplicaSetList() {
        // no-op
    }

    public ReplicaSetList(final String apiVersion,
                          final List<ReplicaSetListItems> items,
                          final String kind,
                          final ReplicaSetListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<ReplicaSetListItems> getItems() {
        return items;
    }

    public void setItems(final List<ReplicaSetListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ReplicaSetListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ReplicaSetListMetadata metadata) {
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
        if (!(__other instanceof ReplicaSetList)) {
            return false;
        }
        final ReplicaSetList __otherCasted = (ReplicaSetList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
