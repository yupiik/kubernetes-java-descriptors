package io.yupiik.kubernetes.bindings.v1_13_3;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private List<JsonValue> nodeSelectorTerms;

    public PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution(final List<JsonValue> nodeSelectorTerms) {
        // no-op
    }

    public List<JsonValue> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(final List<JsonValue> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nodeSelectorTerms);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (PodSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(nodeSelectorTerms, __otherCasted.nodeSelectorTerms);
    }
}
