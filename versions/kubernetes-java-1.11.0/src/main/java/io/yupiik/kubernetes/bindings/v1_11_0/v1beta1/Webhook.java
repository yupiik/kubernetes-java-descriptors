package io.yupiik.kubernetes.bindings.v1_11_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_11_0.Validable;
import io.yupiik.kubernetes.bindings.v1_11_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Webhook implements Validable<Webhook> {
    private WebhookClientConfig clientConfig;
    private String failurePolicy;
    private String name;
    private LabelSelector namespaceSelector;
    private List<RuleWithOperations> rules;

    public Webhook() {
        // no-op
    }

    public Webhook(final WebhookClientConfig clientConfig,
                   final String failurePolicy,
                   final String name,
                   final LabelSelector namespaceSelector,
                   final List<RuleWithOperations> rules) {
        // no-op
    }

    public WebhookClientConfig getClientConfig() {
        return clientConfig;
    }

    public void setClientConfig(final WebhookClientConfig clientConfig) {
        this.clientConfig = clientConfig;
    }

    public String getFailurePolicy() {
        return failurePolicy;
    }

    public void setFailurePolicy(final String failurePolicy) {
        this.failurePolicy = failurePolicy;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public LabelSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    public List<RuleWithOperations> getRules() {
        return rules;
    }

    public void setRules(final List<RuleWithOperations> rules) {
        this.rules = rules;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clientConfig,
                failurePolicy,
                name,
                namespaceSelector,
                rules);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Webhook)) {
            return false;
        }
        final Webhook __otherCasted = (Webhook) __other;
        return Objects.equals(clientConfig, __otherCasted.clientConfig) &&
            Objects.equals(failurePolicy, __otherCasted.failurePolicy) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(rules, __otherCasted.rules);
    }

    public Webhook clientConfig(final WebhookClientConfig clientConfig) {
        this.clientConfig = clientConfig;
        return this;
    }

    public Webhook failurePolicy(final String failurePolicy) {
        this.failurePolicy = failurePolicy;
        return this;
    }

    public Webhook name(final String name) {
        this.name = name;
        return this;
    }

    public Webhook namespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
        return this;
    }

    public Webhook rules(final List<RuleWithOperations> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public Webhook validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (clientConfig == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "clientConfig", "clientConfig",
                "Missing 'clientConfig' attribute.", true));
        }
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
