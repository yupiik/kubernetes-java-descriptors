package io.yupiik.kubernetes.bindings.v1_17_9.v2beta2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsPodsMetricSelector {
    private List<HorizontalPodAutoscalerStatusCurrentMetricsPodsMetricSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerStatusCurrentMetricsPodsMetricSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsPodsMetricSelector(final List<HorizontalPodAutoscalerStatusCurrentMetricsPodsMetricSelectorMatchExpressions> matchExpressions,
                                                                         final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerStatusCurrentMetricsPodsMetricSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerStatusCurrentMetricsPodsMetricSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsPodsMetricSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsPodsMetricSelector __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsPodsMetricSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
