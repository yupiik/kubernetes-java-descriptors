package io.yupiik.kubernetes.bindings.v1_24_1.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CSIStorageCapacityNodeTopology {
    private List<CSIStorageCapacityNodeTopologyMatchExpressions> matchExpressions;
    private Map<String, String> matchLabels;

    public CSIStorageCapacityNodeTopology() {
        // no-op
    }

    public CSIStorageCapacityNodeTopology(final List<CSIStorageCapacityNodeTopologyMatchExpressions> matchExpressions,
                                          final Map<String, String> matchLabels) {
        // no-op
    }

    public List<CSIStorageCapacityNodeTopologyMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<CSIStorageCapacityNodeTopologyMatchExpressions> matchExpressions) {
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
        if (!(__other instanceof CSIStorageCapacityNodeTopology)) {
            return false;
        }
        final CSIStorageCapacityNodeTopology __otherCasted = (CSIStorageCapacityNodeTopology) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
