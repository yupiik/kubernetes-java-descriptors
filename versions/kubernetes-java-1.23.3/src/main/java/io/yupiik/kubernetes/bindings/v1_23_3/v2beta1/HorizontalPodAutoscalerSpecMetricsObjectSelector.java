package io.yupiik.kubernetes.bindings.v1_23_3.v2beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsObjectSelector {
    private List<HorizontalPodAutoscalerSpecMetricsObjectSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public HorizontalPodAutoscalerSpecMetricsObjectSelector() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsObjectSelector(final List<HorizontalPodAutoscalerSpecMetricsObjectSelectorMatchExpressions> matchExpressions,
                                                            final Map<String, String> matchLabels) {
        // no-op
    }

    public List<HorizontalPodAutoscalerSpecMetricsObjectSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<HorizontalPodAutoscalerSpecMetricsObjectSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsObjectSelector)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsObjectSelector __otherCasted = (HorizontalPodAutoscalerSpecMetricsObjectSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
