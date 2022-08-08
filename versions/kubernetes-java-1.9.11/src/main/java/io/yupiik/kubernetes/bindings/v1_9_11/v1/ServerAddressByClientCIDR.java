package io.yupiik.kubernetes.bindings.v1_9_11.v1;

import io.yupiik.kubernetes.bindings.v1_9_11.Validable;
import io.yupiik.kubernetes.bindings.v1_9_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServerAddressByClientCIDR implements Validable<ServerAddressByClientCIDR> {
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
}
