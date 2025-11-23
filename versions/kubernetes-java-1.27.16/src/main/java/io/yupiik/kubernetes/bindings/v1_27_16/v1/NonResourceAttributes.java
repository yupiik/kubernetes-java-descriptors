package io.yupiik.kubernetes.bindings.v1_27_16.v1;

import io.yupiik.kubernetes.bindings.v1_27_16.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_16.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_16.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NonResourceAttributes implements Validable<NonResourceAttributes>, Exportable {
    private String path;
    private String verb;

    public NonResourceAttributes() {
        // no-op
    }

    public NonResourceAttributes(final String path,
                                 final String verb) {
        this.path = path;
        this.verb = verb;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(final String verb) {
        this.verb = verb;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                path,
                verb);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NonResourceAttributes)) {
            return false;
        }
        final NonResourceAttributes __otherCasted = (NonResourceAttributes) __other;
        return Objects.equals(path, __otherCasted.path) &&
            Objects.equals(verb, __otherCasted.verb);
    }

    public NonResourceAttributes path(final String path) {
        this.path = path;
        return this;
    }

    public NonResourceAttributes verb(final String verb) {
        this.verb = verb;
        return this;
    }

    @Override
    public NonResourceAttributes validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (path != null ? "\"path\":\"" +  JsonStrings.escapeJson(path) + "\"" : ""),
                    (verb != null ? "\"verb\":\"" +  JsonStrings.escapeJson(verb) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
