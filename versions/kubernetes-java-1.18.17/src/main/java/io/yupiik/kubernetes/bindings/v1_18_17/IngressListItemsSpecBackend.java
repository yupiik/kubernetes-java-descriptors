package io.yupiik.kubernetes.bindings.v1_18_17;

import java.util.Objects;

public class IngressListItemsSpecBackend {
    private IngressListItemsSpecBackendResource resource;
    private String serviceName;
    private String servicePort;

    public IngressListItemsSpecBackend() {
        // no-op
    }

    public IngressListItemsSpecBackend(final IngressListItemsSpecBackendResource resource,
                                       final String serviceName,
                                       final String servicePort) {
        // no-op
    }

    public IngressListItemsSpecBackendResource getResource() {
        return resource;
    }

    public void setResource(final IngressListItemsSpecBackendResource resource) {
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
        if (!(__other instanceof IngressListItemsSpecBackend)) {
            return false;
        }
        final IngressListItemsSpecBackend __otherCasted = (IngressListItemsSpecBackend) __other;
        return Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(serviceName, __otherCasted.serviceName) &&
            Objects.equals(servicePort, __otherCasted.servicePort);
    }
}
