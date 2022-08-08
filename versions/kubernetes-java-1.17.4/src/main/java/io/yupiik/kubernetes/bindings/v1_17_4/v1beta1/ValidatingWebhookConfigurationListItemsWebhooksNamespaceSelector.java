package io.yupiik.kubernetes.bindings.v1_17_4.v1beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ValidatingWebhookConfigurationListItemsWebhooksNamespaceSelector {
    private List<ValidatingWebhookConfigurationListItemsWebhooksNamespaceSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public ValidatingWebhookConfigurationListItemsWebhooksNamespaceSelector() {
        // no-op
    }

    public ValidatingWebhookConfigurationListItemsWebhooksNamespaceSelector(final List<ValidatingWebhookConfigurationListItemsWebhooksNamespaceSelectorMatchExpressions> matchExpressions,
                                                                            final Map<String, String> matchLabels) {
        // no-op
    }

    public List<ValidatingWebhookConfigurationListItemsWebhooksNamespaceSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<ValidatingWebhookConfigurationListItemsWebhooksNamespaceSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof ValidatingWebhookConfigurationListItemsWebhooksNamespaceSelector)) {
            return false;
        }
        final ValidatingWebhookConfigurationListItemsWebhooksNamespaceSelector __otherCasted = (ValidatingWebhookConfigurationListItemsWebhooksNamespaceSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
