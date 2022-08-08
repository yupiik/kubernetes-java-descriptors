package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecTopologySpreadConstraints {
    private DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector;
    private int maxSkew;
    private String topologyKey;
    private DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable;

    public DeploymentListItemsSpecTemplateSpecTopologySpreadConstraints() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecTopologySpreadConstraints(final DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector,
                                                                        final int maxSkew,
                                                                        final String topologyKey,
                                                                        final DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector) {
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

    public DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable getWhenUnsatisfiable() {
        return whenUnsatisfiable;
    }

    public void setWhenUnsatisfiable(final DeploymentListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecTopologySpreadConstraints)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecTopologySpreadConstraints __otherCasted = (DeploymentListItemsSpecTemplateSpecTopologySpreadConstraints) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(maxSkew, __otherCasted.maxSkew) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey) &&
            Objects.equals(whenUnsatisfiable, __otherCasted.whenUnsatisfiable);
    }
}
