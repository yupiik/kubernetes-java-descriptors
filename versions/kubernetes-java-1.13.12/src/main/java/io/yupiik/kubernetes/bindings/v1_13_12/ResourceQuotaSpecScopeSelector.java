package io.yupiik.kubernetes.bindings.v1_13_12;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ResourceQuotaSpecScopeSelector {
    private List<JsonValue> matchExpressions;

    public ResourceQuotaSpecScopeSelector() {
        // no-op
    }

    public ResourceQuotaSpecScopeSelector(final List<JsonValue> matchExpressions) {
        // no-op
    }

    public List<JsonValue> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<JsonValue> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchExpressions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceQuotaSpecScopeSelector)) {
            return false;
        }
        final ResourceQuotaSpecScopeSelector __otherCasted = (ResourceQuotaSpecScopeSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions);
    }
}
