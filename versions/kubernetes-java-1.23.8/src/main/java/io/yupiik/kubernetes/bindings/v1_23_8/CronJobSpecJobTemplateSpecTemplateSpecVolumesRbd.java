package io.yupiik.kubernetes.bindings.v1_23_8;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesRbd {
    private String fsType;
    private String image;
    private String keyring;
    private List<String> monitors;
    private String pool;
    private Boolean readOnly;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesRbdSecretRef secretRef;
    private String user;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesRbd() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesRbd(final String fsType,
                                                            final String image,
                                                            final String keyring,
                                                            final List<String> monitors,
                                                            final String pool,
                                                            final Boolean readOnly,
                                                            final CronJobSpecJobTemplateSpecTemplateSpecVolumesRbdSecretRef secretRef,
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

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesRbdSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final CronJobSpecJobTemplateSpecTemplateSpecVolumesRbdSecretRef secretRef) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesRbd)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesRbd __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesRbd) __other;
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
