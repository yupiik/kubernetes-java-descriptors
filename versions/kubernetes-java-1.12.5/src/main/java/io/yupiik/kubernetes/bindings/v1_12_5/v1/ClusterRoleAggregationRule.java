package io.yupiik.kubernetes.bindings.v1_12_5.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ClusterRoleAggregationRule {
    private List<JsonValue> clusterRoleSelectors;

    public ClusterRoleAggregationRule() {
        // no-op
    }

    public ClusterRoleAggregationRule(final List<JsonValue> clusterRoleSelectors) {
        // no-op
    }

    public List<JsonValue> getClusterRoleSelectors() {
        return clusterRoleSelectors;
    }

    public void setClusterRoleSelectors(final List<JsonValue> clusterRoleSelectors) {
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
