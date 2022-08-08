package io.yupiik.kubernetes.bindings.v1_19_8.v2beta2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelector {
    private List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelector(final List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelectorMatchExpressions> matchExpressions,
                                                                                      final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelector __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
