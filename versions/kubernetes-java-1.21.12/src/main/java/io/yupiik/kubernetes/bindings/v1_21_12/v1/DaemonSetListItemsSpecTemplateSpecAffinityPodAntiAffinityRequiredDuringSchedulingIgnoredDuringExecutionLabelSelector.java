package io.yupiik.kubernetes.bindings.v1_21_12.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector {
    private List<DaemonSetListItemsSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public DaemonSetListItemsSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector(final List<DaemonSetListItemsSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions> matchExpressions,
                                                                                                                                final Map<String, String> matchLabels) {
        // no-op
    }

    public List<DaemonSetListItemsSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<DaemonSetListItemsSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public Map<String, String> getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(final Map<String, String> matchLabels) {
        this.matchLabels = matchLabels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchExpressions,
                matchLabels);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector __otherCasted = (DaemonSetListItemsSpecTemplateSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
