package io.yupiik.kubernetes.bindings.v1_22_2.v1;

import java.util.List;
import java.util.Objects;

public class EndpointSliceList {
    private String apiVersion;
    private List<EndpointSliceListItems> items;
    private String kind;
    private EndpointSliceListMetadata metadata;

    public EndpointSliceList() {
        // no-op
    }

    public EndpointSliceList(final String apiVersion,
                             final List<EndpointSliceListItems> items,
                             final String kind,
                             final EndpointSliceListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<EndpointSliceListItems> getItems() {
        return items;
    }

    public void setItems(final List<EndpointSliceListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public EndpointSliceListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final EndpointSliceListMetadata metadata) {
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
        if (!(__other instanceof EndpointSliceList)) {
            return false;
        }
        final EndpointSliceList __otherCasted = (EndpointSliceList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
