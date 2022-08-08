package io.yupiik.kubernetes.bindings.v1_17_5.v1;

import java.util.List;
import java.util.Objects;

public class ValidatingWebhookConfigurationWebhooks {
    private List<String> admissionReviewVersions;
    private ValidatingWebhookConfigurationWebhooksClientConfig clientConfig;
    private String failurePolicy;
    private String matchPolicy;
    private String name;
    private ValidatingWebhookConfigurationWebhooksNamespaceSelector namespaceSelector;
    private ValidatingWebhookConfigurationWebhooksObjectSelector objectSelector;
    private List<ValidatingWebhookConfigurationWebhooksRules> rules;
    private String sideEffects;
    private Integer timeoutSeconds;

    public ValidatingWebhookConfigurationWebhooks() {
        // no-op
    }

    public ValidatingWebhookConfigurationWebhooks(final List<String> admissionReviewVersions,
                                                  final ValidatingWebhookConfigurationWebhooksClientConfig clientConfig,
                                                  final String failurePolicy,
                                                  final String matchPolicy,
                                                  final String name,
                                                  final ValidatingWebhookConfigurationWebhooksNamespaceSelector namespaceSelector,
                                                  final ValidatingWebhookConfigurationWebhooksObjectSelector objectSelector,
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

    public String getMatchPolicy() {
        return matchPolicy;
    }

    public void setMatchPolicy(final String matchPolicy) {
        this.matchPolicy = matchPolicy;
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

    public ValidatingWebhookConfigurationWebhooksObjectSelector getObjectSelector() {
        return objectSelector;
    }

    public void setObjectSelector(final ValidatingWebhookConfigurationWebhooksObjectSelector objectSelector) {
        this.objectSelector = objectSelector;
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
                matchPolicy,
                name,
                namespaceSelector,
                objectSelector,
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
            Objects.equals(matchPolicy, __otherCasted.matchPolicy) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(objectSelector, __otherCasted.objectSelector) &&
            Objects.equals(rules, __otherCasted.rules) &&
            Objects.equals(sideEffects, __otherCasted.sideEffects) &&
            Objects.equals(timeoutSeconds, __otherCasted.timeoutSeconds);
    }
}
