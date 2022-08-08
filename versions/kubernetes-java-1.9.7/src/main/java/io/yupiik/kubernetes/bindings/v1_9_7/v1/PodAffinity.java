package io.yupiik.kubernetes.bindings.v1_9_7.v1;

import io.yupiik.kubernetes.bindings.v1_9_7.Validable;
import io.yupiik.kubernetes.bindings.v1_9_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PodAffinity implements Validable<PodAffinity> {
    private List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution;
    private List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution;

    public PodAffinity() {
        // no-op
    }

    public PodAffinity(final List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution,
                       final List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
        // no-op
    }

    public List<WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(final List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    public List<PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(final List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
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
        if (!(__other instanceof PodAffinity)) {
            return false;
        }
        final PodAffinity __otherCasted = (PodAffinity) __other;
        return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, __otherCasted.preferredDuringSchedulingIgnoredDuringExecution) &&
            Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, __otherCasted.requiredDuringSchedulingIgnoredDuringExecution);
    }

    public PodAffinity preferredDuringSchedulingIgnoredDuringExecution(final List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    public PodAffinity requiredDuringSchedulingIgnoredDuringExecution(final List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    @Override
    public PodAffinity validate() {
        return this;
    }
}
