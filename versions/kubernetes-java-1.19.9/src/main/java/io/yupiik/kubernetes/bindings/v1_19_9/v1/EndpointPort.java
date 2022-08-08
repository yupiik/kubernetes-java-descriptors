package io.yupiik.kubernetes.bindings.v1_19_9.v1;

import io.yupiik.kubernetes.bindings.v1_19_9.Validable;
import io.yupiik.kubernetes.bindings.v1_19_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EndpointPort implements Validable<EndpointPort> {
    private String appProtocol;
    private String name;
    private int port;
    private String protocol;

    public EndpointPort() {
        // no-op
    }

    public EndpointPort(final String appProtocol,
                        final String name,
                        final int port,
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
                appProtocol,
                name,
                port,
                protocol);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointPort)) {
            return false;
        }
        final EndpointPort __otherCasted = (EndpointPort) __other;
        return Objects.equals(appProtocol, __otherCasted.appProtocol) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }

    public EndpointPort appProtocol(final String appProtocol) {
        this.appProtocol = appProtocol;
        return this;
    }

    public EndpointPort name(final String name) {
        this.name = name;
        return this;
    }

    public EndpointPort port(final int port) {
        this.port = port;
        return this;
    }

    public EndpointPort protocol(final String protocol) {
        this.protocol = protocol;
        return this;
    }

    @Override
    public EndpointPort validate() {
        return this;
    }
}
