package io.yupiik.kubernetes.bindings.v1_22_9.v1;

import io.yupiik.kubernetes.bindings.v1_22_9.Validable;
import io.yupiik.kubernetes.bindings.v1_22_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GlusterfsPersistentVolumeSource implements Validable<GlusterfsPersistentVolumeSource> {
    private String endpoints;
    private String endpointsNamespace;
    private String path;
    private Boolean readOnly;

    public GlusterfsPersistentVolumeSource() {
        // no-op
    }

    public GlusterfsPersistentVolumeSource(final String endpoints,
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
        if (!(__other instanceof GlusterfsPersistentVolumeSource)) {
            return false;
        }
        final GlusterfsPersistentVolumeSource __otherCasted = (GlusterfsPersistentVolumeSource) __other;
        return Objects.equals(endpoints, __otherCasted.endpoints) &&
            Objects.equals(endpointsNamespace, __otherCasted.endpointsNamespace) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }

    public GlusterfsPersistentVolumeSource endpoints(final String endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public GlusterfsPersistentVolumeSource endpointsNamespace(final String endpointsNamespace) {
        this.endpointsNamespace = endpointsNamespace;
        return this;
    }

    public GlusterfsPersistentVolumeSource path(final String path) {
        this.path = path;
        return this;
    }

    public GlusterfsPersistentVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    @Override
    public GlusterfsPersistentVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (endpoints == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "endpoints", "endpoints",
                "Missing 'endpoints' attribute.", true));
        }
        if (path == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "path", "path",
                "Missing 'path' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
