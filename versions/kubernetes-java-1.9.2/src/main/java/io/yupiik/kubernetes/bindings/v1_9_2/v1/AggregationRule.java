package io.yupiik.kubernetes.bindings.v1_9_2.v1;

import io.yupiik.kubernetes.bindings.v1_9_2.Validable;
import io.yupiik.kubernetes.bindings.v1_9_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AggregationRule implements Validable<AggregationRule> {
    private List<LabelSelector> clusterRoleSelectors;

    public AggregationRule() {
        // no-op
    }

    public AggregationRule(final List<LabelSelector> clusterRoleSelectors) {
        // no-op
    }

    public List<LabelSelector> getClusterRoleSelectors() {
        return clusterRoleSelectors;
    }

    public void setClusterRoleSelectors(final List<LabelSelector> clusterRoleSelectors) {
        this.clusterRoleSelectors = clusterRoleSelectors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clusterRoleSelectors);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AggregationRule)) {
            return false;
        }
        final AggregationRule __otherCasted = (AggregationRule) __other;
        return Objects.equals(clusterRoleSelectors, __otherCasted.clusterRoleSelectors);
    }

    public AggregationRule clusterRoleSelectors(final List<LabelSelector> clusterRoleSelectors) {
        this.clusterRoleSelectors = clusterRoleSelectors;
        return this;
    }

    @Override
    public AggregationRule validate() {
        return this;
    }
}
