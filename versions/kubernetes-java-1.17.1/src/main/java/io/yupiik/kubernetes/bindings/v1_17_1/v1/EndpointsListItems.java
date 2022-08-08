package io.yupiik.kubernetes.bindings.v1_17_1.v1;

import java.util.List;
import java.util.Objects;

public class EndpointsListItems {
    private String apiVersion;
    private String kind;
    private EndpointsListItemsMetadata metadata;
    private List<EndpointsListItemsSubsets> subsets;

    public EndpointsListItems() {
        // no-op
    }

    public EndpointsListItems(final String apiVersion,
                              final String kind,
                              final EndpointsListItemsMetadata metadata,
                              final List<EndpointsListItemsSubsets> subsets) {
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

    public EndpointsListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final EndpointsListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public List<EndpointsListItemsSubsets> getSubsets() {
        return subsets;
    }

    public void setSubsets(final List<EndpointsListItemsSubsets> subsets) {
        this.subsets = subsets;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                subsets);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointsListItems)) {
            return false;
        }
        final EndpointsListItems __otherCasted = (EndpointsListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(subsets, __otherCasted.subsets);
    }
}
