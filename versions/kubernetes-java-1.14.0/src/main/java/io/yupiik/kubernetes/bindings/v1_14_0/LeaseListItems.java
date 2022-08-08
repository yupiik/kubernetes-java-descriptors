package io.yupiik.kubernetes.bindings.v1_14_0;

import java.util.Objects;

public class LeaseListItems {
    private String apiVersion;
    private String kind;
    private LeaseListItemsMetadata metadata;
    private LeaseListItemsSpec spec;

    public LeaseListItems() {
        // no-op
    }

    public LeaseListItems(final String apiVersion,
                          final String kind,
                          final LeaseListItemsMetadata metadata,
                          final LeaseListItemsSpec spec) {
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

    public LeaseListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final LeaseListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public LeaseListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final LeaseListItemsSpec spec) {
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
        if (!(__other instanceof LeaseListItems)) {
            return false;
        }
        final LeaseListItems __otherCasted = (LeaseListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
