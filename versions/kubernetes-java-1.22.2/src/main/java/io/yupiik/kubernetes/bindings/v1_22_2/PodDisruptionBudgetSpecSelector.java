package io.yupiik.kubernetes.bindings.v1_22_2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PodDisruptionBudgetSpecSelector {
    private List<PodDisruptionBudgetSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public PodDisruptionBudgetSpecSelector() {
        // no-op
    }

    public PodDisruptionBudgetSpecSelector(final List<PodDisruptionBudgetSpecSelectorMatchExpressions> matchExpressions,
                                           final Map<String, String> matchLabels) {
        // no-op
    }

    public List<PodDisruptionBudgetSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PodDisruptionBudgetSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof PodDisruptionBudgetSpecSelector)) {
            return false;
        }
        final PodDisruptionBudgetSpecSelector __otherCasted = (PodDisruptionBudgetSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
