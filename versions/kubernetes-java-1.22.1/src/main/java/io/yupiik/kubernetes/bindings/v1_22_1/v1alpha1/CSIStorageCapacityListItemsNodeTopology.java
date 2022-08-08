package io.yupiik.kubernetes.bindings.v1_22_1.v1alpha1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CSIStorageCapacityListItemsNodeTopology {
    private List<CSIStorageCapacityListItemsNodeTopologyMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public CSIStorageCapacityListItemsNodeTopology() {
        // no-op
    }

    public CSIStorageCapacityListItemsNodeTopology(final List<CSIStorageCapacityListItemsNodeTopologyMatchExpressions> matchExpressions,
                                                   final Map<String, String> matchLabels) {
        // no-op
    }

    public List<CSIStorageCapacityListItemsNodeTopologyMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<CSIStorageCapacityListItemsNodeTopologyMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof CSIStorageCapacityListItemsNodeTopology)) {
            return false;
        }
        final CSIStorageCapacityListItemsNodeTopology __otherCasted = (CSIStorageCapacityListItemsNodeTopology) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
