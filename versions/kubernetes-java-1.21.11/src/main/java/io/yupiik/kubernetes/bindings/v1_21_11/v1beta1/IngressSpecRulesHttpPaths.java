package io.yupiik.kubernetes.bindings.v1_21_11.v1beta1;

import java.util.Objects;

public class IngressSpecRulesHttpPaths {
    private IngressSpecRulesHttpPathsBackend backend;
    private String path;
    private String pathType;

    public IngressSpecRulesHttpPaths() {
        // no-op
    }

    public IngressSpecRulesHttpPaths(final IngressSpecRulesHttpPathsBackend backend,
                                     final String path,
                                     final String pathType) {
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

    public String getPathType() {
        return pathType;
    }

    public void setPathType(final String pathType) {
        this.pathType = pathType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                backend,
                path,
                pathType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressSpecRulesHttpPaths)) {
            return false;
        }
        final IngressSpecRulesHttpPaths __otherCasted = (IngressSpecRulesHttpPaths) __other;
        return Objects.equals(backend, __otherCasted.backend) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(pathType, __otherCasted.pathType);
    }
}
