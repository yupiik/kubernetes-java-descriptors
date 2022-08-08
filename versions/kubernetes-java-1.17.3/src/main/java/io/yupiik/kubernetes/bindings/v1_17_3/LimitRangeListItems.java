package io.yupiik.kubernetes.bindings.v1_17_3;

import java.util.Objects;

public class LimitRangeListItems {
    private String apiVersion;
    private String kind;
    private LimitRangeListItemsMetadata metadata;
    private LimitRangeListItemsSpec spec;

    public LimitRangeListItems() {
        // no-op
    }

    public LimitRangeListItems(final String apiVersion,
                               final String kind,
                               final LimitRangeListItemsMetadata metadata,
                               final LimitRangeListItemsSpec spec) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public LimitRangeListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final LimitRangeListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public LimitRangeListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final LimitRangeListItemsSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LimitRangeListItems)) {
            return false;
        }
        final LimitRangeListItems __otherCasted = (LimitRangeListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
