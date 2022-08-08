package io.yupiik.kubernetes.bindings.v1_18_13;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution {
    private JobListItemsSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm;
    private int weight;

    public JobListItemsSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution(final JobListItemsSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm,
                                                                                                          final int weight) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm getPodAffinityTerm() {
        return podAffinityTerm;
    }

    public void setPodAffinityTerm(final JobListItemsSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution __otherCasted = (JobListItemsSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(podAffinityTerm, __otherCasted.podAffinityTerm) &&
            Objects.equals(weight, __otherCasted.weight);
    }
}
