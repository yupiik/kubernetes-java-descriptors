package io.yupiik.kubernetes.bindings.v1_9_9;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecAffinityNodeAffinity {
    private List<JsonValue> preferredDuringSchedulingIgnoredDuringExecution;
    private ReplicationControllerSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution;

    public ReplicationControllerSpecTemplateSpecAffinityNodeAffinity() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecAffinityNodeAffinity(final List<JsonValue> preferredDuringSchedulingIgnoredDuringExecution,
                                                                     final ReplicationControllerSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution) {
        // no-op
    }

    public List<JsonValue> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(final List<JsonValue> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    public ReplicationControllerSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(final ReplicationControllerSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecAffinityNodeAffinity)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecAffinityNodeAffinity __otherCasted = (ReplicationControllerSpecTemplateSpecAffinityNodeAffinity) __other;
        return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, __otherCasted.preferredDuringSchedulingIgnoredDuringExecution) &&
            Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, __otherCasted.requiredDuringSchedulingIgnoredDuringExecution);
    }
}
