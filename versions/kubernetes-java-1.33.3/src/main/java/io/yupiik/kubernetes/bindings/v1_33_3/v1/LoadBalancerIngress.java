package io.yupiik.kubernetes.bindings.v1_33_3.v1;

import io.yupiik.kubernetes.bindings.v1_33_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_3.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LoadBalancerIngress implements Validable<LoadBalancerIngress>, Exportable {
    private String hostname;
    private String ip;
    private String ipMode;
    private List<PortStatus> ports;

    public LoadBalancerIngress() {
        // no-op
    }

    public LoadBalancerIngress(final String hostname,
                               final String ip,
                               final String ipMode,
                               final List<PortStatus> ports) {
        this.hostname = hostname;
        this.ip = ip;
        this.ipMode = ipMode;
        this.ports = ports;
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

    public String getIpMode() {
        return ipMode;
    }

    public void setIpMode(final String ipMode) {
        this.ipMode = ipMode;
    }

    public List<PortStatus> getPorts() {
        return ports;
    }

    public void setPorts(final List<PortStatus> ports) {
        this.ports = ports;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hostname,
                ip,
                ipMode,
                ports);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LoadBalancerIngress)) {
            return false;
        }
        final LoadBalancerIngress __otherCasted = (LoadBalancerIngress) __other;
        return Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(ip, __otherCasted.ip) &&
            Objects.equals(ipMode, __otherCasted.ipMode) &&
            Objects.equals(ports, __otherCasted.ports);
    }

    public LoadBalancerIngress hostname(final String hostname) {
        this.hostname = hostname;
        return this;
    }

    public LoadBalancerIngress ip(final String ip) {
        this.ip = ip;
        return this;
    }

    public LoadBalancerIngress ipMode(final String ipMode) {
        this.ipMode = ipMode;
        return this;
    }

    public LoadBalancerIngress ports(final List<PortStatus> ports) {
        this.ports = ports;
        return this;
    }

    @Override
    public LoadBalancerIngress validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (hostname != null ? "\"hostname\":\"" +  JsonStrings.escapeJson(hostname) + "\"" : ""),
                    (ip != null ? "\"ip\":\"" +  JsonStrings.escapeJson(ip) + "\"" : ""),
                    (ipMode != null ? "\"ipMode\":\"" +  JsonStrings.escapeJson(ipMode) + "\"" : ""),
                    (ports != null ? "\"ports\":" + ports.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
