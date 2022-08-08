package io.yupiik.kubernetes.bindings.v1_18_15;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetricSelector {
    private List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetricSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetricSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetricSelector(final List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetricSelectorMatchExpressions> matchExpressions,
                                                                                    final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetricSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetricSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetricSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetricSelector __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetricSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
