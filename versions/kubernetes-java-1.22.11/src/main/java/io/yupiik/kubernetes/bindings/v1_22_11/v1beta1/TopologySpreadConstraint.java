package io.yupiik.kubernetes.bindings.v1_22_11.v1beta1;

import io.yupiik.kubernetes.bindings.v1_22_11.Validable;
import io.yupiik.kubernetes.bindings.v1_22_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TopologySpreadConstraint implements Validable<TopologySpreadConstraint> {
    private LabelSelector labelSelector;
    private int maxSkew;
    private String topologyKey;
    private String whenUnsatisfiable;

    public TopologySpreadConstraint() {
        // no-op
    }

    public TopologySpreadConstraint(final LabelSelector labelSelector,
                                    final int maxSkew,
                                    final String topologyKey,
                                    final String whenUnsatisfiable) {
        // no-op
    }

    public LabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final LabelSelector labelSelector) {
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
        if (!(__other instanceof TopologySpreadConstraint)) {
            return false;
        }
        final TopologySpreadConstraint __otherCasted = (TopologySpreadConstraint) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(maxSkew, __otherCasted.maxSkew) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey) &&
            Objects.equals(whenUnsatisfiable, __otherCasted.whenUnsatisfiable);
    }

    public TopologySpreadConstraint labelSelector(final LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    public TopologySpreadConstraint maxSkew(final int maxSkew) {
        this.maxSkew = maxSkew;
        return this;
    }

    public TopologySpreadConstraint topologyKey(final String topologyKey) {
        this.topologyKey = topologyKey;
        return this;
    }

    public TopologySpreadConstraint whenUnsatisfiable(final String whenUnsatisfiable) {
        this.whenUnsatisfiable = whenUnsatisfiable;
        return this;
    }

    @Override
    public TopologySpreadConstraint validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (topologyKey == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "topologyKey", "topologyKey",
                "Missing 'topologyKey' attribute.", true));
        }
        if (whenUnsatisfiable == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "whenUnsatisfiable", "whenUnsatisfiable",
                "Missing 'whenUnsatisfiable' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
