package io.yupiik.kubernetes.bindings.v1_20_14.v1;

import io.yupiik.kubernetes.bindings.v1_20_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_14.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_14.Validable;
import io.yupiik.kubernetes.bindings.v1_20_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TypedLocalObjectReference implements Validable<TypedLocalObjectReference>, Exportable {
    private String apiGroup;
    private String kind;
    private String name;

    public TypedLocalObjectReference() {
        // no-op
    }

    public TypedLocalObjectReference(final String apiGroup,
                                     final String kind,
                                     final String name) {
        // no-op
    }

    public String getApiGroup() {
        return apiGroup;
    }

    public void setApiGroup(final String apiGroup) {
        this.apiGroup = apiGroup;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
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
                apiGroup,
                kind,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TypedLocalObjectReference)) {
            return false;
        }
        final TypedLocalObjectReference __otherCasted = (TypedLocalObjectReference) __other;
        return Objects.equals(apiGroup, __otherCasted.apiGroup) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name);
    }

    public TypedLocalObjectReference apiGroup(final String apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }

    public TypedLocalObjectReference kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public TypedLocalObjectReference name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public TypedLocalObjectReference validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (kind == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "kind", "kind",
                "Missing 'kind' attribute.", true));
        }
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
                    (apiGroup != null ? "\"apiGroup\":\"" +  JsonStrings.escapeJson(apiGroup) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
