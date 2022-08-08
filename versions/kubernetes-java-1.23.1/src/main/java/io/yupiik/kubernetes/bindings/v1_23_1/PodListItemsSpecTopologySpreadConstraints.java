package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class PodListItemsSpecTopologySpreadConstraints {
    private PodListItemsSpecTopologySpreadConstraintsLabelSelector labelSelector;
    private int maxSkew;
    private String topologyKey;
    private PodListItemsSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable;

    public PodListItemsSpecTopologySpreadConstraints() {
        // no-op
    }

    public PodListItemsSpecTopologySpreadConstraints(final PodListItemsSpecTopologySpreadConstraintsLabelSelector labelSelector,
                                                     final int maxSkew,
                                                     final String topologyKey,
                                                     final PodListItemsSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
        // no-op
    }

    public PodListItemsSpecTopologySpreadConstraintsLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final PodListItemsSpecTopologySpreadConstraintsLabelSelector labelSelector) {
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

    public PodListItemsSpecTopologySpreadConstraintsWhenUnsatisfiable getWhenUnsatisfiable() {
        return whenUnsatisfiable;
    }

    public void setWhenUnsatisfiable(final PodListItemsSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
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
        if (!(__other instanceof PodListItemsSpecTopologySpreadConstraints)) {
            return false;
        }
        final PodListItemsSpecTopologySpreadConstraints __otherCasted = (PodListItemsSpecTopologySpreadConstraints) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(maxSkew, __otherCasted.maxSkew) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey) &&
            Objects.equals(whenUnsatisfiable, __otherCasted.whenUnsatisfiable);
    }
}
