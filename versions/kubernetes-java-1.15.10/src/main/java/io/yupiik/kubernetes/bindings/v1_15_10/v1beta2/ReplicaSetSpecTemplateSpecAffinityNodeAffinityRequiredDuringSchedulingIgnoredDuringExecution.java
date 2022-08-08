package io.yupiik.kubernetes.bindings.v1_15_10.v1beta2;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private List<ReplicaSetSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms> nodeSelectorTerms;

    public ReplicaSetSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution(final List<ReplicaSetSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms> nodeSelectorTerms) {
        // no-op
    }

    public List<ReplicaSetSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(final List<ReplicaSetSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nodeSelectorTerms);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (ReplicaSetSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(nodeSelectorTerms, __otherCasted.nodeSelectorTerms);
    }
}
