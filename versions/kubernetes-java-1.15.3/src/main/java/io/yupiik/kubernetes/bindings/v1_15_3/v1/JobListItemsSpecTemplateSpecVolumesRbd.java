package io.yupiik.kubernetes.bindings.v1_15_3.v1;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesRbd {
    private String fsType;
    private String image;
    private String keyring;
    private List<String> monitors;
    private String pool;
    private Boolean readOnly;
    private JobListItemsSpecTemplateSpecVolumesRbdSecretRef secretRef;
    private String user;

    public JobListItemsSpecTemplateSpecVolumesRbd() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesRbd(final String fsType,
                                                  final String image,
                                                  final String keyring,
                                                  final List<String> monitors,
                                                  final String pool,
                                                  final Boolean readOnly,
                                                  final JobListItemsSpecTemplateSpecVolumesRbdSecretRef secretRef,
                                                  final String user) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public String getKeyring() {
        return keyring;
    }

    public void setKeyring(final String keyring) {
        this.keyring = keyring;
    }

    public List<String> getMonitors() {
        return monitors;
    }

    public void setMonitors(final List<String> monitors) {
        this.monitors = monitors;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(final String pool) {
        this.pool = pool;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public JobListItemsSpecTemplateSpecVolumesRbdSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final JobListItemsSpecTemplateSpecVolumesRbdSecretRef secretRef) {
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
                fsType,
                image,
                keyring,
                monitors,
                pool,
                readOnly,
                secretRef,
                user);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesRbd)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesRbd __otherCasted = (JobListItemsSpecTemplateSpecVolumesRbd) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(image, __otherCasted.image) &&
            Objects.equals(keyring, __otherCasted.keyring) &&
            Objects.equals(monitors, __otherCasted.monitors) &&
            Objects.equals(pool, __otherCasted.pool) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(user, __otherCasted.user);
    }
}
