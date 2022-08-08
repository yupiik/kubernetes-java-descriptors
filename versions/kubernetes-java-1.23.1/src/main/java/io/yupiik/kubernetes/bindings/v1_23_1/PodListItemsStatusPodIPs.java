package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class PodListItemsStatusPodIPs {
    private String ip;

    public PodListItemsStatusPodIPs() {
        // no-op
    }

    public PodListItemsStatusPodIPs(final String ip) {
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
        if (!(__other instanceof PodListItemsStatusPodIPs)) {
            return false;
        }
        final PodListItemsStatusPodIPs __otherCasted = (PodListItemsStatusPodIPs) __other;
        return Objects.equals(ip, __otherCasted.ip);
    }
}
