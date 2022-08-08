package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecTopologySpreadConstraints {
    private StatefulSetListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector;
    private int maxSkew;
    private String topologyKey;
    private StatefulSetListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable;

    public StatefulSetListItemsSpecTemplateSpecTopologySpreadConstraints() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecTopologySpreadConstraints(final StatefulSetListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector,
                                                                         final int maxSkew,
                                                                         final String topologyKey,
                                                                         final StatefulSetListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final StatefulSetListItemsSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector) {
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

    public StatefulSetListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable getWhenUnsatisfiable() {
        return whenUnsatisfiable;
    }

    public void setWhenUnsatisfiable(final StatefulSetListItemsSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecTopologySpreadConstraints)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecTopologySpreadConstraints __otherCasted = (StatefulSetListItemsSpecTemplateSpecTopologySpreadConstraints) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(maxSkew, __otherCasted.maxSkew) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey) &&
            Objects.equals(whenUnsatisfiable, __otherCasted.whenUnsatisfiable);
    }
}
