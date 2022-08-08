package io.yupiik.kubernetes.bindings.v1_19_12;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecSelector {
    private List<CronJobListItemsSpecJobTemplateSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public CronJobListItemsSpecJobTemplateSpecSelector() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecSelector(final List<CronJobListItemsSpecJobTemplateSpecSelectorMatchExpressions> matchExpressions,
                                                       final Map<String, String> matchLabels) {
        // no-op
    }

    public List<CronJobListItemsSpecJobTemplateSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<CronJobListItemsSpecJobTemplateSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecSelector)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecSelector __otherCasted = (CronJobListItemsSpecJobTemplateSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
