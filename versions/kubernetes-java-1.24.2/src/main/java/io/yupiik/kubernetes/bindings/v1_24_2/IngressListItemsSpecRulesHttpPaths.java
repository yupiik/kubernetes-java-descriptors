package io.yupiik.kubernetes.bindings.v1_24_2;

import java.util.Objects;

public class IngressListItemsSpecRulesHttpPaths {
    private IngressListItemsSpecRulesHttpPathsBackend backend;
    private String path;
    private String pathType;

    public IngressListItemsSpecRulesHttpPaths() {
        // no-op
    }

    public IngressListItemsSpecRulesHttpPaths(final IngressListItemsSpecRulesHttpPathsBackend backend,
                                              final String path,
                                              final String pathType) {
        // no-op
    }

    public IngressListItemsSpecRulesHttpPathsBackend getBackend() {
        return backend;
    }

    public void setBackend(final IngressListItemsSpecRulesHttpPathsBackend backend) {
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
        if (!(__other instanceof IngressListItemsSpecRulesHttpPaths)) {
            return false;
        }
        final IngressListItemsSpecRulesHttpPaths __otherCasted = (IngressListItemsSpecRulesHttpPaths) __other;
        return Objects.equals(backend, __otherCasted.backend) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(pathType, __otherCasted.pathType);
    }
}
