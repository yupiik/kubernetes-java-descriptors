package io.yupiik.kubernetes.bindings.v1_20_0.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecAffinityPodAntiAffinity {
    private List<PodTemplateTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution;
    private List<PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution;

    public PodTemplateTemplateSpecAffinityPodAntiAffinity() {
        // no-op
    }

    public PodTemplateTemplateSpecAffinityPodAntiAffinity(final List<PodTemplateTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution,
                                                          final List<PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution) {
        // no-op
    }

    public List<PodTemplateTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(final List<PodTemplateTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    public List<PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(final List<PodTemplateTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution) {
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
        if (!(__other instanceof PodTemplateTemplateSpecAffinityPodAntiAffinity)) {
            return false;
        }
        final PodTemplateTemplateSpecAffinityPodAntiAffinity __otherCasted = (PodTemplateTemplateSpecAffinityPodAntiAffinity) __other;
        return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, __otherCasted.preferredDuringSchedulingIgnoredDuringExecution) &&
            Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, __otherCasted.requiredDuringSchedulingIgnoredDuringExecution);
    }
}
