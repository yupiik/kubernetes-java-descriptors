package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.Objects;

public class ServiceStatusLoadBalancerIngressPorts {
    private String error;
    private int port;
    private ServiceStatusLoadBalancerIngressPortsProtocol protocol;

    public ServiceStatusLoadBalancerIngressPorts() {
        // no-op
    }

    public ServiceStatusLoadBalancerIngressPorts(final String error,
                                                 final int port,
                                                 final ServiceStatusLoadBalancerIngressPortsProtocol protocol) {
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

    public ServiceStatusLoadBalancerIngressPortsProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(final ServiceStatusLoadBalancerIngressPortsProtocol protocol) {
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
