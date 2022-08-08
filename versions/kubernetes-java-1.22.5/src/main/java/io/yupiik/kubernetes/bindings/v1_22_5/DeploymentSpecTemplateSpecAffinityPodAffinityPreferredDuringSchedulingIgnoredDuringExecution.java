package io.yupiik.kubernetes.bindings.v1_22_5;

import java.util.Objects;

public class DeploymentSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution {
    private DeploymentSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm;
    private int weight;

    public DeploymentSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public DeploymentSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution(final DeploymentSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm,
                                                                                                        final int weight) {
        // no-op
    }

    public DeploymentSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm getPodAffinityTerm() {
        return podAffinityTerm;
    }

    public void setPodAffinityTerm(final DeploymentSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm podAffinityTerm) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final DeploymentSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution __otherCasted = (DeploymentSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(podAffinityTerm, __otherCasted.podAffinityTerm) &&
            Objects.equals(weight, __otherCasted.weight);
    }
}
