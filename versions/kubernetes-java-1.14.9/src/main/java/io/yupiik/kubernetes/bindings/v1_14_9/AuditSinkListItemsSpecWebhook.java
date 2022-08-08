package io.yupiik.kubernetes.bindings.v1_14_9;

import java.util.Objects;

public class AuditSinkListItemsSpecWebhook {
    private AuditSinkListItemsSpecWebhookClientConfig clientConfig;
    private AuditSinkListItemsSpecWebhookThrottle throttle;

    public AuditSinkListItemsSpecWebhook() {
        // no-op
    }

    public AuditSinkListItemsSpecWebhook(final AuditSinkListItemsSpecWebhookClientConfig clientConfig,
                                         final AuditSinkListItemsSpecWebhookThrottle throttle) {
        // no-op
    }

    public AuditSinkListItemsSpecWebhookClientConfig getClientConfig() {
        return clientConfig;
    }

    public void setClientConfig(final AuditSinkListItemsSpecWebhookClientConfig clientConfig) {
        this.clientConfig = clientConfig;
    }

    public AuditSinkListItemsSpecWebhookThrottle getThrottle() {
        return throttle;
    }

    public void setThrottle(final AuditSinkListItemsSpecWebhookThrottle throttle) {
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
        if (!(__other instanceof AuditSinkListItemsSpecWebhook)) {
            return false;
        }
        final AuditSinkListItemsSpecWebhook __otherCasted = (AuditSinkListItemsSpecWebhook) __other;
        return Objects.equals(clientConfig, __otherCasted.clientConfig) &&
            Objects.equals(throttle, __otherCasted.throttle);
    }
}
