package io.yupiik.kubernetes.bindings.v1_14_2.v2beta2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsPodsMetricSelector {
    private List<HorizontalPodAutoscalerListItemsSpecMetricsPodsMetricSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerListItemsSpecMetricsPodsMetricSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsPodsMetricSelector(final List<HorizontalPodAutoscalerListItemsSpecMetricsPodsMetricSelectorMatchExpressions> matchExpressions,
                                                                         final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerListItemsSpecMetricsPodsMetricSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerListItemsSpecMetricsPodsMetricSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsPodsMetricSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsPodsMetricSelector __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsPodsMetricSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
