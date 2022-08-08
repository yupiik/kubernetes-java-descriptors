package io.yupiik.kubernetes.bindings.v1_23_5.v2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsObjectMetricSelector {
    private List<HorizontalPodAutoscalerStatusCurrentMetricsObjectMetricSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerStatusCurrentMetricsObjectMetricSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsObjectMetricSelector(final List<HorizontalPodAutoscalerStatusCurrentMetricsObjectMetricSelectorMatchExpressions> matchExpressions,
                                                                           final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerStatusCurrentMetricsObjectMetricSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerStatusCurrentMetricsObjectMetricSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsObjectMetricSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsObjectMetricSelector __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsObjectMetricSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
