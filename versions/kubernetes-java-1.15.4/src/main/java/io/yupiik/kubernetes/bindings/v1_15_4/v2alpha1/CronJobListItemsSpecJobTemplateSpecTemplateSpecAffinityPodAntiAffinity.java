package io.yupiik.kubernetes.bindings.v1_15_4.v2alpha1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity {
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution,
                                                                                  final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution) {
        // no-op
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAntiAffinity) __other;
        return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, __otherCasted.preferredDuringSchedulingIgnoredDuringExecution) &&
            Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, __otherCasted.requiredDuringSchedulingIgnoredDuringExecution);
    }
}
