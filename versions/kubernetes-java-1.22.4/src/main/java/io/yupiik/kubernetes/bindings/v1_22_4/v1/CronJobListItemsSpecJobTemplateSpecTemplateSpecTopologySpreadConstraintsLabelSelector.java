package io.yupiik.kubernetes.bindings.v1_22_4.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector {
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions,
                                                                                                 final Map<String, String> matchLabels) {
        // no-op
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
