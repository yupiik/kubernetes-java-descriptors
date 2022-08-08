package io.yupiik.kubernetes.bindings.v1_14_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_14_3.Validable;
import io.yupiik.kubernetes.bindings.v1_14_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NetworkPolicyPort implements Validable<NetworkPolicyPort> {
    private String port;
    private String protocol;

    public NetworkPolicyPort() {
        // no-op
    }

    public NetworkPolicyPort(final String port,
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
        if (!(__other instanceof NetworkPolicyPort)) {
            return false;
        }
        final NetworkPolicyPort __otherCasted = (NetworkPolicyPort) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
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
