package io.yupiik.kubernetes.bindings.v1_14_7.v1beta1;

import java.util.Objects;

public class NetworkPolicySpecEgressPorts {
    private String port;
    private String protocol;

    public NetworkPolicySpecEgressPorts() {
        // no-op
    }

    public NetworkPolicySpecEgressPorts(final String port,
                                        final String protocol) {
        // no-op
    }

    public String getPort() {
        return port;
    }

    public void setPort(final String port) {
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
                port,
                protocol);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicySpecEgressPorts)) {
            return false;
        }
        final NetworkPolicySpecEgressPorts __otherCasted = (NetworkPolicySpecEgressPorts) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }
}
