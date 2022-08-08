package io.yupiik.kubernetes.bindings.v1_17_6;

import java.util.List;
import java.util.Objects;

public class StorageClassAllowedTopologies {
    private List<StorageClassAllowedTopologiesMatchLabelExpressions> matchLabelExpressions;

    public StorageClassAllowedTopologies() {
        // no-op
    }

    public StorageClassAllowedTopologies(final List<StorageClassAllowedTopologiesMatchLabelExpressions> matchLabelExpressions) {
        // no-op
    }

    public List<StorageClassAllowedTopologiesMatchLabelExpressions> getMatchLabelExpressions() {
        return matchLabelExpressions;
    }

    public void setMatchLabelExpressions(final List<StorageClassAllowedTopologiesMatchLabelExpressions> matchLabelExpressions) {
        this.matchLabelExpressions = matchLabelExpressions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchLabelExpressions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StorageClassAllowedTopologies)) {
            return false;
        }
        final StorageClassAllowedTopologies __otherCasted = (StorageClassAllowedTopologies) __other;
        return Objects.equals(matchLabelExpressions, __otherCasted.matchLabelExpressions);
    }
}
