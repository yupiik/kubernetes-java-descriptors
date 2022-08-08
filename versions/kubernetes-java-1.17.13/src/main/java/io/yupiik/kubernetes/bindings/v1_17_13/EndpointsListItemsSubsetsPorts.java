package io.yupiik.kubernetes.bindings.v1_17_13;

import java.util.Objects;

public class EndpointsListItemsSubsetsPorts {
    private String name;
    private int port;
    private String protocol;

    public EndpointsListItemsSubsetsPorts() {
        // no-op
    }

    public EndpointsListItemsSubsetsPorts(final String name,
                                          final int port,
                                          final String protocol) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(final int port) {
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
        if (!(__other instanceof EndpointsListItemsSubsetsPorts)) {
            return false;
        }
        final EndpointsListItemsSubsetsPorts __otherCasted = (EndpointsListItemsSubsetsPorts) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }
}
