package io.yupiik.kubernetes.bindings.v1_14_10.v1beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StatefulSetSpecVolumeClaimTemplatesSpecSelector {
    private List<StatefulSetSpecVolumeClaimTemplatesSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public StatefulSetSpecVolumeClaimTemplatesSpecSelector() {
        // no-op
    }

    public StatefulSetSpecVolumeClaimTemplatesSpecSelector(final List<StatefulSetSpecVolumeClaimTemplatesSpecSelectorMatchExpressions> matchExpressions,
                                                           final Map<String, String> matchLabels) {
        // no-op
    }

    public List<StatefulSetSpecVolumeClaimTemplatesSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<StatefulSetSpecVolumeClaimTemplatesSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof StatefulSetSpecVolumeClaimTemplatesSpecSelector)) {
            return false;
        }
        final StatefulSetSpecVolumeClaimTemplatesSpecSelector __otherCasted = (StatefulSetSpecVolumeClaimTemplatesSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
