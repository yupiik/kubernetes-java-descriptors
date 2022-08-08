package io.yupiik.kubernetes.bindings.v1_20_8;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector {
    private List<DaemonSetSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public DaemonSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector(final List<DaemonSetSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions,
                                                                           final Map<String, String> matchLabels) {
        // no-op
    }

    public List<DaemonSetSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<DaemonSetSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector __otherCasted = (DaemonSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
