package io.yupiik.kubernetes.bindings.v1_9_1;

import java.util.Objects;

public class PersistentVolumeSpecCsi {
    private String driver;
    private Boolean readOnly;
    private String volumeHandle;

    public PersistentVolumeSpecCsi() {
        // no-op
    }

    public PersistentVolumeSpecCsi(final String driver,
                                   final Boolean readOnly,
                                   final String volumeHandle) {
        // no-op
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(final String driver) {
        this.driver = driver;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getVolumeHandle() {
        return volumeHandle;
    }

    public void setVolumeHandle(final String volumeHandle) {
        this.volumeHandle = volumeHandle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                driver,
                readOnly,
                volumeHandle);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeSpecCsi)) {
            return false;
        }
        final PersistentVolumeSpecCsi __otherCasted = (PersistentVolumeSpecCsi) __other;
        return Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeHandle, __otherCasted.volumeHandle);
    }
}
