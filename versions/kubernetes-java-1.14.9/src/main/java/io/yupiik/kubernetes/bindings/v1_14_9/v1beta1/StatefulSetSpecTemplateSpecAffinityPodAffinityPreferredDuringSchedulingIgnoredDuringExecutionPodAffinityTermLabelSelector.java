package io.yupiik.kubernetes.bindings.v1_14_9.v1beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector {
    private List<StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector(final List<StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions> matchExpressions,
                                                                                                                                     final Map<String, String> matchLabels) {
        // no-op
    }

    public List<StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector __otherCasted = (StatefulSetSpecTemplateSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
