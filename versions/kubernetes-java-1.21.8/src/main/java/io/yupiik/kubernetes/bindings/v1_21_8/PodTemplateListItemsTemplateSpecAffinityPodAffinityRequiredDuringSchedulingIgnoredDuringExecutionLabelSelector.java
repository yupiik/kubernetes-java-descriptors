package io.yupiik.kubernetes.bindings.v1_21_8;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector {
    private List<PodTemplateListItemsTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public PodTemplateListItemsTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector(final List<PodTemplateListItemsTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions> matchExpressions,
                                                                                                                          final Map<String, String> matchLabels) {
        // no-op
    }

    public List<PodTemplateListItemsTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PodTemplateListItemsTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector __otherCasted = (PodTemplateListItemsTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
