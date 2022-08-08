package io.yupiik.kubernetes.bindings.v1_17_8.v1beta1;

import io.yupiik.kubernetes.bindings.v1_17_8.Validable;
import io.yupiik.kubernetes.bindings.v1_17_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NetworkPolicyEgressRule implements Validable<NetworkPolicyEgressRule> {
    private List<NetworkPolicyPort> ports;
    private List<NetworkPolicyPeer> to;

    public NetworkPolicyEgressRule() {
        // no-op
    }

    public NetworkPolicyEgressRule(final List<NetworkPolicyPort> ports,
                                   final List<NetworkPolicyPeer> to) {
        // no-op
    }

    public List<NetworkPolicyPort> getPorts() {
        return ports;
    }

    public void setPorts(final List<NetworkPolicyPort> ports) {
        this.ports = ports;
    }

    public List<NetworkPolicyPeer> getTo() {
        return to;
    }

    public void setTo(final List<NetworkPolicyPeer> to) {
        this.to = to;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ports,
                to);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyEgressRule)) {
            return false;
        }
        final NetworkPolicyEgressRule __otherCasted = (NetworkPolicyEgressRule) __other;
        return Objects.equals(ports, __otherCasted.ports) &&
            Objects.equals(to, __otherCasted.to);
    }

    public NetworkPolicyEgressRule ports(final List<NetworkPolicyPort> ports) {
        this.ports = ports;
        return this;
    }

    public NetworkPolicyEgressRule to(final List<NetworkPolicyPeer> to) {
        this.to = to;
        return this;
    }

    @Override
    public NetworkPolicyEgressRule validate() {
        return this;
    }
}
