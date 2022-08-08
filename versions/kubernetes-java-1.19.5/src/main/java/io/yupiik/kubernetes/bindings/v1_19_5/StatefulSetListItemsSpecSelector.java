package io.yupiik.kubernetes.bindings.v1_19_5;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StatefulSetListItemsSpecSelector {
    private List<StatefulSetListItemsSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public StatefulSetListItemsSpecSelector() {
        // no-op
    }

    public StatefulSetListItemsSpecSelector(final List<StatefulSetListItemsSpecSelectorMatchExpressions> matchExpressions,
                                            final Map<String, String> matchLabels) {
        // no-op
    }

    public List<StatefulSetListItemsSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<StatefulSetListItemsSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof StatefulSetListItemsSpecSelector)) {
            return false;
        }
        final StatefulSetListItemsSpecSelector __otherCasted = (StatefulSetListItemsSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
