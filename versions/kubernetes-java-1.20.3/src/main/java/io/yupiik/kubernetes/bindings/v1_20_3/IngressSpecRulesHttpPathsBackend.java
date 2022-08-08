package io.yupiik.kubernetes.bindings.v1_20_3;

import java.util.Objects;

public class IngressSpecRulesHttpPathsBackend {
    private IngressSpecRulesHttpPathsBackendResource resource;
    private IngressSpecRulesHttpPathsBackendService service;

    public IngressSpecRulesHttpPathsBackend() {
        // no-op
    }

    public IngressSpecRulesHttpPathsBackend(final IngressSpecRulesHttpPathsBackendResource resource,
                                            final IngressSpecRulesHttpPathsBackendService service) {
        // no-op
    }

    public IngressSpecRulesHttpPathsBackendResource getResource() {
        return resource;
    }

    public void setResource(final IngressSpecRulesHttpPathsBackendResource resource) {
        this.resource = resource;
    }

    public IngressSpecRulesHttpPathsBackendService getService() {
        return service;
    }

    public void setService(final IngressSpecRulesHttpPathsBackendService service) {
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
        if (!(__other instanceof IngressSpecRulesHttpPathsBackend)) {
            return false;
        }
        final IngressSpecRulesHttpPathsBackend __otherCasted = (IngressSpecRulesHttpPathsBackend) __other;
        return Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(service, __otherCasted.service);
    }
}
