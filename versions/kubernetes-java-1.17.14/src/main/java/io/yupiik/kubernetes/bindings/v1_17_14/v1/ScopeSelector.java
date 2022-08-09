package io.yupiik.kubernetes.bindings.v1_17_14.v1;

import io.yupiik.kubernetes.bindings.v1_17_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_14.Validable;
import io.yupiik.kubernetes.bindings.v1_17_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ScopeSelector implements Validable<ScopeSelector>, Exportable {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (matchExpressions != null ? "\"matchExpressions\":" + matchExpressions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
