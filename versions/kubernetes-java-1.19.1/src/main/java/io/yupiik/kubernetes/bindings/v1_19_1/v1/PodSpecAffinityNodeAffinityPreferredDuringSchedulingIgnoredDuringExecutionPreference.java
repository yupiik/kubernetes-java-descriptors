package io.yupiik.kubernetes.bindings.v1_19_1.v1;

import java.util.List;
import java.util.Objects;

public class PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference {
    private List<PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> matchExpressions;
    private List<PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields> matchFields;

    public PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference() {
        // no-op
    }

    public PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference(final List<PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> matchExpressions,
                                                                                                final List<PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields> matchFields) {
        // no-op
    }

    public List<PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public List<PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields> getMatchFields() {
        return matchFields;
    }

    public void setMatchFields(final List<PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields> matchFields) {
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
        if (!(__other instanceof PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference)) {
            return false;
        }
        final PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference __otherCasted = (PodSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchFields, __otherCasted.matchFields);
    }
}
