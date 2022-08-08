package io.yupiik.kubernetes.bindings.v1_18_12.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecTopologySpreadConstraintsLabelSelector {
    private List<PodTemplateListItemsTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public PodTemplateListItemsTemplateSpecTopologySpreadConstraintsLabelSelector() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecTopologySpreadConstraintsLabelSelector(final List<PodTemplateListItemsTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions,
                                                                                  final Map<String, String> matchLabels) {
        // no-op
    }

    public List<PodTemplateListItemsTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PodTemplateListItemsTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecTopologySpreadConstraintsLabelSelector)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecTopologySpreadConstraintsLabelSelector __otherCasted = (PodTemplateListItemsTemplateSpecTopologySpreadConstraintsLabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
