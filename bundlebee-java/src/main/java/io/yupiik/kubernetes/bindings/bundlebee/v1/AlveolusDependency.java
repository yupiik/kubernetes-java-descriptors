package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;
import io.yupiik.kubernetes.bindings.bundlebee.JsonStrings;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import io.yupiik.kubernetes.bindings.bundlebee.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AlveolusDependency implements Validable<AlveolusDependency>, Exportable {
    private Conditions includeIf;
    private String location;
    private String name;

    public AlveolusDependency() {
        // no-op
    }

    public AlveolusDependency(final Conditions includeIf,
                              final String location,
                              final String name) {
        // no-op
    }

    public Conditions getIncludeIf() {
        return includeIf;
    }

    public void setIncludeIf(final Conditions includeIf) {
        this.includeIf = includeIf;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(final String location) {
        this.location = location;
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
                includeIf,
                location,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AlveolusDependency)) {
            return false;
        }
        final AlveolusDependency __otherCasted = (AlveolusDependency) __other;
        return Objects.equals(includeIf, __otherCasted.includeIf) &&
            Objects.equals(location, __otherCasted.location) &&
            Objects.equals(name, __otherCasted.name);
    }

    public AlveolusDependency includeIf(final Conditions includeIf) {
        this.includeIf = includeIf;
        return this;
    }

    public AlveolusDependency location(final String location) {
        this.location = location;
        return this;
    }

    public AlveolusDependency name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public AlveolusDependency validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (includeIf != null ? "\"includeIf\":" + includeIf.asJson() : ""),
                    (location != null ? "\"location\":\"" +  JsonStrings.escapeJson(location) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
