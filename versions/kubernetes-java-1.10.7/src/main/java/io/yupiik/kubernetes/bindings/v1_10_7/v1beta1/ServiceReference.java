package io.yupiik.kubernetes.bindings.v1_10_7.v1beta1;

import io.yupiik.kubernetes.bindings.v1_10_7.Validable;
import io.yupiik.kubernetes.bindings.v1_10_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServiceReference implements Validable<ServiceReference> {
    private String name;
    private String namespace;
    private String path;

    public ServiceReference() {
        // no-op
    }

    public ServiceReference(final String name,
                            final String namespace,
                            final String path) {
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

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                namespace,
                path);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceReference)) {
            return false;
        }
        final ServiceReference __otherCasted = (ServiceReference) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(path, __otherCasted.path);
    }

    public ServiceReference name(final String name) {
        this.name = name;
        return this;
    }

    public ServiceReference namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ServiceReference path(final String path) {
        this.path = path;
        return this;
    }

    @Override
    public ServiceReference validate() {
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
