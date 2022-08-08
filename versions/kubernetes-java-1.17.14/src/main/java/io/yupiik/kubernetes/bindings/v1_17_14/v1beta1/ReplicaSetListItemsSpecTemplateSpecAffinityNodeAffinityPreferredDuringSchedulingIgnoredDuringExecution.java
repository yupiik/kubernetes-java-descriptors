package io.yupiik.kubernetes.bindings.v1_17_14.v1beta1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution {
    private ReplicaSetListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference;
    private int weight;

    public ReplicaSetListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution(final ReplicaSetListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference,
                                                                                                                  final int weight) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference getPreference() {
        return preference;
    }

    public void setPreference(final ReplicaSetListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution __otherCasted = (ReplicaSetListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(preference, __otherCasted.preference) &&
            Objects.equals(weight, __otherCasted.weight);
    }
}
