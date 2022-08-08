package io.yupiik.kubernetes.bindings.v1_17_8.v2beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsPodsSelector {
    private List<HorizontalPodAutoscalerListItemsSpecMetricsPodsSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerListItemsSpecMetricsPodsSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsPodsSelector(final List<HorizontalPodAutoscalerListItemsSpecMetricsPodsSelectorMatchExpressions> matchExpressions,
                                                                   final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerListItemsSpecMetricsPodsSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerListItemsSpecMetricsPodsSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsPodsSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsPodsSelector __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsPodsSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
