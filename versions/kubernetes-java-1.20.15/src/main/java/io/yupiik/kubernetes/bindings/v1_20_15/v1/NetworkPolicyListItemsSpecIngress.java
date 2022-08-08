package io.yupiik.kubernetes.bindings.v1_20_15.v1;

import java.util.List;
import java.util.Objects;

public class NetworkPolicyListItemsSpecIngress {
    private List<NetworkPolicyListItemsSpecIngressFrom> from;
    private List<NetworkPolicyListItemsSpecIngressPorts> ports;

    public NetworkPolicyListItemsSpecIngress() {
        // no-op
    }

    public NetworkPolicyListItemsSpecIngress(final List<NetworkPolicyListItemsSpecIngressFrom> from,
                                             final List<NetworkPolicyListItemsSpecIngressPorts> ports) {
        // no-op
    }

    public List<NetworkPolicyListItemsSpecIngressFrom> getFrom() {
        return from;
    }

    public void setFrom(final List<NetworkPolicyListItemsSpecIngressFrom> from) {
        this.from = from;
    }

    public List<NetworkPolicyListItemsSpecIngressPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<NetworkPolicyListItemsSpecIngressPorts> ports) {
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
        if (!(__other instanceof NetworkPolicyListItemsSpecIngress)) {
            return false;
        }
        final NetworkPolicyListItemsSpecIngress __otherCasted = (NetworkPolicyListItemsSpecIngress) __other;
        return Objects.equals(from, __otherCasted.from) &&
            Objects.equals(ports, __otherCasted.ports);
    }
}
