package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermNamespaceSelector {
    private List<PodTemplateListItemsTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermNamespaceSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public PodTemplateListItemsTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermNamespaceSelector() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermNamespaceSelector(final List<PodTemplateListItemsTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermNamespaceSelectorMatchExpressions> matchExpressions,
                                                                                                                                                  final Map<String, String> matchLabels) {
        // no-op
    }

    public List<PodTemplateListItemsTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermNamespaceSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PodTemplateListItemsTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermNamespaceSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermNamespaceSelector)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermNamespaceSelector __otherCasted = (PodTemplateListItemsTemplateSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermNamespaceSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
