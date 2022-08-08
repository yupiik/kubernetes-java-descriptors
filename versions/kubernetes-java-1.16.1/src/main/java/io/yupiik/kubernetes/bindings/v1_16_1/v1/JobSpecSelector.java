package io.yupiik.kubernetes.bindings.v1_16_1.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class JobSpecSelector {
    private List<JobSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public JobSpecSelector() {
        // no-op
    }

    public JobSpecSelector(final List<JobSpecSelectorMatchExpressions> matchExpressions,
                           final Map<String, String> matchLabels) {
        // no-op
    }

    public List<JobSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<JobSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof JobSpecSelector)) {
            return false;
        }
        final JobSpecSelector __otherCasted = (JobSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
