package io.yupiik.kubernetes.bindings.v1_18_18.v1beta1;

import io.yupiik.kubernetes.bindings.v1_18_18.Validable;
import io.yupiik.kubernetes.bindings.v1_18_18.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Scheduling implements Validable<Scheduling> {
    private Map<String, String> nodeSelector;
    private List<Toleration> tolerations;

    public Scheduling() {
        // no-op
    }

    public Scheduling(final Map<String, String> nodeSelector,
                      final List<Toleration> tolerations) {
        // no-op
    }

    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(final Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public List<Toleration> getTolerations() {
        return tolerations;
    }

    public void setTolerations(final List<Toleration> tolerations) {
        this.tolerations = tolerations;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nodeSelector,
                tolerations);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Scheduling)) {
            return false;
        }
        final Scheduling __otherCasted = (Scheduling) __other;
        return Objects.equals(nodeSelector, __otherCasted.nodeSelector) &&
            Objects.equals(tolerations, __otherCasted.tolerations);
    }

    public Scheduling nodeSelector(final Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    public Scheduling tolerations(final List<Toleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }

    @Override
    public Scheduling validate() {
        return this;
    }
}
