package io.yupiik.kubernetes.bindings.v1_31_7.v1;

import io.yupiik.kubernetes.bindings.v1_31_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_7.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LabelSelectorAttributes implements Validable<LabelSelectorAttributes>, Exportable {
    private String rawSelector;
    private List<LabelSelectorRequirement> requirements;

    public LabelSelectorAttributes() {
        // no-op
    }

    public LabelSelectorAttributes(final String rawSelector,
                                   final List<LabelSelectorRequirement> requirements) {
        this.rawSelector = rawSelector;
        this.requirements = requirements;
    }

    public String getRawSelector() {
        return rawSelector;
    }

    public void setRawSelector(final String rawSelector) {
        this.rawSelector = rawSelector;
    }

    public List<LabelSelectorRequirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(final List<LabelSelectorRequirement> requirements) {
        this.requirements = requirements;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                rawSelector,
                requirements);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LabelSelectorAttributes)) {
            return false;
        }
        final LabelSelectorAttributes __otherCasted = (LabelSelectorAttributes) __other;
        return Objects.equals(rawSelector, __otherCasted.rawSelector) &&
            Objects.equals(requirements, __otherCasted.requirements);
    }

    public LabelSelectorAttributes rawSelector(final String rawSelector) {
        this.rawSelector = rawSelector;
        return this;
    }

    public LabelSelectorAttributes requirements(final List<LabelSelectorRequirement> requirements) {
        this.requirements = requirements;
        return this;
    }

    @Override
    public LabelSelectorAttributes validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (rawSelector != null ? "\"rawSelector\":\"" +  JsonStrings.escapeJson(rawSelector) + "\"" : ""),
                    (requirements != null ? "\"requirements\":" + requirements.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
