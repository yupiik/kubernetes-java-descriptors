package io.yupiik.kubernetes.bindings.v1_16_11.v2beta2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsExternalMetricSelector {
    private List<HorizontalPodAutoscalerSpecMetricsExternalMetricSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerSpecMetricsExternalMetricSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsExternalMetricSelector(final List<HorizontalPodAutoscalerSpecMetricsExternalMetricSelectorMatchExpressions> matchExpressions,
                                                                    final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerSpecMetricsExternalMetricSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerSpecMetricsExternalMetricSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsExternalMetricSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsExternalMetricSelector __otherCasted = (HorizontalPodAutoscalerSpecMetricsExternalMetricSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
