package io.yupiik.kubernetes.bindings.v1_11_7.v1;

import io.yupiik.kubernetes.bindings.v1_11_7.Validable;
import io.yupiik.kubernetes.bindings.v1_11_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Subject implements Validable<Subject> {
    private String apiGroup;
    private String kind;
    private String name;
    private String namespace;

    public Subject() {
        // no-op
    }

    public Subject(final String apiGroup,
                   final String kind,
                   final String name,
                   final String namespace) {
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

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiGroup,
                kind,
                name,
                namespace);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Subject)) {
            return false;
        }
        final Subject __otherCasted = (Subject) __other;
        return Objects.equals(apiGroup, __otherCasted.apiGroup) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace);
    }

    public Subject apiGroup(final String apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }

    public Subject kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Subject name(final String name) {
        this.name = name;
        return this;
    }

    public Subject namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    @Override
    public Subject validate() {
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
}
