package io.yupiik.kubernetes.bindings.v1_15_9;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private List<JobSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms> nodeSelectorTerms;

    public JobSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public JobSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution(final List<JobSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms> nodeSelectorTerms) {
        // no-op
    }

    public List<JobSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(final List<JobSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms> nodeSelectorTerms) {
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
