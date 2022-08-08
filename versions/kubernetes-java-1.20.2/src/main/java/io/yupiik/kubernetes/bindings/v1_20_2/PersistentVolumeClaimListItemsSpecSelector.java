package io.yupiik.kubernetes.bindings.v1_20_2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PersistentVolumeClaimListItemsSpecSelector {
    private List<PersistentVolumeClaimListItemsSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public PersistentVolumeClaimListItemsSpecSelector() {
        // no-op
    }

    public PersistentVolumeClaimListItemsSpecSelector(final List<PersistentVolumeClaimListItemsSpecSelectorMatchExpressions> matchExpressions,
                                                      final Map<String, String> matchLabels) {
        // no-op
    }

    public List<PersistentVolumeClaimListItemsSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PersistentVolumeClaimListItemsSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof PersistentVolumeClaimListItemsSpecSelector)) {
            return false;
        }
        final PersistentVolumeClaimListItemsSpecSelector __otherCasted = (PersistentVolumeClaimListItemsSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
