package io.yupiik.kubernetes.bindings.v1_16_4;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution {
    private ReplicaSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference;
    private int weight;

    public ReplicaSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution(final ReplicaSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference,
                                                                                                         final int weight) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference getPreference() {
        return preference;
    }

    public void setPreference(final ReplicaSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference) {
        this.preference = preference;
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
                preference,
                weight);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution __otherCasted = (ReplicaSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(preference, __otherCasted.preference) &&
            Objects.equals(weight, __otherCasted.weight);
    }
}
