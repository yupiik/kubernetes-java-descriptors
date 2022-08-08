package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecTopologySpreadConstraints {
    private PodTemplateListItemsTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector;
    private int maxSkew;
    private String topologyKey;
    private PodTemplateListItemsTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable;

    public PodTemplateListItemsTemplateSpecTopologySpreadConstraints() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecTopologySpreadConstraints(final PodTemplateListItemsTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector,
                                                                     final int maxSkew,
                                                                     final String topologyKey,
                                                                     final PodTemplateListItemsTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecTopologySpreadConstraintsLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final PodTemplateListItemsTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector) {
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

    public PodTemplateListItemsTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable getWhenUnsatisfiable() {
        return whenUnsatisfiable;
    }

    public void setWhenUnsatisfiable(final PodTemplateListItemsTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecTopologySpreadConstraints)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecTopologySpreadConstraints __otherCasted = (PodTemplateListItemsTemplateSpecTopologySpreadConstraints) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(maxSkew, __otherCasted.maxSkew) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey) &&
            Objects.equals(whenUnsatisfiable, __otherCasted.whenUnsatisfiable);
    }
}
