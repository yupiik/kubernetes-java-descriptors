package io.yupiik.kubernetes.bindings.v1_21_2.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PodDisruptionBudgetListItemsSpecSelector {
    private List<PodDisruptionBudgetListItemsSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public PodDisruptionBudgetListItemsSpecSelector() {
        // no-op
    }

    public PodDisruptionBudgetListItemsSpecSelector(final List<PodDisruptionBudgetListItemsSpecSelectorMatchExpressions> matchExpressions,
                                                    final Map<String, String> matchLabels) {
        // no-op
    }

    public List<PodDisruptionBudgetListItemsSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PodDisruptionBudgetListItemsSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof PodDisruptionBudgetListItemsSpecSelector)) {
            return false;
        }
        final PodDisruptionBudgetListItemsSpecSelector __otherCasted = (PodDisruptionBudgetListItemsSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
