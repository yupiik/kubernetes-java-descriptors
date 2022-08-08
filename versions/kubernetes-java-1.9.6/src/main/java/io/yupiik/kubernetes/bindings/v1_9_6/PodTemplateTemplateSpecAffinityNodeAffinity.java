package io.yupiik.kubernetes.bindings.v1_9_6;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecAffinityNodeAffinity {
    private List<JsonValue> preferredDuringSchedulingIgnoredDuringExecution;
    private PodTemplateTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution;

    public PodTemplateTemplateSpecAffinityNodeAffinity() {
        // no-op
    }

    public PodTemplateTemplateSpecAffinityNodeAffinity(final List<JsonValue> preferredDuringSchedulingIgnoredDuringExecution,
                                                       final PodTemplateTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution) {
        // no-op
    }

    public List<JsonValue> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(final List<JsonValue> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    public PodTemplateTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(final PodTemplateTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution) {
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
        if (!(__other instanceof PodTemplateTemplateSpecAffinityNodeAffinity)) {
            return false;
        }
        final PodTemplateTemplateSpecAffinityNodeAffinity __otherCasted = (PodTemplateTemplateSpecAffinityNodeAffinity) __other;
        return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, __otherCasted.preferredDuringSchedulingIgnoredDuringExecution) &&
            Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, __otherCasted.requiredDuringSchedulingIgnoredDuringExecution);
    }
}
