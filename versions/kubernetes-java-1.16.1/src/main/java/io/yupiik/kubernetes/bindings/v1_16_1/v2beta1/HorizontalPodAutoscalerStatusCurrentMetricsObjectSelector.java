package io.yupiik.kubernetes.bindings.v1_16_1.v2beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsObjectSelector {
    private List<HorizontalPodAutoscalerStatusCurrentMetricsObjectSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerStatusCurrentMetricsObjectSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsObjectSelector(final List<HorizontalPodAutoscalerStatusCurrentMetricsObjectSelectorMatchExpressions> matchExpressions,
                                                                     final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerStatusCurrentMetricsObjectSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerStatusCurrentMetricsObjectSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsObjectSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsObjectSelector __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsObjectSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
