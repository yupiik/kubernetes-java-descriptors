package io.yupiik.kubernetes.bindings.v1_16_11.v2beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsPodsSelector {
    private List<HorizontalPodAutoscalerSpecMetricsPodsSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerSpecMetricsPodsSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsPodsSelector(final List<HorizontalPodAutoscalerSpecMetricsPodsSelectorMatchExpressions> matchExpressions,
                                                          final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerSpecMetricsPodsSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerSpecMetricsPodsSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsPodsSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsPodsSelector __otherCasted = (HorizontalPodAutoscalerSpecMetricsPodsSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
