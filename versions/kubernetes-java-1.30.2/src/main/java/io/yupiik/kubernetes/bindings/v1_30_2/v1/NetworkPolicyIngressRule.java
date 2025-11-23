package io.yupiik.kubernetes.bindings.v1_30_2.v1;

import io.yupiik.kubernetes.bindings.v1_30_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_2.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NetworkPolicyIngressRule implements Validable<NetworkPolicyIngressRule>, Exportable {
    private List<NetworkPolicyPeer> from;
    private List<NetworkPolicyPort> ports;

    public NetworkPolicyIngressRule() {
        // no-op
    }

    public NetworkPolicyIngressRule(final List<NetworkPolicyPeer> from,
                                    final List<NetworkPolicyPort> ports) {
        this.from = from;
        this.ports = ports;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (from != null ? "\"from\":" + from.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (ports != null ? "\"ports\":" + ports.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
