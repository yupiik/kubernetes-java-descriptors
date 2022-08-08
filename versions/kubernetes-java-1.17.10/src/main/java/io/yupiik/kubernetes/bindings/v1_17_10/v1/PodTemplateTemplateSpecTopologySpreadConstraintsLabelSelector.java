package io.yupiik.kubernetes.bindings.v1_17_10.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PodTemplateTemplateSpecTopologySpreadConstraintsLabelSelector {
    private List<PodTemplateTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public PodTemplateTemplateSpecTopologySpreadConstraintsLabelSelector() {
        // no-op
    }

    public PodTemplateTemplateSpecTopologySpreadConstraintsLabelSelector(final List<PodTemplateTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions,
                                                                         final Map<String, String> matchLabels) {
        // no-op
    }

    public List<PodTemplateTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PodTemplateTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof PodTemplateTemplateSpecTopologySpreadConstraintsLabelSelector)) {
            return false;
        }
        final PodTemplateTemplateSpecTopologySpreadConstraintsLabelSelector __otherCasted = (PodTemplateTemplateSpecTopologySpreadConstraintsLabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
