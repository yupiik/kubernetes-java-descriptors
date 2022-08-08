package io.yupiik.kubernetes.bindings.v1_20_11;

import java.util.List;
import java.util.Objects;

public class PriorityClassList {
    private String apiVersion;
    private List<PriorityClassListItems> items;
    private String kind;
    private PriorityClassListMetadata metadata;

    public PriorityClassList() {
        // no-op
    }

    public PriorityClassList(final String apiVersion,
                             final List<PriorityClassListItems> items,
                             final String kind,
                             final PriorityClassListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<PriorityClassListItems> getItems() {
        return items;
    }

    public void setItems(final List<PriorityClassListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public PriorityClassListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PriorityClassListMetadata metadata) {
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
        if (!(__other instanceof PriorityClassList)) {
            return false;
        }
        final PriorityClassList __otherCasted = (PriorityClassList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
