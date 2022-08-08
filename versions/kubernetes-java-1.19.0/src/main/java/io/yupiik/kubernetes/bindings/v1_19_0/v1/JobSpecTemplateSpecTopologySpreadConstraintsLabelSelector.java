package io.yupiik.kubernetes.bindings.v1_19_0.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class JobSpecTemplateSpecTopologySpreadConstraintsLabelSelector {
    private List<JobSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public JobSpecTemplateSpecTopologySpreadConstraintsLabelSelector() {
        // no-op
    }

    public JobSpecTemplateSpecTopologySpreadConstraintsLabelSelector(final List<JobSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions,
                                                                     final Map<String, String> matchLabels) {
        // no-op
    }

    public List<JobSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<JobSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof JobSpecTemplateSpecTopologySpreadConstraintsLabelSelector)) {
            return false;
        }
        final JobSpecTemplateSpecTopologySpreadConstraintsLabelSelector __otherCasted = (JobSpecTemplateSpecTopologySpreadConstraintsLabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
