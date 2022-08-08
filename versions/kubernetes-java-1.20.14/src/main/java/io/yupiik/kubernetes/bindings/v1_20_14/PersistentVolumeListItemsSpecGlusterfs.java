package io.yupiik.kubernetes.bindings.v1_20_14;

import java.util.Objects;

public class PersistentVolumeListItemsSpecGlusterfs {
    private String endpoints;
    private String endpointsNamespace;
    private String path;
    private Boolean readOnly;

    public PersistentVolumeListItemsSpecGlusterfs() {
        // no-op
    }

    public PersistentVolumeListItemsSpecGlusterfs(final String endpoints,
                                                  final String endpointsNamespace,
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

    public String getEndpointsNamespace() {
        return endpointsNamespace;
    }

    public void setEndpointsNamespace(final String endpointsNamespace) {
        this.endpointsNamespace = endpointsNamespace;
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
                endpointsNamespace,
                path,
                readOnly);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeListItemsSpecGlusterfs)) {
            return false;
        }
        final PersistentVolumeListItemsSpecGlusterfs __otherCasted = (PersistentVolumeListItemsSpecGlusterfs) __other;
        return Objects.equals(endpoints, __otherCasted.endpoints) &&
            Objects.equals(endpointsNamespace, __otherCasted.endpointsNamespace) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }
}
