package io.yupiik.kubernetes.bindings.v1_15_10.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_10.Validable;
import io.yupiik.kubernetes.bindings.v1_15_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TopologySelectorTerm implements Validable<TopologySelectorTerm> {
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
}
