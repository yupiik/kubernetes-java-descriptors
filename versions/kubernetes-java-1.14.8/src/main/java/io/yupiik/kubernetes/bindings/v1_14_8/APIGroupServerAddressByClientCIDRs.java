package io.yupiik.kubernetes.bindings.v1_14_8;

import java.util.Objects;

public class APIGroupServerAddressByClientCIDRs {
    private String clientCIDR;
    private String serverAddress;

    public APIGroupServerAddressByClientCIDRs() {
        // no-op
    }

    public APIGroupServerAddressByClientCIDRs(final String clientCIDR,
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
        if (!(__other instanceof APIGroupServerAddressByClientCIDRs)) {
            return false;
        }
        final APIGroupServerAddressByClientCIDRs __otherCasted = (APIGroupServerAddressByClientCIDRs) __other;
        return Objects.equals(clientCIDR, __otherCasted.clientCIDR) &&
            Objects.equals(serverAddress, __otherCasted.serverAddress);
    }
}
