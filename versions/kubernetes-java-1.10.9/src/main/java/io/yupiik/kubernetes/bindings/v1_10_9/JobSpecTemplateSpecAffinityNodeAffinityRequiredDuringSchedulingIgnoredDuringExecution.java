package io.yupiik.kubernetes.bindings.v1_10_9;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private List<JsonValue> nodeSelectorTerms;

    public JobSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public JobSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution(final List<JsonValue> nodeSelectorTerms) {
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
        if (!(__other instanceof JobSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final JobSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (JobSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(nodeSelectorTerms, __otherCasted.nodeSelectorTerms);
    }
}
