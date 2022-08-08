package io.yupiik.kubernetes.bindings.v1_19_12.v1beta1;

import io.yupiik.kubernetes.bindings.v1_19_12.Validable;
import io.yupiik.kubernetes.bindings.v1_19_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HTTPIngressPath implements Validable<HTTPIngressPath> {
    private IngressBackend backend;
    private String path;
    private String pathType;

    public HTTPIngressPath() {
        // no-op
    }

    public HTTPIngressPath(final IngressBackend backend,
                           final String path,
                           final String pathType) {
        // no-op
    }

    public IngressBackend getBackend() {
        return backend;
    }

    public void setBackend(final IngressBackend backend) {
        this.backend = backend;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getPathType() {
        return pathType;
    }

    public void setPathType(final String pathType) {
        this.pathType = pathType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                backend,
                path,
                pathType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HTTPIngressPath)) {
            return false;
        }
        final HTTPIngressPath __otherCasted = (HTTPIngressPath) __other;
        return Objects.equals(backend, __otherCasted.backend) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(pathType, __otherCasted.pathType);
    }

    public HTTPIngressPath backend(final IngressBackend backend) {
        this.backend = backend;
        return this;
    }

    public HTTPIngressPath path(final String path) {
        this.path = path;
        return this;
    }

    public HTTPIngressPath pathType(final String pathType) {
        this.pathType = pathType;
        return this;
    }

    @Override
    public HTTPIngressPath validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (backend == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "backend", "backend",
                "Missing 'backend' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
