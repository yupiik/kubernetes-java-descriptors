package io.yupiik.kubernetes.bindings.v1_21_5.v1;

import java.util.Objects;

public class IngressListItemsSpecRulesHttpPathsBackendService {
    private String name;
    private IngressListItemsSpecRulesHttpPathsBackendServicePort port;

    public IngressListItemsSpecRulesHttpPathsBackendService() {
        // no-op
    }

    public IngressListItemsSpecRulesHttpPathsBackendService(final String name,
                                                            final IngressListItemsSpecRulesHttpPathsBackendServicePort port) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public IngressListItemsSpecRulesHttpPathsBackendServicePort getPort() {
        return port;
    }

    public void setPort(final IngressListItemsSpecRulesHttpPathsBackendServicePort port) {
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
        if (!(__other instanceof IngressListItemsSpecRulesHttpPathsBackendService)) {
            return false;
        }
        final IngressListItemsSpecRulesHttpPathsBackendService __otherCasted = (IngressListItemsSpecRulesHttpPathsBackendService) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(port, __otherCasted.port);
    }
}
