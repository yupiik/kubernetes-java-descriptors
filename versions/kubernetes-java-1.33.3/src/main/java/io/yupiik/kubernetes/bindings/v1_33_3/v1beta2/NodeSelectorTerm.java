package io.yupiik.kubernetes.bindings.v1_33_3.v1beta2;

import io.yupiik.kubernetes.bindings.v1_33_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_3.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeSelectorTerm implements Validable<NodeSelectorTerm>, Exportable {
    private List<NodeSelectorRequirement> matchExpressions;
    private List<NodeSelectorRequirement> matchFields;

    public NodeSelectorTerm() {
        // no-op
    }

    public NodeSelectorTerm(final List<NodeSelectorRequirement> matchExpressions,
                            final List<NodeSelectorRequirement> matchFields) {
        this.matchExpressions = matchExpressions;
        this.matchFields = matchFields;
    }

    public List<NodeSelectorRequirement> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<NodeSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public List<NodeSelectorRequirement> getMatchFields() {
        return matchFields;
    }

    public void setMatchFields(final List<NodeSelectorRequirement> matchFields) {
        this.matchFields = matchFields;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchExpressions,
                matchFields);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeSelectorTerm)) {
            return false;
        }
        final NodeSelectorTerm __otherCasted = (NodeSelectorTerm) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchFields, __otherCasted.matchFields);
    }

    public NodeSelectorTerm matchExpressions(final List<NodeSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }

    public NodeSelectorTerm matchFields(final List<NodeSelectorRequirement> matchFields) {
        this.matchFields = matchFields;
        return this;
    }

    @Override
    public NodeSelectorTerm validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (matchExpressions != null ? "\"matchExpressions\":" + matchExpressions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (matchFields != null ? "\"matchFields\":" + matchFields.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
