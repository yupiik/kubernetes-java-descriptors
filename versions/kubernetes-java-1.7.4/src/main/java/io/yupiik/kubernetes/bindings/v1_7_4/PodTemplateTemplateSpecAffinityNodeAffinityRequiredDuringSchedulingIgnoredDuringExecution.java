package io.yupiik.kubernetes.bindings.v1_7_4;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private List<JsonValue> nodeSelectorTerms;

    public PodTemplateTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public PodTemplateTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution(final List<JsonValue> nodeSelectorTerms) {
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
        if (!(__other instanceof PodTemplateTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final PodTemplateTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (PodTemplateTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(nodeSelectorTerms, __otherCasted.nodeSelectorTerms);
    }
}
