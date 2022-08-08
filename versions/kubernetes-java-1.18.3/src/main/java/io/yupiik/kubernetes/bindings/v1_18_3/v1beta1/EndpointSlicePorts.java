package io.yupiik.kubernetes.bindings.v1_18_3.v1beta1;

import java.util.Objects;

public class EndpointSlicePorts {
    private String appProtocol;
    private String name;
    private Integer port;
    private String protocol;

    public EndpointSlicePorts() {
        // no-op
    }

    public EndpointSlicePorts(final String appProtocol,
                              final String name,
                              final Integer port,
                              final String protocol) {
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
                appProtocol,
                name,
                port,
                protocol);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointSlicePorts)) {
            return false;
        }
        final EndpointSlicePorts __otherCasted = (EndpointSlicePorts) __other;
        return Objects.equals(appProtocol, __otherCasted.appProtocol) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }
}
