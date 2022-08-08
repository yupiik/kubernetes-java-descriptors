package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MutatingWebhookConfigurationWebhooksObjectSelector {
    private List<MutatingWebhookConfigurationWebhooksObjectSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public MutatingWebhookConfigurationWebhooksObjectSelector() {
        // no-op
    }

    public MutatingWebhookConfigurationWebhooksObjectSelector(final List<MutatingWebhookConfigurationWebhooksObjectSelectorMatchExpressions> matchExpressions,
                                                              final Map<String, String> matchLabels) {
        // no-op
    }

    public List<MutatingWebhookConfigurationWebhooksObjectSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<MutatingWebhookConfigurationWebhooksObjectSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof MutatingWebhookConfigurationWebhooksObjectSelector)) {
            return false;
        }
        final MutatingWebhookConfigurationWebhooksObjectSelector __otherCasted = (MutatingWebhookConfigurationWebhooksObjectSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
