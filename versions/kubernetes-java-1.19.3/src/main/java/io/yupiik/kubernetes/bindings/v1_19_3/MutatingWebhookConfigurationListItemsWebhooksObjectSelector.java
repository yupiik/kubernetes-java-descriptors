package io.yupiik.kubernetes.bindings.v1_19_3;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MutatingWebhookConfigurationListItemsWebhooksObjectSelector {
    private List<MutatingWebhookConfigurationListItemsWebhooksObjectSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public MutatingWebhookConfigurationListItemsWebhooksObjectSelector() {
        // no-op
    }

    public MutatingWebhookConfigurationListItemsWebhooksObjectSelector(final List<MutatingWebhookConfigurationListItemsWebhooksObjectSelectorMatchExpressions> matchExpressions,
                                                                       final Map<String, String> matchLabels) {
        // no-op
    }

    public List<MutatingWebhookConfigurationListItemsWebhooksObjectSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<MutatingWebhookConfigurationListItemsWebhooksObjectSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof MutatingWebhookConfigurationListItemsWebhooksObjectSelector)) {
            return false;
        }
        final MutatingWebhookConfigurationListItemsWebhooksObjectSelector __otherCasted = (MutatingWebhookConfigurationListItemsWebhooksObjectSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
