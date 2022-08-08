package io.yupiik.kubernetes.bindings.v1_21_7.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms {
    private List<CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions> matchExpressions;
    private List<CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields> matchFields;

    public CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms(final List<CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions> matchExpressions,
                                                                                                                                     final List<CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields> matchFields) {
        // no-op
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields> getMatchFields() {
        return matchFields;
    }

    public void setMatchFields(final List<CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields> matchFields) {
        this.matchFields = matchFields;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchExpressions,
                matchFields);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchFields, __otherCasted.matchFields);
    }
}
