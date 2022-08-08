package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraints {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector;
    private int maxSkew;
    private String topologyKey;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraints() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraints(final CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector,
                                                                                    final int maxSkew,
                                                                                    final String topologyKey,
                                                                                    final CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector) {
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

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable getWhenUnsatisfiable() {
        return whenUnsatisfiable;
    }

    public void setWhenUnsatisfiable(final CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraints)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraints __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraints) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(maxSkew, __otherCasted.maxSkew) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey) &&
            Objects.equals(whenUnsatisfiable, __otherCasted.whenUnsatisfiable);
    }
}
