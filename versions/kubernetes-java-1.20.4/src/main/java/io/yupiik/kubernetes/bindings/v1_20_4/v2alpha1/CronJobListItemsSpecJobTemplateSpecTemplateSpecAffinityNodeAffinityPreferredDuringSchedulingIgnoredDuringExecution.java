package io.yupiik.kubernetes.bindings.v1_20_4.v2alpha1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference;
    private int weight;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution(final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference,
                                                                                                                              final int weight) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference getPreference() {
        return preference;
    }

    public void setPreference(final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference preference) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(preference, __otherCasted.preference) &&
            Objects.equals(weight, __otherCasted.weight);
    }
}
