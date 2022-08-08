package io.yupiik.kubernetes.bindings.v1_19_8;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesGlusterfs {
    private String endpoints;
    private String path;
    private Boolean readOnly;

    public ReplicaSetSpecTemplateSpecVolumesGlusterfs() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesGlusterfs(final String endpoints,
                                                      final String path,
                                                      final Boolean readOnly) {
        // no-op
    }

    public String getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(final String endpoints) {
        this.endpoints = endpoints;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                endpoints,
                path,
                readOnly);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesGlusterfs)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesGlusterfs __otherCasted = (ReplicaSetSpecTemplateSpecVolumesGlusterfs) __other;
        return Objects.equals(endpoints, __otherCasted.endpoints) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }
}
