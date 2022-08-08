package io.yupiik.kubernetes.bindings.v1_14_0.v1;

import java.util.List;
import java.util.Objects;

public class NetworkPolicyListItemsSpecEgress {
    private List<NetworkPolicyListItemsSpecEgressPorts> ports;
    private List<NetworkPolicyListItemsSpecEgressTo> to;

    public NetworkPolicyListItemsSpecEgress() {
        // no-op
    }

    public NetworkPolicyListItemsSpecEgress(final List<NetworkPolicyListItemsSpecEgressPorts> ports,
                                            final List<NetworkPolicyListItemsSpecEgressTo> to) {
        // no-op
    }

    public List<NetworkPolicyListItemsSpecEgressPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<NetworkPolicyListItemsSpecEgressPorts> ports) {
        this.ports = ports;
    }

    public List<NetworkPolicyListItemsSpecEgressTo> getTo() {
        return to;
    }

    public void setTo(final List<NetworkPolicyListItemsSpecEgressTo> to) {
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
        if (!(__other instanceof NetworkPolicyListItemsSpecEgress)) {
            return false;
        }
        final NetworkPolicyListItemsSpecEgress __otherCasted = (NetworkPolicyListItemsSpecEgress) __other;
        return Objects.equals(ports, __otherCasted.ports) &&
            Objects.equals(to, __otherCasted.to);
    }
}
