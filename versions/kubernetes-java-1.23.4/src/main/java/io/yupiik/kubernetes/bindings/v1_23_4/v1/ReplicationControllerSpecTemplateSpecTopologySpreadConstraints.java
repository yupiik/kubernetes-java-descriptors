package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecTopologySpreadConstraints {
    private ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector;
    private int maxSkew;
    private String topologyKey;
    private ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable;

    public ReplicationControllerSpecTemplateSpecTopologySpreadConstraints() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecTopologySpreadConstraints(final ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector,
                                                                          final int maxSkew,
                                                                          final String topologyKey,
                                                                          final ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsLabelSelector labelSelector) {
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

    public ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable getWhenUnsatisfiable() {
        return whenUnsatisfiable;
    }

    public void setWhenUnsatisfiable(final ReplicationControllerSpecTemplateSpecTopologySpreadConstraintsWhenUnsatisfiable whenUnsatisfiable) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecTopologySpreadConstraints)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecTopologySpreadConstraints __otherCasted = (ReplicationControllerSpecTemplateSpecTopologySpreadConstraints) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(maxSkew, __otherCasted.maxSkew) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey) &&
            Objects.equals(whenUnsatisfiable, __otherCasted.whenUnsatisfiable);
    }
}
