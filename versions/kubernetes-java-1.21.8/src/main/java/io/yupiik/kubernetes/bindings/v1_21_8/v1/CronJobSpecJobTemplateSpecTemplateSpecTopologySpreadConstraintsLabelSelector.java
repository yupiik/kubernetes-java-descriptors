package io.yupiik.kubernetes.bindings.v1_21_8.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector {
    private List<CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector(final List<CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions,
                                                                                        final Map<String, String> matchLabels) {
        // no-op
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecTopologySpreadConstraintsLabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
