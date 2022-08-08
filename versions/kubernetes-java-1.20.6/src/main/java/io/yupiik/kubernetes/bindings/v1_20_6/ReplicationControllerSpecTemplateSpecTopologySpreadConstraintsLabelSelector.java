package io.yupiik.kubernetes.bindings.v1_20_6;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsLabelSelector {
    private List<ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsLabelSelector() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsLabelSelector(final List<ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions,
                                                                                       final Map<String, String> matchLabels) {
        // no-op
    }

    public List<ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsLabelSelector)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsLabelSelector __otherCasted = (ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsLabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
