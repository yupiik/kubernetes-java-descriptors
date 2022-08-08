package io.yupiik.kubernetes.bindings.v1_13_8;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PodSpecAffinityPodAffinity {
    private List<JsonValue> preferredDuringSchedulingIgnoredDuringExecution;
    private List<JsonValue> requiredDuringSchedulingIgnoredDuringExecution;

    public PodSpecAffinityPodAffinity() {
        // no-op
    }

    public PodSpecAffinityPodAffinity(final List<JsonValue> preferredDuringSchedulingIgnoredDuringExecution,
                                      final List<JsonValue> requiredDuringSchedulingIgnoredDuringExecution) {
        // no-op
    }

    public List<JsonValue> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(final List<JsonValue> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    public List<JsonValue> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(final List<JsonValue> requiredDuringSchedulingIgnoredDuringExecution) {
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
        if (!(__other instanceof PodSpecAffinityPodAffinity)) {
            return false;
        }
        final PodSpecAffinityPodAffinity __otherCasted = (PodSpecAffinityPodAffinity) __other;
        return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, __otherCasted.preferredDuringSchedulingIgnoredDuringExecution) &&
            Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, __otherCasted.requiredDuringSchedulingIgnoredDuringExecution);
    }
}
