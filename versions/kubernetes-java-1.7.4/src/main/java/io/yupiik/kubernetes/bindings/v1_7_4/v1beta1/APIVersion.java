package io.yupiik.kubernetes.bindings.v1_7_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_7_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_7_4.Validable;
import io.yupiik.kubernetes.bindings.v1_7_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class APIVersion implements Validable<APIVersion>, Exportable {
    private String name;

    public APIVersion() {
        // no-op
    }

    public APIVersion(final String name) {
        // no-op
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
        if (!(__other instanceof APIVersion)) {
            return false;
        }
        final APIVersion __otherCasted = (APIVersion) __other;
        return Objects.equals(name, __otherCasted.name);
    }

    public APIVersion name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public APIVersion validate() {
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
