package io.yupiik.kubernetes.bindings.v1_20_13;

import java.util.List;
import java.util.Objects;

public class IngressListItemsStatusLoadBalancerIngress {
    private String hostname;
    private String ip;
    private List<IngressListItemsStatusLoadBalancerIngressPorts> ports;

    public IngressListItemsStatusLoadBalancerIngress() {
        // no-op
    }

    public IngressListItemsStatusLoadBalancerIngress(final String hostname,
                                                     final String ip,
                                                     final List<IngressListItemsStatusLoadBalancerIngressPorts> ports) {
        // no-op
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(final String hostname) {
        this.hostname = hostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(final String ip) {
        this.ip = ip;
    }

    public List<IngressListItemsStatusLoadBalancerIngressPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<IngressListItemsStatusLoadBalancerIngressPorts> ports) {
        this.ports = ports;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hostname,
                ip,
                ports);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressListItemsStatusLoadBalancerIngress)) {
            return false;
        }
        final IngressListItemsStatusLoadBalancerIngress __otherCasted = (IngressListItemsStatusLoadBalancerIngress) __other;
        return Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(ip, __otherCasted.ip) &&
            Objects.equals(ports, __otherCasted.ports);
    }
}
