package io.yupiik.kubernetes.bindings.v1_16_8.v2beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsSelector {
    private List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsSelector(final List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsSelectorMatchExpressions> matchExpressions,
                                                                            final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsSelector __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
