package io.yupiik.kubernetes.bindings.v1_16_6.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesPhotonPersistentDisk {
    private String fsType;
    private String pdID;

    public DaemonSetSpecTemplateSpecVolumesPhotonPersistentDisk() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesPhotonPersistentDisk(final String fsType,
                                                                final String pdID) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public String getPdID() {
        return pdID;
    }

    public void setPdID(final String pdID) {
        this.pdID = pdID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                pdID);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesPhotonPersistentDisk)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesPhotonPersistentDisk __otherCasted = (DaemonSetSpecTemplateSpecVolumesPhotonPersistentDisk) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(pdID, __otherCasted.pdID);
    }
}
