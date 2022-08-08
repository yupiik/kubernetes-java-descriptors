package io.yupiik.kubernetes.bindings.v1_14_0.v1beta2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ReplicaSetSpecSelector {
    private List<ReplicaSetSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public ReplicaSetSpecSelector() {
        // no-op
    }

    public ReplicaSetSpecSelector(final List<ReplicaSetSpecSelectorMatchExpressions> matchExpressions,
                                  final Map<String, String> matchLabels) {
        // no-op
    }

    public List<ReplicaSetSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<ReplicaSetSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof ReplicaSetSpecSelector)) {
            return false;
        }
        final ReplicaSetSpecSelector __otherCasted = (ReplicaSetSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
