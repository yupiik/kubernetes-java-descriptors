package io.yupiik.kubernetes.bindings.v1_18_12;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesGlusterfs {
    private String endpoints;
    private String path;
    private Boolean readOnly;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesGlusterfs() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesGlusterfs(final String endpoints,
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesGlusterfs)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesGlusterfs __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesGlusterfs) __other;
        return Objects.equals(endpoints, __otherCasted.endpoints) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }
}
