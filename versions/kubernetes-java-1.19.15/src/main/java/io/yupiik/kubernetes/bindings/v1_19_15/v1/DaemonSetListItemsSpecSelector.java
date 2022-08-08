package io.yupiik.kubernetes.bindings.v1_19_15.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DaemonSetListItemsSpecSelector {
    private List<DaemonSetListItemsSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public DaemonSetListItemsSpecSelector() {
        // no-op
    }

    public DaemonSetListItemsSpecSelector(final List<DaemonSetListItemsSpecSelectorMatchExpressions> matchExpressions,
                                          final Map<String, String> matchLabels) {
        // no-op
    }

    public List<DaemonSetListItemsSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<DaemonSetListItemsSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof DaemonSetListItemsSpecSelector)) {
            return false;
        }
        final DaemonSetListItemsSpecSelector __otherCasted = (DaemonSetListItemsSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
