package io.yupiik.kubernetes.bindings.v1_21_2.v1beta1;

import java.util.List;
import java.util.Objects;

public class IngressStatusLoadBalancerIngress {
    private String hostname;
    private String ip;
    private List<IngressStatusLoadBalancerIngressPorts> ports;

    public IngressStatusLoadBalancerIngress() {
        // no-op
    }

    public IngressStatusLoadBalancerIngress(final String hostname,
                                            final String ip,
                                            final List<IngressStatusLoadBalancerIngressPorts> ports) {
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

    public List<IngressStatusLoadBalancerIngressPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<IngressStatusLoadBalancerIngressPorts> ports) {
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
        if (!(__other instanceof IngressStatusLoadBalancerIngress)) {
            return false;
        }
        final IngressStatusLoadBalancerIngress __otherCasted = (IngressStatusLoadBalancerIngress) __other;
        return Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(ip, __otherCasted.ip) &&
            Objects.equals(ports, __otherCasted.ports);
    }
}
