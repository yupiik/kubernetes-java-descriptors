package io.yupiik.kubernetes.bindings.v1_19_16;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ValidatingWebhookConfigurationListItemsWebhooksObjectSelector {
    private List<ValidatingWebhookConfigurationListItemsWebhooksObjectSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public ValidatingWebhookConfigurationListItemsWebhooksObjectSelector() {
        // no-op
    }

    public ValidatingWebhookConfigurationListItemsWebhooksObjectSelector(final List<ValidatingWebhookConfigurationListItemsWebhooksObjectSelectorMatchExpressions> matchExpressions,
                                                                         final Map<String, String> matchLabels) {
        // no-op
    }

    public List<ValidatingWebhookConfigurationListItemsWebhooksObjectSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<ValidatingWebhookConfigurationListItemsWebhooksObjectSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof ValidatingWebhookConfigurationListItemsWebhooksObjectSelector)) {
            return false;
        }
        final ValidatingWebhookConfigurationListItemsWebhooksObjectSelector __otherCasted = (ValidatingWebhookConfigurationListItemsWebhooksObjectSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
