package io.yupiik.kubernetes.bindings.v1_18_10.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_18_10.Validable;
import io.yupiik.kubernetes.bindings.v1_18_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServiceAccountSubject implements Validable<ServiceAccountSubject> {
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
}
