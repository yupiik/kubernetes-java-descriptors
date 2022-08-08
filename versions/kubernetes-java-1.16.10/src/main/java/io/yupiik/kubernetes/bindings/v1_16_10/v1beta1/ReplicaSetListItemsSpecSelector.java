package io.yupiik.kubernetes.bindings.v1_16_10.v1beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ReplicaSetListItemsSpecSelector {
    private List<ReplicaSetListItemsSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public ReplicaSetListItemsSpecSelector() {
        // no-op
    }

    public ReplicaSetListItemsSpecSelector(final List<ReplicaSetListItemsSpecSelectorMatchExpressions> matchExpressions,
                                           final Map<String, String> matchLabels) {
        // no-op
    }

    public List<ReplicaSetListItemsSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<ReplicaSetListItemsSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecSelector)) {
            return false;
        }
        final ReplicaSetListItemsSpecSelector __otherCasted = (ReplicaSetListItemsSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
