package io.yupiik.kubernetes.bindings.v1_17_0.v2alpha1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity {
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution,
                                                                               final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution) {
        // no-op
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                preferredDuringSchedulingIgnoredDuringExecution,
                requiredDuringSchedulingIgnoredDuringExecution);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityNodeAffinity) __other;
        return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, __otherCasted.preferredDuringSchedulingIgnoredDuringExecution) &&
            Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, __otherCasted.requiredDuringSchedulingIgnoredDuringExecution);
    }
}
