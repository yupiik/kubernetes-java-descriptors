package io.yupiik.kubernetes.bindings.v1_15_12.v1beta1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution {
    private DaemonSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm;
    private int weight;

    public DaemonSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution(final DaemonSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm,
                                                                                                       final int weight) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm getPodAffinityTerm() {
        return podAffinityTerm;
    }

    public void setPodAffinityTerm(final DaemonSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution __otherCasted = (DaemonSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(podAffinityTerm, __otherCasted.podAffinityTerm) &&
            Objects.equals(weight, __otherCasted.weight);
    }
}
