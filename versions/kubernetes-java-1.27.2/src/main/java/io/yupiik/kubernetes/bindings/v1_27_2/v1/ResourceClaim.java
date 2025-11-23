package io.yupiik.kubernetes.bindings.v1_27_2.v1;

import io.yupiik.kubernetes.bindings.v1_27_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_2.Validable;
import io.yupiik.kubernetes.bindings.v1_27_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceClaim implements Validable<ResourceClaim>, Exportable {
    private String name;

    public ResourceClaim() {
        // no-op
    }

    public ResourceClaim(final String name) {
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
        if (!(__other instanceof ResourceClaim)) {
            return false;
        }
        final ResourceClaim __otherCasted = (ResourceClaim) __other;
        return Objects.equals(name, __otherCasted.name);
    }

    public ResourceClaim name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public ResourceClaim validate() {
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
