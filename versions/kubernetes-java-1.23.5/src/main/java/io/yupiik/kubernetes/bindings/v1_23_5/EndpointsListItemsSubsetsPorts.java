package io.yupiik.kubernetes.bindings.v1_23_5;

import java.util.Objects;

public class EndpointsListItemsSubsetsPorts {
    private String appProtocol;
    private String name;
    private int port;
    private EndpointsListItemsSubsetsPortsProtocol protocol;

    public EndpointsListItemsSubsetsPorts() {
        // no-op
    }

    public EndpointsListItemsSubsetsPorts(final String appProtocol,
                                          final String name,
                                          final int port,
                                          final EndpointsListItemsSubsetsPortsProtocol protocol) {
        // no-op
    }

    public String getAppProtocol() {
        return appProtocol;
    }

    public void setAppProtocol(final String appProtocol) {
        this.appProtocol = appProtocol;
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

    public EndpointsListItemsSubsetsPortsProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(final EndpointsListItemsSubsetsPortsProtocol protocol) {
        this.protocol = protocol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                appProtocol,
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
        return Objects.equals(appProtocol, __otherCasted.appProtocol) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }
}
