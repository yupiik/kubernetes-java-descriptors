package io.yupiik.kubernetes.bindings.v1_15_5.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class JobListItemsSpecSelector {
    private List<JobListItemsSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public JobListItemsSpecSelector() {
        // no-op
    }

    public JobListItemsSpecSelector(final List<JobListItemsSpecSelectorMatchExpressions> matchExpressions,
                                    final Map<String, String> matchLabels) {
        // no-op
    }

    public List<JobListItemsSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<JobListItemsSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof JobListItemsSpecSelector)) {
            return false;
        }
        final JobListItemsSpecSelector __otherCasted = (JobListItemsSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
