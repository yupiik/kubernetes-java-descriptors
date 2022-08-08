package io.yupiik.kubernetes.bindings.v1_18_8;

import java.util.List;
import java.util.Objects;

public class MutatingWebhookConfigurationListItemsWebhooks {
    private List<String> admissionReviewVersions;
    private MutatingWebhookConfigurationListItemsWebhooksClientConfig clientConfig;
    private String failurePolicy;
    private String matchPolicy;
    private String name;
    private MutatingWebhookConfigurationListItemsWebhooksNamespaceSelector namespaceSelector;
    private MutatingWebhookConfigurationListItemsWebhooksObjectSelector objectSelector;
    private String reinvocationPolicy;
    private List<MutatingWebhookConfigurationListItemsWebhooksRules> rules;
    private String sideEffects;
    private Integer timeoutSeconds;

    public MutatingWebhookConfigurationListItemsWebhooks() {
        // no-op
    }

    public MutatingWebhookConfigurationListItemsWebhooks(final List<String> admissionReviewVersions,
                                                         final MutatingWebhookConfigurationListItemsWebhooksClientConfig clientConfig,
                                                         final String failurePolicy,
                                                         final String matchPolicy,
                                                         final String name,
                                                         final MutatingWebhookConfigurationListItemsWebhooksNamespaceSelector namespaceSelector,
                                                         final MutatingWebhookConfigurationListItemsWebhooksObjectSelector objectSelector,
                                                         final String reinvocationPolicy,
                                                         final List<MutatingWebhookConfigurationListItemsWebhooksRules> rules,
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

    public MutatingWebhookConfigurationListItemsWebhooksClientConfig getClientConfig() {
        return clientConfig;
    }

    public void setClientConfig(final MutatingWebhookConfigurationListItemsWebhooksClientConfig clientConfig) {
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

    public MutatingWebhookConfigurationListItemsWebhooksNamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final MutatingWebhookConfigurationListItemsWebhooksNamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    public MutatingWebhookConfigurationListItemsWebhooksObjectSelector getObjectSelector() {
        return objectSelector;
    }

    public void setObjectSelector(final MutatingWebhookConfigurationListItemsWebhooksObjectSelector objectSelector) {
        this.objectSelector = objectSelector;
    }

    public String getReinvocationPolicy() {
        return reinvocationPolicy;
    }

    public void setReinvocationPolicy(final String reinvocationPolicy) {
        this.reinvocationPolicy = reinvocationPolicy;
    }

    public List<MutatingWebhookConfigurationListItemsWebhooksRules> getRules() {
        return rules;
    }

    public void setRules(final List<MutatingWebhookConfigurationListItemsWebhooksRules> rules) {
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
                reinvocationPolicy,
                rules,
                sideEffects,
                timeoutSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof MutatingWebhookConfigurationListItemsWebhooks)) {
            return false;
        }
        final MutatingWebhookConfigurationListItemsWebhooks __otherCasted = (MutatingWebhookConfigurationListItemsWebhooks) __other;
        return Objects.equals(admissionReviewVersions, __otherCasted.admissionReviewVersions) &&
            Objects.equals(clientConfig, __otherCasted.clientConfig) &&
            Objects.equals(failurePolicy, __otherCasted.failurePolicy) &&
            Objects.equals(matchPolicy, __otherCasted.matchPolicy) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(objectSelector, __otherCasted.objectSelector) &&
            Objects.equals(reinvocationPolicy, __otherCasted.reinvocationPolicy) &&
            Objects.equals(rules, __otherCasted.rules) &&
            Objects.equals(sideEffects, __otherCasted.sideEffects) &&
            Objects.equals(timeoutSeconds, __otherCasted.timeoutSeconds);
    }
}
