package io.yupiik.kubernetes.bindings.v1_20_11;

import java.util.List;
import java.util.Objects;

public class ClusterRoleListItemsAggregationRule {
    private List<ClusterRoleListItemsAggregationRuleClusterRoleSelectors> clusterRoleSelectors;

    public ClusterRoleListItemsAggregationRule() {
        // no-op
    }

    public ClusterRoleListItemsAggregationRule(final List<ClusterRoleListItemsAggregationRuleClusterRoleSelectors> clusterRoleSelectors) {
        // no-op
    }

    public List<ClusterRoleListItemsAggregationRuleClusterRoleSelectors> getClusterRoleSelectors() {
        return clusterRoleSelectors;
    }

    public void setClusterRoleSelectors(final List<ClusterRoleListItemsAggregationRuleClusterRoleSelectors> clusterRoleSelectors) {
        this.clusterRoleSelectors = clusterRoleSelectors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clusterRoleSelectors);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ClusterRoleListItemsAggregationRule)) {
            return false;
        }
        final ClusterRoleListItemsAggregationRule __otherCasted = (ClusterRoleListItemsAggregationRule) __other;
        return Objects.equals(clusterRoleSelectors, __otherCasted.clusterRoleSelectors);
    }
}
