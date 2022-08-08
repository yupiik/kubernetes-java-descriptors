package io.yupiik.kubernetes.bindings.v1_22_4;

import java.util.List;
import java.util.Objects;

public class StatefulSetList {
    private String apiVersion;
    private List<StatefulSetListItems> items;
    private String kind;
    private StatefulSetListMetadata metadata;

    public StatefulSetList() {
        // no-op
    }

    public StatefulSetList(final String apiVersion,
                           final List<StatefulSetListItems> items,
                           final String kind,
                           final StatefulSetListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<StatefulSetListItems> getItems() {
        return items;
    }

    public void setItems(final List<StatefulSetListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public StatefulSetListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final StatefulSetListMetadata metadata) {
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
        if (!(__other instanceof StatefulSetList)) {
            return false;
        }
        final StatefulSetList __otherCasted = (StatefulSetList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
