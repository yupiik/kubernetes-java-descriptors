package io.yupiik.kubernetes.bindings.v1_18_19.v1;

import java.util.List;
import java.util.Objects;

public class LimitRangeList {
    private String apiVersion;
    private List<LimitRangeListItems> items;
    private String kind;
    private LimitRangeListMetadata metadata;

    public LimitRangeList() {
        // no-op
    }

    public LimitRangeList(final String apiVersion,
                          final List<LimitRangeListItems> items,
                          final String kind,
                          final LimitRangeListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<LimitRangeListItems> getItems() {
        return items;
    }

    public void setItems(final List<LimitRangeListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public LimitRangeListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final LimitRangeListMetadata metadata) {
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
        if (!(__other instanceof LimitRangeList)) {
            return false;
        }
        final LimitRangeList __otherCasted = (LimitRangeList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
