package io.yupiik.kubernetes.bindings.v1_30_2.v1;

import io.yupiik.kubernetes.bindings.v1_30_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_2.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodIP implements Validable<PodIP>, Exportable {
    private String ip;

    public PodIP() {
        // no-op
    }

    public PodIP(final String ip) {
        this.ip = ip;
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
        if (!(__other instanceof PodIP)) {
            return false;
        }
        final PodIP __otherCasted = (PodIP) __other;
        return Objects.equals(ip, __otherCasted.ip);
    }

    public PodIP ip(final String ip) {
        this.ip = ip;
        return this;
    }

    @Override
    public PodIP validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (ip != null ? "\"ip\":\"" +  JsonStrings.escapeJson(ip) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
