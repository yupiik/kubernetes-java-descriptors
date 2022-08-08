package io.yupiik.kubernetes.bindings.v1_20_14.v2beta2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsPodsMetricSelector {
    private List<HorizontalPodAutoscalerSpecMetricsPodsMetricSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerSpecMetricsPodsMetricSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsPodsMetricSelector(final List<HorizontalPodAutoscalerSpecMetricsPodsMetricSelectorMatchExpressions> matchExpressions,
                                                                final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerSpecMetricsPodsMetricSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerSpecMetricsPodsMetricSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsPodsMetricSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsPodsMetricSelector __otherCasted = (HorizontalPodAutoscalerSpecMetricsPodsMetricSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
