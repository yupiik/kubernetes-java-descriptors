package io.yupiik.kubernetes.bindings.v1_23_5;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecTopologySpreadConstraints {
    private ReplicaSetListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector;
    private int maxSkew;
    private String topologyKey;
    private ReplicaSetListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable;

    public ReplicaSetListItemsSpecTemplateSpecTopologySpreadConstraints() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecTopologySpreadConstraints(final ReplicaSetListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector,
                                                                        final int maxSkew,
                                                                        final String topologyKey,
                                                                        final ReplicaSetListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final ReplicaSetListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public int getMaxSkew() {
        return maxSkew;
    }

    public void setMaxSkew(final int maxSkew) {
        this.maxSkew = maxSkew;
    }

    public String getTopologyKey() {
        return topologyKey;
    }

    public void setTopologyKey(final String topologyKey) {
        this.topologyKey = topologyKey;
    }

    public ReplicaSetListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable getWhenUnsatisfiable() {
        return whenUnsatisfiable;
    }

    public void setWhenUnsatisfiable(final ReplicaSetListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
        this.whenUnsatisfiable = whenUnsatisfiable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                labelSelector,
                maxSkew,
                topologyKey,
                whenUnsatisfiable);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecTopologySpreadConstraints)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecTopologySpreadConstraints __otherCasted = (ReplicaSetListItemsSpecTemplateSpecTopologySpreadConstraints) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(maxSkew, __otherCasted.maxSkew) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey) &&
            Objects.equals(whenUnsatisfiable, __otherCasted.whenUnsatisfiable);
    }
}
