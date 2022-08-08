package io.yupiik.kubernetes.bindings.v1_7_13.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PersistentVolumeClaimSpecSelector {
    private List<JsonValue> matchExpressions;
    private Map<String, String> matchLabels;

    public PersistentVolumeClaimSpecSelector() {
        // no-op
    }

    public PersistentVolumeClaimSpecSelector(final List<JsonValue> matchExpressions,
                                             final Map<String, String> matchLabels) {
        // no-op
    }

    public List<JsonValue> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<JsonValue> matchExpressions) {
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
        if (!(__other instanceof PersistentVolumeClaimSpecSelector)) {
            return false;
        }
        final PersistentVolumeClaimSpecSelector __otherCasted = (PersistentVolumeClaimSpecSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }
}
