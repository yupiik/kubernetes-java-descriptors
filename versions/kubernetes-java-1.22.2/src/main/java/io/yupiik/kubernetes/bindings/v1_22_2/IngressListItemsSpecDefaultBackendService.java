package io.yupiik.kubernetes.bindings.v1_22_2;

import java.util.Objects;

public class IngressListItemsSpecDefaultBackendService {
    private String name;
    private IngressListItemsSpecDefaultBackendServicePort port;

    public IngressListItemsSpecDefaultBackendService() {
        // no-op
    }

    public IngressListItemsSpecDefaultBackendService(final String name,
                                                     final IngressListItemsSpecDefaultBackendServicePort port) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public IngressListItemsSpecDefaultBackendServicePort getPort() {
        return port;
    }

    public void setPort(final IngressListItemsSpecDefaultBackendServicePort port) {
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
        if (!(__other instanceof IngressListItemsSpecDefaultBackendService)) {
            return false;
        }
        final IngressListItemsSpecDefaultBackendService __otherCasted = (IngressListItemsSpecDefaultBackendService) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(port, __otherCasted.port);
    }
}
