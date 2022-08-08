package io.yupiik.kubernetes.bindings.v1_15_0.v1beta1;

import java.util.Objects;

public class IngressSpecRulesHttpPaths {
    private IngressSpecRulesHttpPathsBackend backend;
    private String path;

    public IngressSpecRulesHttpPaths() {
        // no-op
    }

    public IngressSpecRulesHttpPaths(final IngressSpecRulesHttpPathsBackend backend,
                                     final String path) {
        // no-op
    }

    public IngressSpecRulesHttpPathsBackend getBackend() {
        return backend;
    }

    public void setBackend(final IngressSpecRulesHttpPathsBackend backend) {
        this.backend = backend;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                backend,
                path);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressSpecRulesHttpPaths)) {
            return false;
        }
        final IngressSpecRulesHttpPaths __otherCasted = (IngressSpecRulesHttpPaths) __other;
        return Objects.equals(backend, __otherCasted.backend) &&
            Objects.equals(path, __otherCasted.path);
    }
}
