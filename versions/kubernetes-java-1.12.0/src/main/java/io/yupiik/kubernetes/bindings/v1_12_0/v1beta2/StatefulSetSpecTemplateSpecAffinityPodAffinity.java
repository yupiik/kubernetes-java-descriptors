package io.yupiik.kubernetes.bindings.v1_12_0.v1beta2;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecAffinityPodAffinity {
    private List<JsonValue> preferredDuringSchedulingIgnoredDuringExecution;
    private List<JsonValue> requiredDuringSchedulingIgnoredDuringExecution;

    public StatefulSetSpecTemplateSpecAffinityPodAffinity() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecAffinityPodAffinity(final List<JsonValue> preferredDuringSchedulingIgnoredDuringExecution,
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecAffinityPodAffinity)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecAffinityPodAffinity __otherCasted = (StatefulSetSpecTemplateSpecAffinityPodAffinity) __other;
        return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, __otherCasted.preferredDuringSchedulingIgnoredDuringExecution) &&
            Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, __otherCasted.requiredDuringSchedulingIgnoredDuringExecution);
    }
}
