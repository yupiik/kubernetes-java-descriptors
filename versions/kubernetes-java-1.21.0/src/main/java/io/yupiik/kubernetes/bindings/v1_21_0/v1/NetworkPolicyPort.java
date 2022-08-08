package io.yupiik.kubernetes.bindings.v1_21_0.v1;

import io.yupiik.kubernetes.bindings.v1_21_0.Validable;
import io.yupiik.kubernetes.bindings.v1_21_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NetworkPolicyPort implements Validable<NetworkPolicyPort> {
    private Integer endPort;
    private String port;
    private String protocol;

    public NetworkPolicyPort() {
        // no-op
    }

    public NetworkPolicyPort(final Integer endPort,
                             final String port,
                             final String protocol) {
        // no-op
    }

    public Integer getEndPort() {
        return endPort;
    }

    public void setEndPort(final Integer endPort) {
        this.endPort = endPort;
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
                endPort,
                port,
                protocol);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyPort)) {
            return false;
        }
        final NetworkPolicyPort __otherCasted = (NetworkPolicyPort) __other;
        return Objects.equals(endPort, __otherCasted.endPort) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }

    public NetworkPolicyPort endPort(final Integer endPort) {
        this.endPort = endPort;
        return this;
    }

    public NetworkPolicyPort port(final String port) {
        this.port = port;
        return this;
    }

    public NetworkPolicyPort protocol(final String protocol) {
        this.protocol = protocol;
        return this;
    }

    @Override
    public NetworkPolicyPort validate() {
        return this;
    }
}
