package io.yupiik.kubernetes.bindings.v1_18_18.v1beta1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraints {
    private CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector;
    private int maxSkew;
    private String topologyKey;
    private String whenUnsatisfiable;

    public CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraints() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraints(final CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector,
                                                                           final int maxSkew,
                                                                           final String topologyKey,
                                                                           final String whenUnsatisfiable) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector) {
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
                topologyKey,
                whenUnsatisfiable);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraints)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraints __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraints) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(maxSkew, __otherCasted.maxSkew) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey) &&
            Objects.equals(whenUnsatisfiable, __otherCasted.whenUnsatisfiable);
    }
}
