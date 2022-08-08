package io.yupiik.kubernetes.bindings.v1_18_19;

import java.util.Objects;

public class IngressSpecRulesHttpPathsBackend {
    private IngressSpecRulesHttpPathsBackendResource resource;
    private String serviceName;
    private String servicePort;

    public IngressSpecRulesHttpPathsBackend() {
        // no-op
    }

    public IngressSpecRulesHttpPathsBackend(final IngressSpecRulesHttpPathsBackendResource resource,
                                            final String serviceName,
                                            final String servicePort) {
        // no-op
    }

    public IngressSpecRulesHttpPathsBackendResource getResource() {
        return resource;
    }

    public void setResource(final IngressSpecRulesHttpPathsBackendResource resource) {
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
        if (!(__other instanceof IngressSpecRulesHttpPathsBackend)) {
            return false;
        }
        final IngressSpecRulesHttpPathsBackend __otherCasted = (IngressSpecRulesHttpPathsBackend) __other;
        return Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(serviceName, __otherCasted.serviceName) &&
            Objects.equals(servicePort, __otherCasted.servicePort);
    }
}
