package io.yupiik.kubernetes.bindings.v1_13_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_13_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_13_5.Validable;
import io.yupiik.kubernetes.bindings.v1_13_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TopologySelectorTerm implements Validable<TopologySelectorTerm>, Exportable {
    private List<TopologySelectorLabelRequirement> matchLabelExpressions;

    public TopologySelectorTerm() {
        // no-op
    }

    public TopologySelectorTerm(final List<TopologySelectorLabelRequirement> matchLabelExpressions) {
        // no-op
    }

    public List<TopologySelectorLabelRequirement> getMatchLabelExpressions() {
        return matchLabelExpressions;
    }

    public void setMatchLabelExpressions(final List<TopologySelectorLabelRequirement> matchLabelExpressions) {
        this.matchLabelExpressions = matchLabelExpressions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchLabelExpressions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TopologySelectorTerm)) {
            return false;
        }
        final TopologySelectorTerm __otherCasted = (TopologySelectorTerm) __other;
        return Objects.equals(matchLabelExpressions, __otherCasted.matchLabelExpressions);
    }

    public TopologySelectorTerm matchLabelExpressions(final List<TopologySelectorLabelRequirement> matchLabelExpressions) {
        this.matchLabelExpressions = matchLabelExpressions;
        return this;
    }

    @Override
    public TopologySelectorTerm validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (matchLabelExpressions != null ? "\"matchLabelExpressions\":" + matchLabelExpressions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
