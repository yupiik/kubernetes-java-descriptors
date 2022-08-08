package io.yupiik.kubernetes.bindings.v1_7_5;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private List<JsonValue> nodeSelectorTerms;

    public ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution(final List<JsonValue> nodeSelectorTerms) {
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
        if (!(__other instanceof ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (ScheduledJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(nodeSelectorTerms, __otherCasted.nodeSelectorTerms);
    }
}
