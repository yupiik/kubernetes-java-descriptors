package io.yupiik.kubernetes.bindings.v1_18_20.v1;

import java.util.Objects;

public class PodListItemsSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution {
    private PodListItemsSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference;
    private int weight;

    public PodListItemsSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public PodListItemsSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution(final PodListItemsSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference,
                                                                                               final int weight) {
        // no-op
    }

    public PodListItemsSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference getPreference() {
        return preference;
    }

    public void setPreference(final PodListItemsSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference) {
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
        if (!(__other instanceof PodListItemsSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final PodListItemsSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution __otherCasted = (PodListItemsSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(preference, __otherCasted.preference) &&
            Objects.equals(weight, __otherCasted.weight);
    }
}
