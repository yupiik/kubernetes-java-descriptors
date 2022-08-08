package io.yupiik.kubernetes.bindings.v1_16_12;

import java.util.Objects;

public class IngressSpecRulesHttpPathsBackend {
    private String serviceName;
    private String servicePort;

    public IngressSpecRulesHttpPathsBackend() {
        // no-op
    }

    public IngressSpecRulesHttpPathsBackend(final String serviceName,
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
        if (!(__other instanceof IngressSpecRulesHttpPathsBackend)) {
            return false;
        }
        final IngressSpecRulesHttpPathsBackend __otherCasted = (IngressSpecRulesHttpPathsBackend) __other;
        return Objects.equals(serviceName, __otherCasted.serviceName) &&
            Objects.equals(servicePort, __otherCasted.servicePort);
    }
}
