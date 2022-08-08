package io.yupiik.kubernetes.bindings.v1_19_11;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PodSpecTopologySpreadConstraintsLabelSelector {
    private List<PodSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public PodSpecTopologySpreadConstraintsLabelSelector() {
        // no-op
    }

    public PodSpecTopologySpreadConstraintsLabelSelector(final List<PodSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions,
                                                         final Map<String, String> matchLabels) {
        // no-op
    }

    public List<PodSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PodSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof PodSpecTopologySpreadConstraintsLabelSelector)) {
            return false;
        }
        final PodSpecTopologySpreadConstraintsLabelSelector __otherCasted = (PodSpecTopologySpreadConstraintsLabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
