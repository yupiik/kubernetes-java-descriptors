package io.yupiik.kubernetes.bindings.v1_17_0.v1beta1;

import java.util.Objects;

public class IngressStatusLoadBalancerIngress {
    private String hostname;
    private String ip;

    public IngressStatusLoadBalancerIngress() {
        // no-op
    }

    public IngressStatusLoadBalancerIngress(final String hostname,
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
        if (!(__other instanceof IngressStatusLoadBalancerIngress)) {
            return false;
        }
        final IngressStatusLoadBalancerIngress __otherCasted = (IngressStatusLoadBalancerIngress) __other;
        return Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(ip, __otherCasted.ip);
    }
}
