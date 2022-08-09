package io.yupiik.kubernetes.bindings.v1_24_0.v1beta2;

import io.yupiik.kubernetes.bindings.v1_24_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_0.Validable;
import io.yupiik.kubernetes.bindings.v1_24_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServiceAccountSubject implements Validable<ServiceAccountSubject>, Exportable {
    private String name;
    private String namespace;

    public ServiceAccountSubject() {
        // no-op
    }

    public ServiceAccountSubject(final String name,
                                 final String namespace) {
        // no-op
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
                name,
                namespace);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceAccountSubject)) {
            return false;
        }
        final ServiceAccountSubject __otherCasted = (ServiceAccountSubject) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace);
    }

    public ServiceAccountSubject name(final String name) {
        this.name = name;
        return this;
    }

    public ServiceAccountSubject namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    @Override
    public ServiceAccountSubject validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (namespace == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "namespace", "namespace",
                "Missing 'namespace' attribute.", true));
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
                    (namespace != null ? "\"namespace\":\"" +  JsonStrings.escapeJson(namespace) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
