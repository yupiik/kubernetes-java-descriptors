package io.yupiik.kubernetes.bindings.v1_20_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_20_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_1.Validable;
import io.yupiik.kubernetes.bindings.v1_20_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class GroupSubject implements Validable<GroupSubject>, Exportable {
    private String name;

    public GroupSubject() {
        // no-op
    }

    public GroupSubject(final String name) {
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
        if (!(__other instanceof GroupSubject)) {
            return false;
        }
        final GroupSubject __otherCasted = (GroupSubject) __other;
        return Objects.equals(name, __otherCasted.name);
    }

    public GroupSubject name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public GroupSubject validate() {
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
