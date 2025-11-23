package io.yupiik.kubernetes.bindings.v1_23_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_4.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LocalObjectReference implements Validable<LocalObjectReference>, Exportable {
    private String name;

    public LocalObjectReference() {
        // no-op
    }

    public LocalObjectReference(final String name) {
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
        if (!(__other instanceof LocalObjectReference)) {
            return false;
        }
        final LocalObjectReference __otherCasted = (LocalObjectReference) __other;
        return Objects.equals(name, __otherCasted.name);
    }

    public LocalObjectReference name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public LocalObjectReference validate() {
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
