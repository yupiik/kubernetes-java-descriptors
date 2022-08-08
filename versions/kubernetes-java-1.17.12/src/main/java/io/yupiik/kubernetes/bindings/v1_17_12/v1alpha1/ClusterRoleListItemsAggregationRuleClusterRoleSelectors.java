package io.yupiik.kubernetes.bindings.v1_17_12.v1alpha1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ClusterRoleListItemsAggregationRuleClusterRoleSelectors {
    private List<ClusterRoleListItemsAggregationRuleClusterRoleSelectorsMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public ClusterRoleListItemsAggregationRuleClusterRoleSelectors() {
        // no-op
    }

    public ClusterRoleListItemsAggregationRuleClusterRoleSelectors(final List<ClusterRoleListItemsAggregationRuleClusterRoleSelectorsMatchExpressions> matchExpressions,
                                                                   final Map<String, String> matchLabels) {
        // no-op
    }

    public List<ClusterRoleListItemsAggregationRuleClusterRoleSelectorsMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<ClusterRoleListItemsAggregationRuleClusterRoleSelectorsMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof ClusterRoleListItemsAggregationRuleClusterRoleSelectors)) {
            return false;
        }
        final ClusterRoleListItemsAggregationRuleClusterRoleSelectors __otherCasted = (ClusterRoleListItemsAggregationRuleClusterRoleSelectors) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
