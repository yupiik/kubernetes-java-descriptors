package io.yupiik.kubernetes.bindings.v1_14_0.v1alpha1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ClusterRoleAggregationRuleClusterRoleSelectors {
    private List<ClusterRoleAggregationRuleClusterRoleSelectorsMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public ClusterRoleAggregationRuleClusterRoleSelectors() {
        // no-op
    }

    public ClusterRoleAggregationRuleClusterRoleSelectors(final List<ClusterRoleAggregationRuleClusterRoleSelectorsMatchExpressions> matchExpressions,
                                                          final Map<String, String> matchLabels) {
        // no-op
    }

    public List<ClusterRoleAggregationRuleClusterRoleSelectorsMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<ClusterRoleAggregationRuleClusterRoleSelectorsMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof ClusterRoleAggregationRuleClusterRoleSelectors)) {
            return false;
        }
        final ClusterRoleAggregationRuleClusterRoleSelectors __otherCasted = (ClusterRoleAggregationRuleClusterRoleSelectors) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
