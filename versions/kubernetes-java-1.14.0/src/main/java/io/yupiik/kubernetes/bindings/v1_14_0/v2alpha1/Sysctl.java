package io.yupiik.kubernetes.bindings.v1_14_0.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_14_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_14_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_14_0.Validable;
import io.yupiik.kubernetes.bindings.v1_14_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Sysctl implements Validable<Sysctl>, Exportable {
    private String name;
    private String value;

    public Sysctl() {
        // no-op
    }

    public Sysctl(final String name,
                  final String value) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Sysctl)) {
            return false;
        }
        final Sysctl __otherCasted = (Sysctl) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value);
    }

    public Sysctl name(final String name) {
        this.name = name;
        return this;
    }

    public Sysctl value(final String value) {
        this.value = value;
        return this;
    }

    @Override
    public Sysctl validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (value == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "value", "value",
                "Missing 'value' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (value != null ? "\"value\":\"" +  JsonStrings.escapeJson(value) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
