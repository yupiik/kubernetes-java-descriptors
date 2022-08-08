package io.yupiik.kubernetes.bindings.v1_14_5.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_14_5.Validable;
import io.yupiik.kubernetes.bindings.v1_14_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AuditSinkSpec implements Validable<AuditSinkSpec> {
    private Policy policy;
    private Webhook webhook;

    public AuditSinkSpec() {
        // no-op
    }

    public AuditSinkSpec(final Policy policy,
                         final Webhook webhook) {
        // no-op
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(final Policy policy) {
        this.policy = policy;
    }

    public Webhook getWebhook() {
        return webhook;
    }

    public void setWebhook(final Webhook webhook) {
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

    public AuditSinkSpec policy(final Policy policy) {
        this.policy = policy;
        return this;
    }

    public AuditSinkSpec webhook(final Webhook webhook) {
        this.webhook = webhook;
        return this;
    }

    @Override
    public AuditSinkSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (policy == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "policy", "policy",
                "Missing 'policy' attribute.", true));
        }
        if (webhook == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "webhook", "webhook",
                "Missing 'webhook' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
