package io.yupiik.kubernetes.bindings.v1_17_0.v1;

import java.util.List;
import java.util.Objects;

public class ValidatingWebhookConfigurationListItemsWebhooks {
    private List<String> admissionReviewVersions;
    private ValidatingWebhookConfigurationListItemsWebhooksClientConfig clientConfig;
    private String failurePolicy;
    private String matchPolicy;
    private String name;
    private ValidatingWebhookConfigurationListItemsWebhooksNamespaceSelector namespaceSelector;
    private ValidatingWebhookConfigurationListItemsWebhooksObjectSelector objectSelector;
    private List<ValidatingWebhookConfigurationListItemsWebhooksRules> rules;
    private String sideEffects;
    private Integer timeoutSeconds;

    public ValidatingWebhookConfigurationListItemsWebhooks() {
        // no-op
    }

    public ValidatingWebhookConfigurationListItemsWebhooks(final List<String> admissionReviewVersions,
                                                           final ValidatingWebhookConfigurationListItemsWebhooksClientConfig clientConfig,
                                                           final String failurePolicy,
                                                           final String matchPolicy,
                                                           final String name,
                                                           final ValidatingWebhookConfigurationListItemsWebhooksNamespaceSelector namespaceSelector,
                                                           final ValidatingWebhookConfigurationListItemsWebhooksObjectSelector objectSelector,
                                                           final List<ValidatingWebhookConfigurationListItemsWebhooksRules> rules,
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

    public ValidatingWebhookConfigurationListItemsWebhooksClientConfig getClientConfig() {
        return clientConfig;
    }

    public void setClientConfig(final ValidatingWebhookConfigurationListItemsWebhooksClientConfig clientConfig) {
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

    public ValidatingWebhookConfigurationListItemsWebhooksNamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final ValidatingWebhookConfigurationListItemsWebhooksNamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    public ValidatingWebhookConfigurationListItemsWebhooksObjectSelector getObjectSelector() {
        return objectSelector;
    }

    public void setObjectSelector(final ValidatingWebhookConfigurationListItemsWebhooksObjectSelector objectSelector) {
        this.objectSelector = objectSelector;
    }

    public List<ValidatingWebhookConfigurationListItemsWebhooksRules> getRules() {
        return rules;
    }

    public void setRules(final List<ValidatingWebhookConfigurationListItemsWebhooksRules> rules) {
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
        if (!(__other instanceof ValidatingWebhookConfigurationListItemsWebhooks)) {
            return false;
        }
        final ValidatingWebhookConfigurationListItemsWebhooks __otherCasted = (ValidatingWebhookConfigurationListItemsWebhooks) __other;
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
