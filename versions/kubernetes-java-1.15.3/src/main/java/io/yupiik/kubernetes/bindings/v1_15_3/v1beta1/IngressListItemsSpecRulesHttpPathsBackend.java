package io.yupiik.kubernetes.bindings.v1_15_3.v1beta1;

import java.util.Objects;

public class IngressListItemsSpecRulesHttpPathsBackend {
    private String serviceName;
    private String servicePort;

    public IngressListItemsSpecRulesHttpPathsBackend() {
        // no-op
    }

    public IngressListItemsSpecRulesHttpPathsBackend(final String serviceName,
                                                     final String servicePort) {
        // no-op
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
                serviceName,
                servicePort);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressListItemsSpecRulesHttpPathsBackend)) {
            return false;
        }
        final IngressListItemsSpecRulesHttpPathsBackend __otherCasted = (IngressListItemsSpecRulesHttpPathsBackend) __other;
        return Objects.equals(serviceName, __otherCasted.serviceName) &&
            Objects.equals(servicePort, __otherCasted.servicePort);
    }
}
