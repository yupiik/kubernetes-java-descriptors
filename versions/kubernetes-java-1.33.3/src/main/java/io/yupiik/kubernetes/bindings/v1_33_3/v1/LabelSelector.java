package io.yupiik.kubernetes.bindings.v1_33_3.v1;

import io.yupiik.kubernetes.bindings.v1_33_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_3.Validable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LabelSelector implements Validable<LabelSelector>, Exportable {
    private List<LabelSelectorRequirement> matchExpressions;
    private Map<String, String> matchLabels;

    public LabelSelector() {
        // no-op
    }

    public LabelSelector(final List<LabelSelectorRequirement> matchExpressions,
                         final Map<String, String> matchLabels) {
        this.matchExpressions = matchExpressions;
        this.matchLabels = matchLabels;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (matchExpressions != null ? "\"matchExpressions\":" + matchExpressions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (matchLabels != null ? "\"matchLabels\":" + matchLabels.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
