package io.yupiik.kubernetes.bindings.v1_20_11;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCephfs {
    private List<String> monitors;
    private String path;
    private Boolean readOnly;
    private String secretFile;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCephfsSecretRef secretRef;
    private String user;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCephfs() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCephfs(final List<String> monitors,
                                                                        final String path,
                                                                        final Boolean readOnly,
                                                                        final String secretFile,
                                                                        final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCephfsSecretRef secretRef,
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

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCephfsSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCephfsSecretRef secretRef) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCephfs)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCephfs __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCephfs) __other;
        return Objects.equals(monitors, __otherCasted.monitors) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretFile, __otherCasted.secretFile) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(user, __otherCasted.user);
    }
}
