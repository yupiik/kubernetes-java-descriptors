package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class PodTemplateTemplateSpecTopologySpreadConstraints {
    private PodTemplateTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector;
    private int maxSkew;
    private String topologyKey;
    private PodTemplateTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable;

    public PodTemplateTemplateSpecTopologySpreadConstraints() {
        // no-op
    }

    public PodTemplateTemplateSpecTopologySpreadConstraints(final PodTemplateTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector,
                                                            final int maxSkew,
                                                            final String topologyKey,
                                                            final PodTemplateTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
        // no-op
    }

    public PodTemplateTemplateSpecTopologySpreadConstraintsLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final PodTemplateTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector) {
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

    public PodTemplateTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable getWhenUnsatisfiable() {
        return whenUnsatisfiable;
    }

    public void setWhenUnsatisfiable(final PodTemplateTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
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
        if (!(__other instanceof PodTemplateTemplateSpecTopologySpreadConstraints)) {
            return false;
        }
        final PodTemplateTemplateSpecTopologySpreadConstraints __otherCasted = (PodTemplateTemplateSpecTopologySpreadConstraints) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(maxSkew, __otherCasted.maxSkew) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey) &&
            Objects.equals(whenUnsatisfiable, __otherCasted.whenUnsatisfiable);
    }
}
