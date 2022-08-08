package io.yupiik.kubernetes.bindings.v1_15_7.v2beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsPodsSelector {
    private List<HorizontalPodAutoscalerStatusCurrentMetricsPodsSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerStatusCurrentMetricsPodsSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsPodsSelector(final List<HorizontalPodAutoscalerStatusCurrentMetricsPodsSelectorMatchExpressions> matchExpressions,
                                                                   final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerStatusCurrentMetricsPodsSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerStatusCurrentMetricsPodsSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsPodsSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsPodsSelector __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsPodsSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
