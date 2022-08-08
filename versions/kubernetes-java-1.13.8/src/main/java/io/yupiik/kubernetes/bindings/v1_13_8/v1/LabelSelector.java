package io.yupiik.kubernetes.bindings.v1_13_8.v1;

import io.yupiik.kubernetes.bindings.v1_13_8.Validable;
import io.yupiik.kubernetes.bindings.v1_13_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class LabelSelector implements Validable<LabelSelector> {
    private List<LabelSelectorRequirement> matchExpressions;
    private Map<String, String> matchLabels;

    public LabelSelector() {
        // no-op
    }

    public LabelSelector(final List<LabelSelectorRequirement> matchExpressions,
                         final Map<String, String> matchLabels) {
        // no-op
    }

    public List<LabelSelectorRequirement> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<LabelSelectorRequirement> matchExpressions) {
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
        if (!(__other instanceof LabelSelector)) {
            return false;
        }
        final LabelSelector __otherCasted = (LabelSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchLabels, __otherCasted.matchLabels);
    }

    public LabelSelector matchExpressions(final List<LabelSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }

    public LabelSelector matchLabels(final Map<String, String> matchLabels) {
        this.matchLabels = matchLabels;
        return this;
    }

    @Override
    public LabelSelector validate() {
        return this;
    }
}
