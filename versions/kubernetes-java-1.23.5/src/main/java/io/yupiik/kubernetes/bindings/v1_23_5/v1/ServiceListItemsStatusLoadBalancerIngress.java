package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.List;
import java.util.Objects;

public class ServiceListItemsStatusLoadBalancerIngress {
    private String hostname;
    private String ip;
    private List<ServiceListItemsStatusLoadBalancerIngressPorts> ports;

    public ServiceListItemsStatusLoadBalancerIngress() {
        // no-op
    }

    public ServiceListItemsStatusLoadBalancerIngress(final String hostname,
                                                     final String ip,
                                                     final List<ServiceListItemsStatusLoadBalancerIngressPorts> ports) {
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

    public List<ServiceListItemsStatusLoadBalancerIngressPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<ServiceListItemsStatusLoadBalancerIngressPorts> ports) {
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
        if (!(__other instanceof ServiceListItemsStatusLoadBalancerIngress)) {
            return false;
        }
        final ServiceListItemsStatusLoadBalancerIngress __otherCasted = (ServiceListItemsStatusLoadBalancerIngress) __other;
        return Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(ip, __otherCasted.ip) &&
            Objects.equals(ports, __otherCasted.ports);
    }
}
