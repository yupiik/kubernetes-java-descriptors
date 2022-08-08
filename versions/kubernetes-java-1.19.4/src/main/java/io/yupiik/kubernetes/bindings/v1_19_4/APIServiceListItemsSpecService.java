package io.yupiik.kubernetes.bindings.v1_19_4;

import java.util.Objects;

public class APIServiceListItemsSpecService {
    private String name;
    private String namespace;
    private Integer port;

    public APIServiceListItemsSpecService() {
        // no-op
    }

    public APIServiceListItemsSpecService(final String name,
                                          final String namespace,
                                          final Integer port) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(final Integer port) {
        this.port = port;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                namespace,
                port);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIServiceListItemsSpecService)) {
            return false;
        }
        final APIServiceListItemsSpecService __otherCasted = (APIServiceListItemsSpecService) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(port, __otherCasted.port);
    }
}
