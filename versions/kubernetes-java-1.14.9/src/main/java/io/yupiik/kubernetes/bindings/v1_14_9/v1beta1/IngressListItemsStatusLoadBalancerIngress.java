package io.yupiik.kubernetes.bindings.v1_14_9.v1beta1;

import java.util.Objects;

public class IngressListItemsStatusLoadBalancerIngress {
    private String hostname;
    private String ip;

    public IngressListItemsStatusLoadBalancerIngress() {
        // no-op
    }

    public IngressListItemsStatusLoadBalancerIngress(final String hostname,
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
        if (!(__other instanceof IngressListItemsStatusLoadBalancerIngress)) {
            return false;
        }
        final IngressListItemsStatusLoadBalancerIngress __otherCasted = (IngressListItemsStatusLoadBalancerIngress) __other;
        return Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(ip, __otherCasted.ip);
    }
}
