package io.yupiik.kubernetes.bindings.v1_24_3.v1;

import java.util.Objects;

public class IngressSpecDefaultBackendService {
    private String name;
    private IngressSpecDefaultBackendServicePort port;

    public IngressSpecDefaultBackendService() {
        // no-op
    }

    public IngressSpecDefaultBackendService(final String name,
                                            final IngressSpecDefaultBackendServicePort port) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public IngressSpecDefaultBackendServicePort getPort() {
        return port;
    }

    public void setPort(final IngressSpecDefaultBackendServicePort port) {
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
        if (!(__other instanceof IngressSpecDefaultBackendService)) {
            return false;
        }
        final IngressSpecDefaultBackendService __otherCasted = (IngressSpecDefaultBackendService) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(port, __otherCasted.port);
    }
}
