package io.yupiik.kubernetes.bindings.v1_21_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_4.Validable;
import io.yupiik.kubernetes.bindings.v1_21_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IngressBackend implements Validable<IngressBackend>, Exportable {
    private TypedLocalObjectReference resource;
    private String serviceName;
    private String servicePort;

    public IngressBackend() {
        // no-op
    }

    public IngressBackend(final TypedLocalObjectReference resource,
                          final String serviceName,
                          final String servicePort) {
        // no-op
    }

    public TypedLocalObjectReference getResource() {
        return resource;
    }

    public void setResource(final TypedLocalObjectReference resource) {
        this.resource = resource;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(final String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServicePort() {
        return servicePort;
    }

    public void setServicePort(final String servicePort) {
        this.servicePort = servicePort;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                resource,
                serviceName,
                servicePort);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressBackend)) {
            return false;
        }
        final IngressBackend __otherCasted = (IngressBackend) __other;
        return Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(serviceName, __otherCasted.serviceName) &&
            Objects.equals(servicePort, __otherCasted.servicePort);
    }

    public IngressBackend resource(final TypedLocalObjectReference resource) {
        this.resource = resource;
        return this;
    }

    public IngressBackend serviceName(final String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public IngressBackend servicePort(final String servicePort) {
        this.servicePort = servicePort;
        return this;
    }

    @Override
    public IngressBackend validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (resource != null ? "\"resource\":" + resource.asJson() : ""),
                    (serviceName != null ? "\"serviceName\":\"" +  JsonStrings.escapeJson(serviceName) + "\"" : ""),
                    (servicePort != null ? "\"servicePort\":\"" +  JsonStrings.escapeJson(servicePort) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
