package io.yupiik.kubernetes.bindings.v1_22_11.v1beta1;

import io.yupiik.kubernetes.bindings.v1_22_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_11.Validable;
import io.yupiik.kubernetes.bindings.v1_22_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class UserSubject implements Validable<UserSubject>, Exportable {
    private String name;

    public UserSubject() {
        // no-op
    }

    public UserSubject(final String name) {
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
        if (!(__other instanceof UserSubject)) {
            return false;
        }
        final UserSubject __otherCasted = (UserSubject) __other;
        return Objects.equals(name, __otherCasted.name);
    }

    public UserSubject name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserSubject validate() {
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
