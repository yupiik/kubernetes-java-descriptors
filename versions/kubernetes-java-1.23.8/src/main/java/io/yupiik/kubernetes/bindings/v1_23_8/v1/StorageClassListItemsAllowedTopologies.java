package io.yupiik.kubernetes.bindings.v1_23_8.v1;

import java.util.List;
import java.util.Objects;

public class StorageClassListItemsAllowedTopologies {
    private List<StorageClassListItemsAllowedTopologiesMatchLabelExpressions> matchLabelExpressions;

    public StorageClassListItemsAllowedTopologies() {
        // no-op
    }

    public StorageClassListItemsAllowedTopologies(final List<StorageClassListItemsAllowedTopologiesMatchLabelExpressions> matchLabelExpressions) {
        // no-op
    }

    public List<StorageClassListItemsAllowedTopologiesMatchLabelExpressions> getMatchLabelExpressions() {
        return matchLabelExpressions;
    }

    public void setMatchLabelExpressions(final List<StorageClassListItemsAllowedTopologiesMatchLabelExpressions> matchLabelExpressions) {
        this.matchLabelExpressions = matchLabelExpressions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchLabelExpressions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StorageClassListItemsAllowedTopologies)) {
            return false;
        }
        final StorageClassListItemsAllowedTopologies __otherCasted = (StorageClassListItemsAllowedTopologies) __other;
        return Objects.equals(matchLabelExpressions, __otherCasted.matchLabelExpressions);
    }
}
