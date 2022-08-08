package io.yupiik.kubernetes.bindings.v1_17_16.v1beta1;

import java.util.Objects;

public class IngressSpecBackend {
    private String serviceName;
    private String servicePort;

    public IngressSpecBackend() {
        // no-op
    }

    public IngressSpecBackend(final String serviceName,
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
        if (!(__other instanceof IngressSpecBackend)) {
            return false;
        }
        final IngressSpecBackend __otherCasted = (IngressSpecBackend) __other;
        return Objects.equals(serviceName, __otherCasted.serviceName) &&
            Objects.equals(servicePort, __otherCasted.servicePort);
    }
}
