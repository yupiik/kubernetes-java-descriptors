package io.yupiik.kubernetes.bindings.v1_22_7.v2beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsObjectSelector {
    private List<HorizontalPodAutoscalerListItemsSpecMetricsObjectSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerListItemsSpecMetricsObjectSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsObjectSelector(final List<HorizontalPodAutoscalerListItemsSpecMetricsObjectSelectorMatchExpressions> matchExpressions,
                                                                     final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerListItemsSpecMetricsObjectSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerListItemsSpecMetricsObjectSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsObjectSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsObjectSelector __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsObjectSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
