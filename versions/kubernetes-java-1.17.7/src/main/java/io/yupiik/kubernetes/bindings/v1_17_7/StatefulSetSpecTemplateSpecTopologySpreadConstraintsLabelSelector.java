package io.yupiik.kubernetes.bindings.v1_17_7;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector {
    private List<StatefulSetSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public StatefulSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector(final List<StatefulSetSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions,
                                                                             final Map<String, String> matchLabels) {
        // no-op
    }

    public List<StatefulSetSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<StatefulSetSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector __otherCasted = (StatefulSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
