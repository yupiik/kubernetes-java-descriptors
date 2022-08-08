package io.yupiik.kubernetes.bindings.v1_21_12.v2beta2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsObjectMetricSelector {
    private List<HorizontalPodAutoscalerSpecMetricsObjectMetricSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerSpecMetricsObjectMetricSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsObjectMetricSelector(final List<HorizontalPodAutoscalerSpecMetricsObjectMetricSelectorMatchExpressions> matchExpressions,
                                                                  final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerSpecMetricsObjectMetricSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerSpecMetricsObjectMetricSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsObjectMetricSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsObjectMetricSelector __otherCasted = (HorizontalPodAutoscalerSpecMetricsObjectMetricSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
