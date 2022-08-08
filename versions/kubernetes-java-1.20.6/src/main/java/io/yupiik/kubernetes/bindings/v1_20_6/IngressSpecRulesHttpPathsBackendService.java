package io.yupiik.kubernetes.bindings.v1_20_6;

import java.util.Objects;

public class IngressSpecRulesHttpPathsBackendService {
    private String name;
    private IngressSpecRulesHttpPathsBackendServicePort port;

    public IngressSpecRulesHttpPathsBackendService() {
        // no-op
    }

    public IngressSpecRulesHttpPathsBackendService(final String name,
                                                   final IngressSpecRulesHttpPathsBackendServicePort port) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public IngressSpecRulesHttpPathsBackendServicePort getPort() {
        return port;
    }

    public void setPort(final IngressSpecRulesHttpPathsBackendServicePort port) {
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
        if (!(__other instanceof IngressSpecRulesHttpPathsBackendService)) {
            return false;
        }
        final IngressSpecRulesHttpPathsBackendService __otherCasted = (IngressSpecRulesHttpPathsBackendService) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(port, __otherCasted.port);
    }
}
