package io.yupiik.kubernetes.bindings.v1_15_7.v1;

import java.util.Objects;

public class ServiceListItemsStatusLoadBalancerIngress {
    private String hostname;
    private String ip;

    public ServiceListItemsStatusLoadBalancerIngress() {
        // no-op
    }

    public ServiceListItemsStatusLoadBalancerIngress(final String hostname,
                                                     final String ip) {
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

    @Override
    public int hashCode() {
        return Objects.hash(
                hostname,
                ip);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceListItemsStatusLoadBalancerIngress)) {
            return false;
        }
        final ServiceListItemsStatusLoadBalancerIngress __otherCasted = (ServiceListItemsStatusLoadBalancerIngress) __other;
        return Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(ip, __otherCasted.ip);
    }
}
