package io.yupiik.kubernetes.bindings.v1_16_14.v1alpha1;

import java.util.Objects;

public class EndpointSliceListItemsPorts {
    private String name;
    private Integer port;
    private String protocol;

    public EndpointSliceListItemsPorts() {
        // no-op
    }

    public EndpointSliceListItemsPorts(final String name,
                                       final Integer port,
                                       final String protocol) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(final Integer port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(final String protocol) {
        this.protocol = protocol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                port,
                protocol);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointSliceListItemsPorts)) {
            return false;
        }
        final EndpointSliceListItemsPorts __otherCasted = (EndpointSliceListItemsPorts) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }
}
