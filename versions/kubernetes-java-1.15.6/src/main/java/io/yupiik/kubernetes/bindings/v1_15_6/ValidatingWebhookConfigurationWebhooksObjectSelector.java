package io.yupiik.kubernetes.bindings.v1_15_6;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ValidatingWebhookConfigurationWebhooksObjectSelector {
    private List<ValidatingWebhookConfigurationWebhooksObjectSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public ValidatingWebhookConfigurationWebhooksObjectSelector() {
        // no-op
    }

    public ValidatingWebhookConfigurationWebhooksObjectSelector(final List<ValidatingWebhookConfigurationWebhooksObjectSelectorMatchExpressions> matchExpressions,
                                                                final Map<String, String> matchLabels) {
        // no-op
    }

    public List<ValidatingWebhookConfigurationWebhooksObjectSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<ValidatingWebhookConfigurationWebhooksObjectSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof ValidatingWebhookConfigurationWebhooksObjectSelector)) {
            return false;
        }
        final ValidatingWebhookConfigurationWebhooksObjectSelector __otherCasted = (ValidatingWebhookConfigurationWebhooksObjectSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
