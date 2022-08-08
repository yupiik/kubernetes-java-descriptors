package io.yupiik.kubernetes.bindings.v1_23_5;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecTopologySpreadConstraints {
    private ReplicationControllerListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector;
    private int maxSkew;
    private String topologyKey;
    private ReplicationControllerListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable;

    public ReplicationControllerListItemsSpecTemplateSpecTopologySpreadConstraints() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecTopologySpreadConstraints(final ReplicationControllerListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector,
                                                                                   final int maxSkew,
                                                                                   final String topologyKey,
                                                                                   final ReplicationControllerListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final ReplicationControllerListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector) {
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

    public ReplicationControllerListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable getWhenUnsatisfiable() {
        return whenUnsatisfiable;
    }

    public void setWhenUnsatisfiable(final ReplicationControllerListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecTopologySpreadConstraints)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecTopologySpreadConstraints __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecTopologySpreadConstraints) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(maxSkew, __otherCasted.maxSkew) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey) &&
            Objects.equals(whenUnsatisfiable, __otherCasted.whenUnsatisfiable);
    }
}
