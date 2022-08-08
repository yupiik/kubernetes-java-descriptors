package io.yupiik.kubernetes.bindings.v1_13_5;

import java.util.Objects;

public class ServiceSpecSessionAffinityConfig {
    private ServiceSpecSessionAffinityConfigClientIP clientIP;

    public ServiceSpecSessionAffinityConfig() {
        // no-op
    }

    public ServiceSpecSessionAffinityConfig(final ServiceSpecSessionAffinityConfigClientIP clientIP) {
        // no-op
    }

    public ServiceSpecSessionAffinityConfigClientIP getClientIP() {
        return clientIP;
    }

    public void setClientIP(final ServiceSpecSessionAffinityConfigClientIP clientIP) {
        this.clientIP = clientIP;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clientIP);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceSpecSessionAffinityConfig)) {
            return false;
        }
        final ServiceSpecSessionAffinityConfig __otherCasted = (ServiceSpecSessionAffinityConfig) __other;
        return Objects.equals(clientIP, __otherCasted.clientIP);
    }
}
