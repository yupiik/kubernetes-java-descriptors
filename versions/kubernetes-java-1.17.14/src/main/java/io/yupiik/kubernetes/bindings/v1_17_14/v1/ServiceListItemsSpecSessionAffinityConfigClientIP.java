package io.yupiik.kubernetes.bindings.v1_17_14.v1;

import java.util.Objects;

public class ServiceListItemsSpecSessionAffinityConfigClientIP {
    private Integer timeoutSeconds;

    public ServiceListItemsSpecSessionAffinityConfigClientIP() {
        // no-op
    }

    public ServiceListItemsSpecSessionAffinityConfigClientIP(final Integer timeoutSeconds) {
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
        if (!(__other instanceof ServiceListItemsSpecSessionAffinityConfigClientIP)) {
            return false;
        }
        final ServiceListItemsSpecSessionAffinityConfigClientIP __otherCasted = (ServiceListItemsSpecSessionAffinityConfigClientIP) __other;
        return Objects.equals(timeoutSeconds, __otherCasted.timeoutSeconds);
    }
}
