package io.yupiik.kubernetes.bindings.v1_20_9.v1;

import io.yupiik.kubernetes.bindings.v1_20_9.Validable;
import io.yupiik.kubernetes.bindings.v1_20_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ScopeSelector implements Validable<ScopeSelector> {
    private List<ScopedResourceSelectorRequirement> matchExpressions;

    public ScopeSelector() {
        // no-op
    }

    public ScopeSelector(final List<ScopedResourceSelectorRequirement> matchExpressions) {
        // no-op
    }

    public List<ScopedResourceSelectorRequirement> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<ScopedResourceSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchExpressions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ScopeSelector)) {
            return false;
        }
        final ScopeSelector __otherCasted = (ScopeSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions);
    }

    public ScopeSelector matchExpressions(final List<ScopedResourceSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }

    @Override
    public ScopeSelector validate() {
        return this;
    }
}
