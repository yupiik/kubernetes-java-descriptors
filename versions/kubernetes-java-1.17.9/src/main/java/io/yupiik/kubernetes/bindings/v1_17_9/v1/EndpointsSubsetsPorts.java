package io.yupiik.kubernetes.bindings.v1_17_9.v1;

import java.util.Objects;

public class EndpointsSubsetsPorts {
    private String name;
    private int port;
    private String protocol;

    public EndpointsSubsetsPorts() {
        // no-op
    }

    public EndpointsSubsetsPorts(final String name,
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
        if (!(__other instanceof EndpointsSubsetsPorts)) {
            return false;
        }
        final EndpointsSubsetsPorts __otherCasted = (EndpointsSubsetsPorts) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }
}
