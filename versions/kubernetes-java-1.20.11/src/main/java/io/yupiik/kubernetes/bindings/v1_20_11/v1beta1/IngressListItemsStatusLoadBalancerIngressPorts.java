package io.yupiik.kubernetes.bindings.v1_20_11.v1beta1;

import java.util.Objects;

public class IngressListItemsStatusLoadBalancerIngressPorts {
    private String error;
    private int port;
    private String protocol;

    public IngressListItemsStatusLoadBalancerIngressPorts() {
        // no-op
    }

    public IngressListItemsStatusLoadBalancerIngressPorts(final String error,
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
        if (!(__other instanceof IngressListItemsStatusLoadBalancerIngressPorts)) {
            return false;
        }
        final IngressListItemsStatusLoadBalancerIngressPorts __otherCasted = (IngressListItemsStatusLoadBalancerIngressPorts) __other;
        return Objects.equals(error, __otherCasted.error) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }
}
