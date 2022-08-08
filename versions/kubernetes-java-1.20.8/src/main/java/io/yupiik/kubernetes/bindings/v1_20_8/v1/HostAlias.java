package io.yupiik.kubernetes.bindings.v1_20_8.v1;

import io.yupiik.kubernetes.bindings.v1_20_8.Validable;
import io.yupiik.kubernetes.bindings.v1_20_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HostAlias implements Validable<HostAlias> {
    private List<String> hostnames;
    private String ip;

    public HostAlias() {
        // no-op
    }

    public HostAlias(final List<String> hostnames,
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
        if (!(__other instanceof HostAlias)) {
            return false;
        }
        final HostAlias __otherCasted = (HostAlias) __other;
        return Objects.equals(hostnames, __otherCasted.hostnames) &&
            Objects.equals(ip, __otherCasted.ip);
    }

    public HostAlias hostnames(final List<String> hostnames) {
        this.hostnames = hostnames;
        return this;
    }

    public HostAlias ip(final String ip) {
        this.ip = ip;
        return this;
    }

    @Override
    public HostAlias validate() {
        return this;
    }
}
