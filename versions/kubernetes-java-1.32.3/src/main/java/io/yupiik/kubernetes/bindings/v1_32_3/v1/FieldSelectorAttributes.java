package io.yupiik.kubernetes.bindings.v1_32_3.v1;

import io.yupiik.kubernetes.bindings.v1_32_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_3.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class FieldSelectorAttributes implements Validable<FieldSelectorAttributes>, Exportable {
    private String rawSelector;
    private List<FieldSelectorRequirement> requirements;

    public FieldSelectorAttributes() {
        // no-op
    }

    public FieldSelectorAttributes(final String rawSelector,
                                   final List<FieldSelectorRequirement> requirements) {
        this.rawSelector = rawSelector;
        this.requirements = requirements;
    }

    public String getRawSelector() {
        return rawSelector;
    }

    public void setRawSelector(final String rawSelector) {
        this.rawSelector = rawSelector;
    }

    public List<FieldSelectorRequirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(final List<FieldSelectorRequirement> requirements) {
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
        if (!(__other instanceof FieldSelectorAttributes)) {
            return false;
        }
        final FieldSelectorAttributes __otherCasted = (FieldSelectorAttributes) __other;
        return Objects.equals(rawSelector, __otherCasted.rawSelector) &&
            Objects.equals(requirements, __otherCasted.requirements);
    }

    public FieldSelectorAttributes rawSelector(final String rawSelector) {
        this.rawSelector = rawSelector;
        return this;
    }

    public FieldSelectorAttributes requirements(final List<FieldSelectorRequirement> requirements) {
        this.requirements = requirements;
        return this;
    }

    @Override
    public FieldSelectorAttributes validate() {
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
