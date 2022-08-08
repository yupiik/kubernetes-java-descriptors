package io.yupiik.kubernetes.bindings.v1_20_14;

import java.util.Objects;

public class ServiceStatusLoadBalancerIngressPorts {
    private String error;
    private int port;
    private String protocol;

    public ServiceStatusLoadBalancerIngressPorts() {
        // no-op
    }

    public ServiceStatusLoadBalancerIngressPorts(final String error,
                                                 final int port,
                                                 final String protocol) {
        // no-op
    }

    public String getError() {
        return error;
    }

    public void setError(final String error) {
        this.error = error;
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
                error,
                port,
                protocol);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceStatusLoadBalancerIngressPorts)) {
            return false;
        }
        final ServiceStatusLoadBalancerIngressPorts __otherCasted = (ServiceStatusLoadBalancerIngressPorts) __other;
        return Objects.equals(error, __otherCasted.error) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }
}
