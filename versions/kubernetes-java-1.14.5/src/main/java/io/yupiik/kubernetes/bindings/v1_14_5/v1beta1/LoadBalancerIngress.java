package io.yupiik.kubernetes.bindings.v1_14_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_14_5.Validable;
import io.yupiik.kubernetes.bindings.v1_14_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LoadBalancerIngress implements Validable<LoadBalancerIngress> {
    private String hostname;
    private String ip;

    public LoadBalancerIngress() {
        // no-op
    }

    public LoadBalancerIngress(final String hostname,
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
        if (!(__other instanceof LoadBalancerIngress)) {
            return false;
        }
        final LoadBalancerIngress __otherCasted = (LoadBalancerIngress) __other;
        return Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(ip, __otherCasted.ip);
    }

    public LoadBalancerIngress hostname(final String hostname) {
        this.hostname = hostname;
        return this;
    }

    public LoadBalancerIngress ip(final String ip) {
        this.ip = ip;
        return this;
    }

    @Override
    public LoadBalancerIngress validate() {
        return this;
    }
}
