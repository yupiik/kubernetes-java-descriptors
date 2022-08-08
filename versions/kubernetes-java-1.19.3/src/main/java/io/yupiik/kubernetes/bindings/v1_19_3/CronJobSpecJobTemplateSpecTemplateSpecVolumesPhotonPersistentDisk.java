package io.yupiik.kubernetes.bindings.v1_19_3;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesPhotonPersistentDisk {
    private String fsType;
    private String pdID;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesPhotonPersistentDisk() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesPhotonPersistentDisk(final String fsType,
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesPhotonPersistentDisk)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesPhotonPersistentDisk __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesPhotonPersistentDisk) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(pdID, __otherCasted.pdID);
    }
}
