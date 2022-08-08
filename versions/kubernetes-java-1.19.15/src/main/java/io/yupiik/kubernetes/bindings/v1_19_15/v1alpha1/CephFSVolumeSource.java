package io.yupiik.kubernetes.bindings.v1_19_15.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_19_15.Validable;
import io.yupiik.kubernetes.bindings.v1_19_15.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CephFSVolumeSource implements Validable<CephFSVolumeSource> {
    private List<String> monitors;
    private String path;
    private Boolean readOnly;
    private String secretFile;
    private LocalObjectReference secretRef;
    private String user;

    public CephFSVolumeSource() {
        // no-op
    }

    public CephFSVolumeSource(final List<String> monitors,
                              final String path,
                              final Boolean readOnly,
                              final String secretFile,
                              final LocalObjectReference secretRef,
                              final String user) {
        // no-op
    }

    public List<String> getMonitors() {
        return monitors;
    }

    public void setMonitors(final List<String> monitors) {
        this.monitors = monitors;
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

    public String getSecretFile() {
        return secretFile;
    }

    public void setSecretFile(final String secretFile) {
        this.secretFile = secretFile;
    }

    public LocalObjectReference getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final LocalObjectReference secretRef) {
        this.secretRef = secretRef;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                monitors,
                path,
                readOnly,
                secretFile,
                secretRef,
                user);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CephFSVolumeSource)) {
            return false;
        }
        final CephFSVolumeSource __otherCasted = (CephFSVolumeSource) __other;
        return Objects.equals(monitors, __otherCasted.monitors) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretFile, __otherCasted.secretFile) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(user, __otherCasted.user);
    }

    public CephFSVolumeSource monitors(final List<String> monitors) {
        this.monitors = monitors;
        return this;
    }

    public CephFSVolumeSource path(final String path) {
        this.path = path;
        return this;
    }

    public CephFSVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public CephFSVolumeSource secretFile(final String secretFile) {
        this.secretFile = secretFile;
        return this;
    }

    public CephFSVolumeSource secretRef(final LocalObjectReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public CephFSVolumeSource user(final String user) {
        this.user = user;
        return this;
    }

    @Override
    public CephFSVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (monitors == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "monitors", "monitors",
                "Missing 'monitors' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
