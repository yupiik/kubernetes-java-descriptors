package io.yupiik.kubernetes.bindings.v1_20_12.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MutatingWebhookConfigurationListItemsWebhooksNamespaceSelector {
    private List<MutatingWebhookConfigurationListItemsWebhooksNamespaceSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public MutatingWebhookConfigurationListItemsWebhooksNamespaceSelector() {
        // no-op
    }

    public MutatingWebhookConfigurationListItemsWebhooksNamespaceSelector(final List<MutatingWebhookConfigurationListItemsWebhooksNamespaceSelectorMatchExpressions> matchExpressions,
                                                                          final Map<String, String> matchLabels) {
        // no-op
    }

    public List<MutatingWebhookConfigurationListItemsWebhooksNamespaceSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<MutatingWebhookConfigurationListItemsWebhooksNamespaceSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof MutatingWebhookConfigurationListItemsWebhooksNamespaceSelector)) {
            return false;
        }
        final MutatingWebhookConfigurationListItemsWebhooksNamespaceSelector __otherCasted = (MutatingWebhookConfigurationListItemsWebhooksNamespaceSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
