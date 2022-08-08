package io.yupiik.kubernetes.bindings.v1_17_4.v1beta1;

import java.util.List;
import java.util.Objects;

public class NetworkPolicySpecEgress {
    private List<NetworkPolicySpecEgressPorts> ports;
    private List<NetworkPolicySpecEgressTo> to;

    public NetworkPolicySpecEgress() {
        // no-op
    }

    public NetworkPolicySpecEgress(final List<NetworkPolicySpecEgressPorts> ports,
                                   final List<NetworkPolicySpecEgressTo> to) {
        // no-op
    }

    public List<NetworkPolicySpecEgressPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<NetworkPolicySpecEgressPorts> ports) {
        this.ports = ports;
    }

    public List<NetworkPolicySpecEgressTo> getTo() {
        return to;
    }

    public void setTo(final List<NetworkPolicySpecEgressTo> to) {
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
        if (!(__other instanceof NetworkPolicySpecEgress)) {
            return false;
        }
        final NetworkPolicySpecEgress __otherCasted = (NetworkPolicySpecEgress) __other;
        return Objects.equals(ports, __otherCasted.ports) &&
            Objects.equals(to, __otherCasted.to);
    }
}
