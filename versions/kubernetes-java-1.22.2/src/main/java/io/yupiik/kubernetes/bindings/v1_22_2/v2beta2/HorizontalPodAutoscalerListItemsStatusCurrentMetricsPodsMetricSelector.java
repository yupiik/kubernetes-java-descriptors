package io.yupiik.kubernetes.bindings.v1_22_2.v2beta2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelector {
    private List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelector(final List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelectorMatchExpressions> matchExpressions,
                                                                                  final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelector __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
