package io.yupiik.kubernetes.bindings.v1_13_2.v1;

import io.yupiik.kubernetes.bindings.v1_13_2.Validable;
import io.yupiik.kubernetes.bindings.v1_13_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SessionAffinityConfig implements Validable<SessionAffinityConfig> {
    private ClientIPConfig clientIP;

    public SessionAffinityConfig() {
        // no-op
    }

    public SessionAffinityConfig(final ClientIPConfig clientIP) {
        // no-op
    }

    public ClientIPConfig getClientIP() {
        return clientIP;
    }

    public void setClientIP(final ClientIPConfig clientIP) {
        this.clientIP = clientIP;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clientIP);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SessionAffinityConfig)) {
            return false;
        }
        final SessionAffinityConfig __otherCasted = (SessionAffinityConfig) __other;
        return Objects.equals(clientIP, __otherCasted.clientIP);
    }

    public SessionAffinityConfig clientIP(final ClientIPConfig clientIP) {
        this.clientIP = clientIP;
        return this;
    }

    @Override
    public SessionAffinityConfig validate() {
        return this;
    }
}
