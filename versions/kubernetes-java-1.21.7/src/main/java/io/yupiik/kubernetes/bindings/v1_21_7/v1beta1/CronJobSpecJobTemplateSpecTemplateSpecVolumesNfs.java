package io.yupiik.kubernetes.bindings.v1_21_7.v1beta1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesNfs {
    private String path;
    private Boolean readOnly;
    private String server;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesNfs() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesNfs(final String path,
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesNfs)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesNfs __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesNfs) __other;
        return Objects.equals(path, __otherCasted.path) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(server, __otherCasted.server);
    }
}
