package io.yupiik.kubernetes.bindings.v1_18_14;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ValidatingWebhookConfigurationWebhooksNamespaceSelector {
    private List<ValidatingWebhookConfigurationWebhooksNamespaceSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public ValidatingWebhookConfigurationWebhooksNamespaceSelector() {
        // no-op
    }

    public ValidatingWebhookConfigurationWebhooksNamespaceSelector(final List<ValidatingWebhookConfigurationWebhooksNamespaceSelectorMatchExpressions> matchExpressions,
                                                                   final Map<String, String> matchLabels) {
        // no-op
    }

    public List<ValidatingWebhookConfigurationWebhooksNamespaceSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<ValidatingWebhookConfigurationWebhooksNamespaceSelectorMatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public Map<String, String> getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(final Map<String, String> matchLabels) {
        this.matchLabels = matchLabels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchExpressions,
                matchLabels);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ValidatingWebhookConfigurationWebhooksNamespaceSelector)) {
            return false;
        }
        final ValidatingWebhookConfigurationWebhooksNamespaceSelector __otherCasted = (ValidatingWebhookConfigurationWebhooksNamespaceSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
