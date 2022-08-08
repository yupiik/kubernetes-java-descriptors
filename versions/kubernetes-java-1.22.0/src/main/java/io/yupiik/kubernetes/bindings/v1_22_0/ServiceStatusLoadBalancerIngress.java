package io.yupiik.kubernetes.bindings.v1_22_0;

import java.util.List;
import java.util.Objects;

public class ServiceStatusLoadBalancerIngress {
    private String hostname;
    private String ip;
    private List<ServiceStatusLoadBalancerIngressPorts> ports;

    public ServiceStatusLoadBalancerIngress() {
        // no-op
    }

    public ServiceStatusLoadBalancerIngress(final String hostname,
                                            final String ip,
                                            final List<ServiceStatusLoadBalancerIngressPorts> ports) {
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

    public List<ServiceStatusLoadBalancerIngressPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<ServiceStatusLoadBalancerIngressPorts> ports) {
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
        if (!(__other instanceof ServiceStatusLoadBalancerIngress)) {
            return false;
        }
        final ServiceStatusLoadBalancerIngress __otherCasted = (ServiceStatusLoadBalancerIngress) __other;
        return Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(ip, __otherCasted.ip) &&
            Objects.equals(ports, __otherCasted.ports);
    }
}
