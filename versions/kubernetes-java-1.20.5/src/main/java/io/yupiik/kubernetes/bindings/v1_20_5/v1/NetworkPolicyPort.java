package io.yupiik.kubernetes.bindings.v1_20_5.v1;

import io.yupiik.kubernetes.bindings.v1_20_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_5.Validable;
import io.yupiik.kubernetes.bindings.v1_20_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NetworkPolicyPort implements Validable<NetworkPolicyPort>, Exportable {
    private String port;
    private String protocol;

    public NetworkPolicyPort() {
        // no-op
    }

    public NetworkPolicyPort(final String port,
                             final String protocol) {
        // no-op
    }

    public String getPort() {
        return port;
    }

    public void setPort(final String port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(final String protocol) {
        this.protocol = protocol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                port,
                protocol);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyPort)) {
            return false;
        }
        final NetworkPolicyPort __otherCasted = (NetworkPolicyPort) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }

    public NetworkPolicyPort port(final String port) {
        this.port = port;
        return this;
    }

    public NetworkPolicyPort protocol(final String protocol) {
        this.protocol = protocol;
        return this;
    }

    @Override
    public NetworkPolicyPort validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (port != null ? "\"port\":\"" +  JsonStrings.escapeJson(port) + "\"" : ""),
                    (protocol != null ? "\"protocol\":\"" +  JsonStrings.escapeJson(protocol) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
