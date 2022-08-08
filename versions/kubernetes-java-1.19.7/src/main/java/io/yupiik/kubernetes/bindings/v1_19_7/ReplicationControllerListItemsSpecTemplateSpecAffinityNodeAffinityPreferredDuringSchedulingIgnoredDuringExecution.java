package io.yupiik.kubernetes.bindings.v1_19_7;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution {
    private ReplicationControllerListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference;
    private int weight;

    public ReplicationControllerListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution(final ReplicationControllerListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference,
                                                                                                                             final int weight) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference getPreference() {
        return preference;
    }

    public void setPreference(final ReplicationControllerListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(preference, __otherCasted.preference) &&
            Objects.equals(weight, __otherCasted.weight);
    }
}
