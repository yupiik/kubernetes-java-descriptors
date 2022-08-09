package io.yupiik.kubernetes.bindings.v1_17_11.v1;

import io.yupiik.kubernetes.bindings.v1_17_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_11.Validable;
import io.yupiik.kubernetes.bindings.v1_17_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServerAddressByClientCIDR implements Validable<ServerAddressByClientCIDR>, Exportable {
    private String clientCIDR;
    private String serverAddress;

    public ServerAddressByClientCIDR() {
        // no-op
    }

    public ServerAddressByClientCIDR(final String clientCIDR,
                                     final String serverAddress) {
        // no-op
    }

    public String getClientCIDR() {
        return clientCIDR;
    }

    public void setClientCIDR(final String clientCIDR) {
        this.clientCIDR = clientCIDR;
    }

    public String getServerAddress() {
        return serverAddress;
    }

    public void setServerAddress(final String serverAddress) {
        this.serverAddress = serverAddress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clientCIDR,
                serverAddress);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServerAddressByClientCIDR)) {
            return false;
        }
        final ServerAddressByClientCIDR __otherCasted = (ServerAddressByClientCIDR) __other;
        return Objects.equals(clientCIDR, __otherCasted.clientCIDR) &&
            Objects.equals(serverAddress, __otherCasted.serverAddress);
    }

    public ServerAddressByClientCIDR clientCIDR(final String clientCIDR) {
        this.clientCIDR = clientCIDR;
        return this;
    }

    public ServerAddressByClientCIDR serverAddress(final String serverAddress) {
        this.serverAddress = serverAddress;
        return this;
    }

    @Override
    public ServerAddressByClientCIDR validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (clientCIDR == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "clientCIDR", "clientCIDR",
                "Missing 'clientCIDR' attribute.", true));
        }
        if (serverAddress == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "serverAddress", "serverAddress",
                "Missing 'serverAddress' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (clientCIDR != null ? "\"clientCIDR\":\"" +  JsonStrings.escapeJson(clientCIDR) + "\"" : ""),
                    (serverAddress != null ? "\"serverAddress\":\"" +  JsonStrings.escapeJson(serverAddress) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
