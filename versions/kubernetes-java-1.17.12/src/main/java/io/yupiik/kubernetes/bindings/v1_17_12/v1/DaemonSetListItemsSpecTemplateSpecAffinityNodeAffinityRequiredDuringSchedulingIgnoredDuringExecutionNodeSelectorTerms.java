package io.yupiik.kubernetes.bindings.v1_17_12.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms {
    private List<DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions> matchExpressions;
    private List<DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields> matchFields;

    public DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms(final List<DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions> matchExpressions,
                                                                                                                                 final List<DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields> matchFields) {
        // no-op
    }

    public List<DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public List<DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields> getMatchFields() {
        return matchFields;
    }

    public void setMatchFields(final List<DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields> matchFields) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms __otherCasted = (DaemonSetListItemsSpecTemplateSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchFields, __otherCasted.matchFields);
    }
}
