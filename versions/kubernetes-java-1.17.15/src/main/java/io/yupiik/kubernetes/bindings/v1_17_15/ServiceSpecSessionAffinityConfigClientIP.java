package io.yupiik.kubernetes.bindings.v1_17_15;

import java.util.Objects;

public class ServiceSpecSessionAffinityConfigClientIP {
    private Integer timeoutSeconds;

    public ServiceSpecSessionAffinityConfigClientIP() {
        // no-op
    }

    public ServiceSpecSessionAffinityConfigClientIP(final Integer timeoutSeconds) {
        // no-op
    }

    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(final Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                timeoutSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceSpecSessionAffinityConfigClientIP)) {
            return false;
        }
        final ServiceSpecSessionAffinityConfigClientIP __otherCasted = (ServiceSpecSessionAffinityConfigClientIP) __other;
        return Objects.equals(timeoutSeconds, __otherCasted.timeoutSeconds);
    }
}
