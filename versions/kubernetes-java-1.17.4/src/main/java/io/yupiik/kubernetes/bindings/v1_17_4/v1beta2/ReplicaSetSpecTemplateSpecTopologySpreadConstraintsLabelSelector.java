package io.yupiik.kubernetes.bindings.v1_17_4.v1beta2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector {
    private List<ReplicaSetSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public ReplicaSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector(final List<ReplicaSetSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions,
                                                                            final Map<String, String> matchLabels) {
        // no-op
    }

    public List<ReplicaSetSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<ReplicaSetSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector __otherCasted = (ReplicaSetSpecTemplateSpecTopologySpreadConstraintsLabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
