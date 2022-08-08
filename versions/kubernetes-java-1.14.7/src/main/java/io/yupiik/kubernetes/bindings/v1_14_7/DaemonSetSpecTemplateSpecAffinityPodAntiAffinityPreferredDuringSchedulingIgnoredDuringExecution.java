package io.yupiik.kubernetes.bindings.v1_14_7;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution {
    private DaemonSetSpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm;
    private int weight;

    public DaemonSetSpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution(final DaemonSetSpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm,
                                                                                                           final int weight) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm getPodAffinityTerm() {
        return podAffinityTerm;
    }

    public void setPodAffinityTerm(final DaemonSetSpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution __otherCasted = (DaemonSetSpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(podAffinityTerm, __otherCasted.podAffinityTerm) &&
            Objects.equals(weight, __otherCasted.weight);
    }
}
