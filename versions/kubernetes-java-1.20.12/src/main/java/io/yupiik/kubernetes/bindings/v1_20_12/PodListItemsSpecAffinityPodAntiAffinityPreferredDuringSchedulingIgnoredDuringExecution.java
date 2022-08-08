package io.yupiik.kubernetes.bindings.v1_20_12;

import java.util.Objects;

public class PodListItemsSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution {
    private PodListItemsSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm;
    private int weight;

    public PodListItemsSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public PodListItemsSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution(final PodListItemsSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm,
                                                                                                  final int weight) {
        // no-op
    }

    public PodListItemsSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm getPodAffinityTerm() {
        return podAffinityTerm;
    }

    public void setPodAffinityTerm(final PodListItemsSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm) {
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
        if (!(__other instanceof PodListItemsSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final PodListItemsSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution __otherCasted = (PodListItemsSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(podAffinityTerm, __otherCasted.podAffinityTerm) &&
            Objects.equals(weight, __otherCasted.weight);
    }
}
