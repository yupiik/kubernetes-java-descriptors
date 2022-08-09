package io.yupiik.kubernetes.bindings.v1_24_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_24_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_0.Validable;
import io.yupiik.kubernetes.bindings.v1_24_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class GRPCAction implements Validable<GRPCAction>, Exportable {
    private int port;
    private String service;

    public GRPCAction() {
        // no-op
    }

    public GRPCAction(final int port,
                      final String service) {
        // no-op
    }

    public int getPort() {
        return port;
    }

    public void setPort(final int port) {
        this.port = port;
    }

    public String getService() {
        return service;
    }

    public void setService(final String service) {
        this.service = service;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                port,
                service);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof GRPCAction)) {
            return false;
        }
        final GRPCAction __otherCasted = (GRPCAction) __other;
        return Objects.equals(port, __otherCasted.port) &&
            Objects.equals(service, __otherCasted.service);
    }

    public GRPCAction port(final int port) {
        this.port = port;
        return this;
    }

    public GRPCAction service(final String service) {
        this.service = service;
        return this;
    }

    @Override
    public GRPCAction validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"port\":" + port,
                    (service != null ? "\"service\":\"" +  JsonStrings.escapeJson(service) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
