package io.yupiik.kubernetes.bindings.v1_15_3;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PodPresetListItemsSpecSelector {
    private List<PodPresetListItemsSpecSelectorMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public PodPresetListItemsSpecSelector() {
        // no-op
    }

    public PodPresetListItemsSpecSelector(final List<PodPresetListItemsSpecSelectorMatchExpressions> matchExpressions,
                                          final Map<String, String> matchLabels) {
        // no-op
    }

    public List<PodPresetListItemsSpecSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PodPresetListItemsSpecSelectorMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof PodPresetListItemsSpecSelector)) {
            return false;
        }
        final PodPresetListItemsSpecSelector __otherCasted = (PodPresetListItemsSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
