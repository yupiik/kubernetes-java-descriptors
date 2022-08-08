package io.yupiik.kubernetes.bindings.v1_11_7.v1beta1;

import io.yupiik.kubernetes.bindings.v1_11_7.Validable;
import io.yupiik.kubernetes.bindings.v1_11_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NodeSelectorTerm implements Validable<NodeSelectorTerm> {
    private List<NodeSelectorRequirement> matchExpressions;
    private List<NodeSelectorRequirement> matchFields;

    public NodeSelectorTerm() {
        // no-op
    }

    public NodeSelectorTerm(final List<NodeSelectorRequirement> matchExpressions,
                            final List<NodeSelectorRequirement> matchFields) {
        // no-op
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
}
