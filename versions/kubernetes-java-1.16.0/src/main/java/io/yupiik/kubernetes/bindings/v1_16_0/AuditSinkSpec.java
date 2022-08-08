package io.yupiik.kubernetes.bindings.v1_16_0;

import java.util.Objects;

public class AuditSinkSpec {
    private AuditSinkSpecPolicy policy;
    private AuditSinkSpecWebhook webhook;

    public AuditSinkSpec() {
        // no-op
    }

    public AuditSinkSpec(final AuditSinkSpecPolicy policy,
                         final AuditSinkSpecWebhook webhook) {
        // no-op
    }

    public AuditSinkSpecPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(final AuditSinkSpecPolicy policy) {
        this.policy = policy;
    }

    public AuditSinkSpecWebhook getWebhook() {
        return webhook;
    }

    public void setWebhook(final AuditSinkSpecWebhook webhook) {
        this.webhook = webhook;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                policy,
                webhook);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AuditSinkSpec)) {
            return false;
        }
        final AuditSinkSpec __otherCasted = (AuditSinkSpec) __other;
        return Objects.equals(policy, __otherCasted.policy) &&
            Objects.equals(webhook, __otherCasted.webhook);
    }
}
