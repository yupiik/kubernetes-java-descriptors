package io.yupiik.kubernetes.bindings.v1_18_3;

import java.util.Objects;

public class AuditSinkSpecWebhook {
    private AuditSinkSpecWebhookClientConfig clientConfig;
    private AuditSinkSpecWebhookThrottle throttle;

    public AuditSinkSpecWebhook() {
        // no-op
    }

    public AuditSinkSpecWebhook(final AuditSinkSpecWebhookClientConfig clientConfig,
                                final AuditSinkSpecWebhookThrottle throttle) {
        // no-op
    }

    public AuditSinkSpecWebhookClientConfig getClientConfig() {
        return clientConfig;
    }

    public void setClientConfig(final AuditSinkSpecWebhookClientConfig clientConfig) {
        this.clientConfig = clientConfig;
    }

    public AuditSinkSpecWebhookThrottle getThrottle() {
        return throttle;
    }

    public void setThrottle(final AuditSinkSpecWebhookThrottle throttle) {
        this.throttle = throttle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clientConfig,
                throttle);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AuditSinkSpecWebhook)) {
            return false;
        }
        final AuditSinkSpecWebhook __otherCasted = (AuditSinkSpecWebhook) __other;
        return Objects.equals(clientConfig, __otherCasted.clientConfig) &&
            Objects.equals(throttle, __otherCasted.throttle);
    }
}
