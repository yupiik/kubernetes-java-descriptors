package io.yupiik.kubernetes.bindings.v1_16_8.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecHostAliases {
    private List<String> hostnames;
    private String ip;

    public PodListItemsSpecHostAliases() {
        // no-op
    }

    public PodListItemsSpecHostAliases(final List<String> hostnames,
                                       final String ip) {
        // no-op
    }

    public List<String> getHostnames() {
        return hostnames;
    }

    public void setHostnames(final List<String> hostnames) {
        this.hostnames = hostnames;
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
                hostnames,
                ip);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecHostAliases)) {
            return false;
        }
        final PodListItemsSpecHostAliases __otherCasted = (PodListItemsSpecHostAliases) __other;
        return Objects.equals(hostnames, __otherCasted.hostnames) &&
            Objects.equals(ip, __otherCasted.ip);
    }
}
