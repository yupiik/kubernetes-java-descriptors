package io.yupiik.kubernetes.bindings.v1_19_1;

import java.util.Objects;

public class PersistentVolumeListItemsSpecNfs {
    private String path;
    private Boolean readOnly;
    private String server;

    public PersistentVolumeListItemsSpecNfs() {
        // no-op
    }

    public PersistentVolumeListItemsSpecNfs(final String path,
                                            final Boolean readOnly,
                                            final String server) {
        // no-op
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

    public String getServer() {
        return server;
    }

    public void setServer(final String server) {
        this.server = server;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                path,
                readOnly,
                server);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeListItemsSpecNfs)) {
            return false;
        }
        final PersistentVolumeListItemsSpecNfs __otherCasted = (PersistentVolumeListItemsSpecNfs) __other;
        return Objects.equals(path, __otherCasted.path) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(server, __otherCasted.server);
    }
}
