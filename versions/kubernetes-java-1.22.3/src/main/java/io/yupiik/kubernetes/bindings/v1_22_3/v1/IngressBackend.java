package io.yupiik.kubernetes.bindings.v1_22_3.v1;

import io.yupiik.kubernetes.bindings.v1_22_3.Validable;
import io.yupiik.kubernetes.bindings.v1_22_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IngressBackend implements Validable<IngressBackend> {
    private TypedLocalObjectReference resource;
    private IngressServiceBackend service;

    public IngressBackend() {
        // no-op
    }

    public IngressBackend(final TypedLocalObjectReference resource,
                          final IngressServiceBackend service) {
        // no-op
    }

    public TypedLocalObjectReference getResource() {
        return resource;
    }

    public void setResource(final TypedLocalObjectReference resource) {
        this.resource = resource;
    }

    public IngressServiceBackend getService() {
        return service;
    }

    public void setService(final IngressServiceBackend service) {
        this.service = service;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                resource,
                service);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressBackend)) {
            return false;
        }
        final IngressBackend __otherCasted = (IngressBackend) __other;
        return Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(service, __otherCasted.service);
    }

    public IngressBackend resource(final TypedLocalObjectReference resource) {
        this.resource = resource;
        return this;
    }

    public IngressBackend service(final IngressServiceBackend service) {
        this.service = service;
        return this;
    }

    @Override
    public IngressBackend validate() {
        return this;
    }
}
