package io.yupiik.kubernetes.bindings.v1_16_6;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private List<CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms> nodeSelectorTerms;

    public CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution(final List<CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms> nodeSelectorTerms) {
        // no-op
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(final List<CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nodeSelectorTerms);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(nodeSelectorTerms, __otherCasted.nodeSelectorTerms);
    }
}
