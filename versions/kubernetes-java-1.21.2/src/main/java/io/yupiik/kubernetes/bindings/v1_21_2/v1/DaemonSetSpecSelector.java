package io.yupiik.kubernetes.bindings.v1_21_2.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DaemonSetSpecSelector {
    private List<DaemonSetSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public DaemonSetSpecSelector() {
        // no-op
    }

    public DaemonSetSpecSelector(final List<DaemonSetSpecSelectorMatchExpressions> matchExpressions,
                                 final Map<String, String> matchLabels) {
        // no-op
    }

    public List<DaemonSetSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<DaemonSetSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof DaemonSetSpecSelector)) {
            return false;
        }
        final DaemonSetSpecSelector __otherCasted = (DaemonSetSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
