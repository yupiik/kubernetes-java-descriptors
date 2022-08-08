package io.yupiik.kubernetes.bindings.v1_23_9.v2beta2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsObjectMetricSelector {
    private List<HorizontalPodAutoscalerListItemsSpecMetricsObjectMetricSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerListItemsSpecMetricsObjectMetricSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsObjectMetricSelector(final List<HorizontalPodAutoscalerListItemsSpecMetricsObjectMetricSelectorMatchExpressions> matchExpressions,
                                                                           final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerListItemsSpecMetricsObjectMetricSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerListItemsSpecMetricsObjectMetricSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsObjectMetricSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsObjectMetricSelector __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsObjectMetricSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
