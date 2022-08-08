package io.yupiik.kubernetes.bindings.v1_16_4.v1;

import io.yupiik.kubernetes.bindings.v1_16_4.Validable;
import io.yupiik.kubernetes.bindings.v1_16_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NetworkPolicyIngressRule implements Validable<NetworkPolicyIngressRule> {
    private List<NetworkPolicyPeer> from;
    private List<NetworkPolicyPort> ports;

    public NetworkPolicyIngressRule() {
        // no-op
    }

    public NetworkPolicyIngressRule(final List<NetworkPolicyPeer> from,
                                    final List<NetworkPolicyPort> ports) {
        // no-op
    }

    public List<NetworkPolicyPeer> getFrom() {
        return from;
    }

    public void setFrom(final List<NetworkPolicyPeer> from) {
        this.from = from;
    }

    public List<NetworkPolicyPort> getPorts() {
        return ports;
    }

    public void setPorts(final List<NetworkPolicyPort> ports) {
        this.ports = ports;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                from,
                ports);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyIngressRule)) {
            return false;
        }
        final NetworkPolicyIngressRule __otherCasted = (NetworkPolicyIngressRule) __other;
        return Objects.equals(from, __otherCasted.from) &&
            Objects.equals(ports, __otherCasted.ports);
    }

    public NetworkPolicyIngressRule from(final List<NetworkPolicyPeer> from) {
        this.from = from;
        return this;
    }

    public NetworkPolicyIngressRule ports(final List<NetworkPolicyPort> ports) {
        this.ports = ports;
        return this;
    }

    @Override
    public NetworkPolicyIngressRule validate() {
        return this;
    }
}
