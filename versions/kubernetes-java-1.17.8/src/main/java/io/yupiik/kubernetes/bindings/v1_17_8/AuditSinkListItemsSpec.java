package io.yupiik.kubernetes.bindings.v1_17_8;

import java.util.Objects;

public class AuditSinkListItemsSpec {
    private AuditSinkListItemsSpecPolicy policy;
    private AuditSinkListItemsSpecWebhook webhook;

    public AuditSinkListItemsSpec() {
        // no-op
    }

    public AuditSinkListItemsSpec(final AuditSinkListItemsSpecPolicy policy,
                                  final AuditSinkListItemsSpecWebhook webhook) {
        // no-op
    }

    public AuditSinkListItemsSpecPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(final AuditSinkListItemsSpecPolicy policy) {
        this.policy = policy;
    }

    public AuditSinkListItemsSpecWebhook getWebhook() {
        return webhook;
    }

    public void setWebhook(final AuditSinkListItemsSpecWebhook webhook) {
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
        if (!(__other instanceof AuditSinkListItemsSpec)) {
            return false;
        }
        final AuditSinkListItemsSpec __otherCasted = (AuditSinkListItemsSpec) __other;
        return Objects.equals(policy, __otherCasted.policy) &&
            Objects.equals(webhook, __otherCasted.webhook);
    }
}
