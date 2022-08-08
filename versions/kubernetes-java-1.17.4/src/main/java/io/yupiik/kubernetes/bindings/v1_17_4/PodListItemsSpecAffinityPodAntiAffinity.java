package io.yupiik.kubernetes.bindings.v1_17_4;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecAffinityPodAntiAffinity {
    private List<PodListItemsSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution;
    private List<PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution;

    public PodListItemsSpecAffinityPodAntiAffinity() {
        // no-op
    }

    public PodListItemsSpecAffinityPodAntiAffinity(final List<PodListItemsSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution,
                                                   final List<PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution) {
        // no-op
    }

    public List<PodListItemsSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(final List<PodListItemsSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    public List<PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(final List<PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution) {
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
        if (!(__other instanceof PodListItemsSpecAffinityPodAntiAffinity)) {
            return false;
        }
        final PodListItemsSpecAffinityPodAntiAffinity __otherCasted = (PodListItemsSpecAffinityPodAntiAffinity) __other;
        return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, __otherCasted.preferredDuringSchedulingIgnoredDuringExecution) &&
            Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, __otherCasted.requiredDuringSchedulingIgnoredDuringExecution);
    }
}
