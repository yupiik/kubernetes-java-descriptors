package io.yupiik.kubernetes.bindings.v1_16_0.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_16_0.Validable;
import io.yupiik.kubernetes.bindings.v1_16_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NodeAffinity implements Validable<NodeAffinity> {
    private List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution;
    private NodeSelector requiredDuringSchedulingIgnoredDuringExecution;

    public NodeAffinity() {
        // no-op
    }

    public NodeAffinity(final List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution,
                        final NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
        // no-op
    }

    public List<PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(final List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    public NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(final NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                preferredDuringSchedulingIgnoredDuringExecution,
                requiredDuringSchedulingIgnoredDuringExecution);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeAffinity)) {
            return false;
        }
        final NodeAffinity __otherCasted = (NodeAffinity) __other;
        return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, __otherCasted.preferredDuringSchedulingIgnoredDuringExecution) &&
            Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, __otherCasted.requiredDuringSchedulingIgnoredDuringExecution);
    }

    public NodeAffinity preferredDuringSchedulingIgnoredDuringExecution(final List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    public NodeAffinity requiredDuringSchedulingIgnoredDuringExecution(final NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    @Override
    public NodeAffinity validate() {
        return this;
    }
}
