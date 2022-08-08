package io.yupiik.kubernetes.bindings.v1_16_3.v2beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectSelector {
    private List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectSelector(final List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectSelectorMatchExpressions> matchExpressions,
                                                                              final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectSelector __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
