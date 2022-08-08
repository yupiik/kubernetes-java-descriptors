package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import io.yupiik.kubernetes.bindings.v1_23_3.Validable;
import io.yupiik.kubernetes.bindings.v1_23_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IngressServiceBackend implements Validable<IngressServiceBackend> {
    private String name;
    private ServiceBackendPort port;

    public IngressServiceBackend() {
        // no-op
    }

    public IngressServiceBackend(final String name,
                                 final ServiceBackendPort port) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ServiceBackendPort getPort() {
        return port;
    }

    public void setPort(final ServiceBackendPort port) {
        this.port = port;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                port);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressServiceBackend)) {
            return false;
        }
        final IngressServiceBackend __otherCasted = (IngressServiceBackend) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(port, __otherCasted.port);
    }

    public IngressServiceBackend name(final String name) {
        this.name = name;
        return this;
    }

    public IngressServiceBackend port(final ServiceBackendPort port) {
        this.port = port;
        return this;
    }

    @Override
    public IngressServiceBackend validate() {
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
}
