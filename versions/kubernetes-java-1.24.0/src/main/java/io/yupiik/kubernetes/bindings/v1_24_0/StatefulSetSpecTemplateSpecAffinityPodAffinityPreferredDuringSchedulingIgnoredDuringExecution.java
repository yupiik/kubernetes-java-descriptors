package io.yupiik.kubernetes.bindings.v1_24_0;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution {
    private StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm;
    private int weight;

    public StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution(final StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm,
                                                                                                         final int weight) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm getPodAffinityTerm() {
        return podAffinityTerm;
    }

    public void setPodAffinityTerm(final StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution __otherCasted = (StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(podAffinityTerm, __otherCasted.podAffinityTerm) &&
            Objects.equals(weight, __otherCasted.weight);
    }
}
