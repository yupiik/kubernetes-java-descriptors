package io.yupiik.kubernetes.bindings.v1_17_9;

import java.util.List;
import java.util.Objects;

public class EndpointSlice {
    private String addressType;
    private String apiVersion;
    private List<EndpointSliceEndpoints> endpoints;
    private String kind;
    private EndpointSliceMetadata metadata;
    private List<EndpointSlicePorts> ports;

    public EndpointSlice() {
        // no-op
    }

    public EndpointSlice(final String addressType,
                         final String apiVersion,
                         final List<EndpointSliceEndpoints> endpoints,
                         final String kind,
                         final EndpointSliceMetadata metadata,
                         final List<EndpointSlicePorts> ports) {
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

    public List<EndpointSliceEndpoints> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(final List<EndpointSliceEndpoints> endpoints) {
        this.endpoints = endpoints;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public EndpointSliceMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final EndpointSliceMetadata metadata) {
        this.metadata = metadata;
    }

    public List<EndpointSlicePorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<EndpointSlicePorts> ports) {
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
        if (!(__other instanceof EndpointSlice)) {
            return false;
        }
        final EndpointSlice __otherCasted = (EndpointSlice) __other;
        return Objects.equals(addressType, __otherCasted.addressType) &&
            Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(endpoints, __otherCasted.endpoints) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(ports, __otherCasted.ports);
    }
}
