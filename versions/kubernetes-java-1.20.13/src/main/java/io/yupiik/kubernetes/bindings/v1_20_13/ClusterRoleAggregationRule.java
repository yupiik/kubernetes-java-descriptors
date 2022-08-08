package io.yupiik.kubernetes.bindings.v1_20_13;

import java.util.List;
import java.util.Objects;

public class ClusterRoleAggregationRule {
    private List<ClusterRoleAggregationRuleClusterRoleSelectors> clusterRoleSelectors;

    public ClusterRoleAggregationRule() {
        // no-op
    }

    public ClusterRoleAggregationRule(final List<ClusterRoleAggregationRuleClusterRoleSelectors> clusterRoleSelectors) {
        // no-op
    }

    public List<ClusterRoleAggregationRuleClusterRoleSelectors> getClusterRoleSelectors() {
        return clusterRoleSelectors;
    }

    public void setClusterRoleSelectors(final List<ClusterRoleAggregationRuleClusterRoleSelectors> clusterRoleSelectors) {
        this.clusterRoleSelectors = clusterRoleSelectors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clusterRoleSelectors);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ClusterRoleAggregationRule)) {
            return false;
        }
        final ClusterRoleAggregationRule __otherCasted = (ClusterRoleAggregationRule) __other;
        return Objects.equals(clusterRoleSelectors, __otherCasted.clusterRoleSelectors);
    }
}
