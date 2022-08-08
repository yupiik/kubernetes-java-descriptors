package io.yupiik.kubernetes.bindings.v1_18_18;

import java.util.Objects;

public class PodStatusPodIPs {
    private String ip;

    public PodStatusPodIPs() {
        // no-op
    }

    public PodStatusPodIPs(final String ip) {
        // no-op
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
                ip);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodStatusPodIPs)) {
            return false;
        }
        final PodStatusPodIPs __otherCasted = (PodStatusPodIPs) __other;
        return Objects.equals(ip, __otherCasted.ip);
    }
}
