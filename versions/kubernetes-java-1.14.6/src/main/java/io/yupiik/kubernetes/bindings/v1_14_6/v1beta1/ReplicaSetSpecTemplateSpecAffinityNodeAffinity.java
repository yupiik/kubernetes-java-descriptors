package io.yupiik.kubernetes.bindings.v1_14_6.v1beta1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecAffinityNodeAffinity {
    private List<ReplicaSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution;
    private ReplicaSetSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution;

    public ReplicaSetSpecTemplateSpecAffinityNodeAffinity() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecAffinityNodeAffinity(final List<ReplicaSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution,
                                                          final ReplicaSetSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution) {
        // no-op
    }

    public List<ReplicaSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(final List<ReplicaSetSpecTemplateSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    public ReplicaSetSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(final ReplicaSetSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecAffinityNodeAffinity)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecAffinityNodeAffinity __otherCasted = (ReplicaSetSpecTemplateSpecAffinityNodeAffinity) __other;
        return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, __otherCasted.preferredDuringSchedulingIgnoredDuringExecution) &&
            Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, __otherCasted.requiredDuringSchedulingIgnoredDuringExecution);
    }
}
