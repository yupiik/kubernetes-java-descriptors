package io.yupiik.kubernetes.bindings.v1_26_13.v1;

import io.yupiik.kubernetes.bindings.v1_26_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_26_13.Validable;
import io.yupiik.kubernetes.bindings.v1_26_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ForZone implements Validable<ForZone>, Exportable {
    private String name;

    public ForZone() {
        // no-op
    }

    public ForZone(final String name) {
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
        if (!(__other instanceof ForZone)) {
            return false;
        }
        final ForZone __otherCasted = (ForZone) __other;
        return Objects.equals(name, __otherCasted.name);
    }

    public ForZone name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public ForZone validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
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
