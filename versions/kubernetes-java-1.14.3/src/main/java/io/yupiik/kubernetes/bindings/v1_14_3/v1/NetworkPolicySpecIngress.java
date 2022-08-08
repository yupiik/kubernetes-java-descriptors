package io.yupiik.kubernetes.bindings.v1_14_3.v1;

import java.util.List;
import java.util.Objects;

public class NetworkPolicySpecIngress {
    private List<NetworkPolicySpecIngressFrom> from;
    private List<NetworkPolicySpecIngressPorts> ports;

    public NetworkPolicySpecIngress() {
        // no-op
    }

    public NetworkPolicySpecIngress(final List<NetworkPolicySpecIngressFrom> from,
                                    final List<NetworkPolicySpecIngressPorts> ports) {
        // no-op
    }

    public List<NetworkPolicySpecIngressFrom> getFrom() {
        return from;
    }

    public void setFrom(final List<NetworkPolicySpecIngressFrom> from) {
        this.from = from;
    }

    public List<NetworkPolicySpecIngressPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<NetworkPolicySpecIngressPorts> ports) {
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
        if (!(__other instanceof NetworkPolicySpecIngress)) {
            return false;
        }
        final NetworkPolicySpecIngress __otherCasted = (NetworkPolicySpecIngress) __other;
        return Objects.equals(from, __otherCasted.from) &&
            Objects.equals(ports, __otherCasted.ports);
    }
}
