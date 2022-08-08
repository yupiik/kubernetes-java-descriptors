package io.yupiik.kubernetes.bindings.v1_19_3;

import java.util.Objects;

public class PodListItemsSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution {
    private PodListItemsSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm;
    private int weight;

    public PodListItemsSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public PodListItemsSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution(final PodListItemsSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm,
                                                                                              final int weight) {
        // no-op
    }

    public PodListItemsSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm getPodAffinityTerm() {
        return podAffinityTerm;
    }

    public void setPodAffinityTerm(final PodListItemsSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                podAffinityTerm,
                weight);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final PodListItemsSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution __otherCasted = (PodListItemsSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(podAffinityTerm, __otherCasted.podAffinityTerm) &&
            Objects.equals(weight, __otherCasted.weight);
    }
}
