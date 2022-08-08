package io.yupiik.kubernetes.bindings.v1_18_17.v2beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelector {
    private List<HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelector(final List<HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelectorMatchExpressions> matchExpressions,
                                                                             final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelector __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
