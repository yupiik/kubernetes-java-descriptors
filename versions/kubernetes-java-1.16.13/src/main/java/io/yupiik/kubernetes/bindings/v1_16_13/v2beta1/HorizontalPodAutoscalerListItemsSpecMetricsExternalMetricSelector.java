package io.yupiik.kubernetes.bindings.v1_16_13.v2beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelector {
    private List<HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelector(final List<HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelectorMatchExpressions> matchExpressions,
                                                                             final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelector __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
