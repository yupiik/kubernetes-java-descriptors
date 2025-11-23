package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;
import io.yupiik.kubernetes.bindings.bundlebee.JsonStrings;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IgnoredLintingRule implements Validable<IgnoredLintingRule>, Exportable {
    private String name;

    public IgnoredLintingRule() {
        // no-op
    }

    public IgnoredLintingRule(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IgnoredLintingRule)) {
            return false;
        }
        final IgnoredLintingRule __otherCasted = (IgnoredLintingRule) __other;
        return Objects.equals(name, __otherCasted.name);
    }

    public IgnoredLintingRule name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public IgnoredLintingRule validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
