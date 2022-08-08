package io.yupiik.kubernetes.bindings.v1_14_3.v1beta1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecAffinityPodAffinity {
    private List<StatefulSetListItemsSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution;
    private List<StatefulSetListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution;

    public StatefulSetListItemsSpecTemplateSpecAffinityPodAffinity() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecAffinityPodAffinity(final List<StatefulSetListItemsSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution,
                                                                   final List<StatefulSetListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution) {
        // no-op
    }

    public List<StatefulSetListItemsSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(final List<StatefulSetListItemsSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    public List<StatefulSetListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(final List<StatefulSetListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecAffinityPodAffinity)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecAffinityPodAffinity __otherCasted = (StatefulSetListItemsSpecTemplateSpecAffinityPodAffinity) __other;
        return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, __otherCasted.preferredDuringSchedulingIgnoredDuringExecution) &&
            Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, __otherCasted.requiredDuringSchedulingIgnoredDuringExecution);
    }
}
