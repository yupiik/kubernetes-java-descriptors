package io.yupiik.kubernetes.bindings.v1_20_6.v1;

import java.util.Objects;

public class ServiceListItemsSpecSessionAffinityConfig {
    private ServiceListItemsSpecSessionAffinityConfigClientIP clientIP;

    public ServiceListItemsSpecSessionAffinityConfig() {
        // no-op
    }

    public ServiceListItemsSpecSessionAffinityConfig(final ServiceListItemsSpecSessionAffinityConfigClientIP clientIP) {
        // no-op
    }

    public ServiceListItemsSpecSessionAffinityConfigClientIP getClientIP() {
        return clientIP;
    }

    public void setClientIP(final ServiceListItemsSpecSessionAffinityConfigClientIP clientIP) {
        this.clientIP = clientIP;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clientIP);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceListItemsSpecSessionAffinityConfig)) {
            return false;
        }
        final ServiceListItemsSpecSessionAffinityConfig __otherCasted = (ServiceListItemsSpecSessionAffinityConfig) __other;
        return Objects.equals(clientIP, __otherCasted.clientIP);
    }
}
