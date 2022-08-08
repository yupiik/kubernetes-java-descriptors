package io.yupiik.kubernetes.bindings.v1_24_0.v1;

import java.util.Objects;

public class PodListItemsSpecTopologySpreadConstraints {
    private PodListItemsSpecTopologySpreadConstraintsLabelSelector labelSelector;
    private int maxSkew;
    private Integer minDomains;
    private String topologyKey;
    private String whenUnsatisfiable;

    public PodListItemsSpecTopologySpreadConstraints() {
        // no-op
    }

    public PodListItemsSpecTopologySpreadConstraints(final PodListItemsSpecTopologySpreadConstraintsLabelSelector labelSelector,
                                                     final int maxSkew,
                                                     final Integer minDomains,
                                                     final String topologyKey,
                                                     final String whenUnsatisfiable) {
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

    public Integer getMinDomains() {
        return minDomains;
    }

    public void setMinDomains(final Integer minDomains) {
        this.minDomains = minDomains;
    }

    public String getTopologyKey() {
        return topologyKey;
    }

    public void setTopologyKey(final String topologyKey) {
        this.topologyKey = topologyKey;
    }

    public String getWhenUnsatisfiable() {
        return whenUnsatisfiable;
    }

    public void setWhenUnsatisfiable(final String whenUnsatisfiable) {
        this.whenUnsatisfiable = whenUnsatisfiable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                labelSelector,
                maxSkew,
                minDomains,
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
            Objects.equals(minDomains, __otherCasted.minDomains) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey) &&
            Objects.equals(whenUnsatisfiable, __otherCasted.whenUnsatisfiable);
    }
}
