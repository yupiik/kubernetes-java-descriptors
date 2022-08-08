package io.yupiik.kubernetes.bindings.v1_19_13.v1beta1;

import java.util.Objects;

public class IngressListItemsSpecRulesHttpPathsBackend {
    private IngressListItemsSpecRulesHttpPathsBackendResource resource;
    private String serviceName;
    private String servicePort;

    public IngressListItemsSpecRulesHttpPathsBackend() {
        // no-op
    }

    public IngressListItemsSpecRulesHttpPathsBackend(final IngressListItemsSpecRulesHttpPathsBackendResource resource,
                                                     final String serviceName,
                                                     final String servicePort) {
        // no-op
    }

    public IngressListItemsSpecRulesHttpPathsBackendResource getResource() {
        return resource;
    }

    public void setResource(final IngressListItemsSpecRulesHttpPathsBackendResource resource) {
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
        if (!(__other instanceof IngressListItemsSpecRulesHttpPathsBackend)) {
            return false;
        }
        final IngressListItemsSpecRulesHttpPathsBackend __otherCasted = (IngressListItemsSpecRulesHttpPathsBackend) __other;
        return Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(serviceName, __otherCasted.serviceName) &&
            Objects.equals(servicePort, __otherCasted.servicePort);
    }
}
