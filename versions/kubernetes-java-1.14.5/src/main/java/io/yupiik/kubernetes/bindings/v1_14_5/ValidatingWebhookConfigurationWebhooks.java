package io.yupiik.kubernetes.bindings.v1_14_5;

import java.util.List;
import java.util.Objects;

public class ValidatingWebhookConfigurationWebhooks {
    private List<String> admissionReviewVersions;
    private ValidatingWebhookConfigurationWebhooksClientConfig clientConfig;
    private String failurePolicy;
    private String name;
    private ValidatingWebhookConfigurationWebhooksNamespaceSelector namespaceSelector;
    private List<ValidatingWebhookConfigurationWebhooksRules> rules;
    private String sideEffects;
    private Integer timeoutSeconds;

    public ValidatingWebhookConfigurationWebhooks() {
        // no-op
    }

    public ValidatingWebhookConfigurationWebhooks(final List<String> admissionReviewVersions,
                                                  final ValidatingWebhookConfigurationWebhooksClientConfig clientConfig,
                                                  final String failurePolicy,
                                                  final String name,
                                                  final ValidatingWebhookConfigurationWebhooksNamespaceSelector namespaceSelector,
                                                  final List<ValidatingWebhookConfigurationWebhooksRules> rules,
                                                  final String sideEffects,
                                                  final Integer timeoutSeconds) {
        // no-op
    }

    public List<String> getAdmissionReviewVersions() {
        return admissionReviewVersions;
    }

    public void setAdmissionReviewVersions(final List<String> admissionReviewVersions) {
        this.admissionReviewVersions = admissionReviewVersions;
    }

    public ValidatingWebhookConfigurationWebhooksClientConfig getClientConfig() {
        return clientConfig;
    }

    public void setClientConfig(final ValidatingWebhookConfigurationWebhooksClientConfig clientConfig) {
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

    public ValidatingWebhookConfigurationWebhooksNamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final ValidatingWebhookConfigurationWebhooksNamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    public List<ValidatingWebhookConfigurationWebhooksRules> getRules() {
        return rules;
    }

    public void setRules(final List<ValidatingWebhookConfigurationWebhooksRules> rules) {
        this.rules = rules;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(final String sideEffects) {
        this.sideEffects = sideEffects;
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
                admissionReviewVersions,
                clientConfig,
                failurePolicy,
                name,
                namespaceSelector,
                rules,
                sideEffects,
                timeoutSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ValidatingWebhookConfigurationWebhooks)) {
            return false;
        }
        final ValidatingWebhookConfigurationWebhooks __otherCasted = (ValidatingWebhookConfigurationWebhooks) __other;
        return Objects.equals(admissionReviewVersions, __otherCasted.admissionReviewVersions) &&
            Objects.equals(clientConfig, __otherCasted.clientConfig) &&
            Objects.equals(failurePolicy, __otherCasted.failurePolicy) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(rules, __otherCasted.rules) &&
            Objects.equals(sideEffects, __otherCasted.sideEffects) &&
            Objects.equals(timeoutSeconds, __otherCasted.timeoutSeconds);
    }
}
