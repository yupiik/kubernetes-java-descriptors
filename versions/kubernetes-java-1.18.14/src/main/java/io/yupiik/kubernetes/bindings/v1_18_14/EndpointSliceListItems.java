package io.yupiik.kubernetes.bindings.v1_18_14;

import java.util.List;
import java.util.Objects;

public class EndpointSliceListItems {
    private String addressType;
    private String apiVersion;
    private List<EndpointSliceListItemsEndpoints> endpoints;
    private String kind;
    private EndpointSliceListItemsMetadata metadata;
    private List<EndpointSliceListItemsPorts> ports;

    public EndpointSliceListItems() {
        // no-op
    }

    public EndpointSliceListItems(final String addressType,
                                  final String apiVersion,
                                  final List<EndpointSliceListItemsEndpoints> endpoints,
                                  final String kind,
                                  final EndpointSliceListItemsMetadata metadata,
                                  final List<EndpointSliceListItemsPorts> ports) {
        // no-op
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(final String addressType) {
        this.addressType = addressType;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<EndpointSliceListItemsEndpoints> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(final List<EndpointSliceListItemsEndpoints> endpoints) {
        this.endpoints = endpoints;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public EndpointSliceListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final EndpointSliceListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public List<EndpointSliceListItemsPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<EndpointSliceListItemsPorts> ports) {
        this.ports = ports;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                addressType,
                apiVersion,
                endpoints,
                kind,
                metadata,
                ports);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointSliceListItems)) {
            return false;
        }
        final EndpointSliceListItems __otherCasted = (EndpointSliceListItems) __other;
        return Objects.equals(addressType, __otherCasted.addressType) &&
            Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(endpoints, __otherCasted.endpoints) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(ports, __otherCasted.ports);
    }
}
