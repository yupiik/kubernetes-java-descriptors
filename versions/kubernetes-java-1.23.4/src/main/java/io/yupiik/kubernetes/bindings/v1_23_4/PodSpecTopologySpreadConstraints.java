package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.Objects;

public class PodSpecTopologySpreadConstraints {
    private PodSpecTopologySpreadConstraintsLabelSelector labelSelector;
    private int maxSkew;
    private String topologyKey;
    private PodSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable;

    public PodSpecTopologySpreadConstraints() {
        // no-op
    }

    public PodSpecTopologySpreadConstraints(final PodSpecTopologySpreadConstraintsLabelSelector labelSelector,
                                            final int maxSkew,
                                            final String topologyKey,
                                            final PodSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
        // no-op
    }

    public PodSpecTopologySpreadConstraintsLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final PodSpecTopologySpreadConstraintsLabelSelector labelSelector) {
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

    public PodSpecTopologySpreadConstraintsWhenUnsatisfiable getWhenUnsatisfiable() {
        return whenUnsatisfiable;
    }

    public void setWhenUnsatisfiable(final PodSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
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
        if (!(__other instanceof PodSpecTopologySpreadConstraints)) {
            return false;
        }
        final PodSpecTopologySpreadConstraints __otherCasted = (PodSpecTopologySpreadConstraints) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(maxSkew, __otherCasted.maxSkew) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey) &&
            Objects.equals(whenUnsatisfiable, __otherCasted.whenUnsatisfiable);
    }
}
