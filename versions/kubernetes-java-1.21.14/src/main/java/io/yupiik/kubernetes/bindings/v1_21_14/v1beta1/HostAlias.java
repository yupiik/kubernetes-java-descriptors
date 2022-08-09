package io.yupiik.kubernetes.bindings.v1_21_14.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_14.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_14.Validable;
import io.yupiik.kubernetes.bindings.v1_21_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class HostAlias implements Validable<HostAlias>, Exportable {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (hostnames != null ? "\"hostnames\":" + hostnames.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (ip != null ? "\"ip\":\"" +  JsonStrings.escapeJson(ip) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
