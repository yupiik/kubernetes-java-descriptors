package io.yupiik.kubernetes.bindings.v1_18_0.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StatefulSetListItemsSpecVolumeClaimTemplatesSpecSelector {
    private List<StatefulSetListItemsSpecVolumeClaimTemplatesSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public StatefulSetListItemsSpecVolumeClaimTemplatesSpecSelector() {
        // no-op
    }

    public StatefulSetListItemsSpecVolumeClaimTemplatesSpecSelector(final List<StatefulSetListItemsSpecVolumeClaimTemplatesSpecSelectorMatchExpressions> matchExpressions,
                                                                    final Map<String, String> matchLabels) {
        // no-op
    }

    public List<StatefulSetListItemsSpecVolumeClaimTemplatesSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<StatefulSetListItemsSpecVolumeClaimTemplatesSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof StatefulSetListItemsSpecVolumeClaimTemplatesSpecSelector)) {
            return false;
        }
        final StatefulSetListItemsSpecVolumeClaimTemplatesSpecSelector __otherCasted = (StatefulSetListItemsSpecVolumeClaimTemplatesSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
