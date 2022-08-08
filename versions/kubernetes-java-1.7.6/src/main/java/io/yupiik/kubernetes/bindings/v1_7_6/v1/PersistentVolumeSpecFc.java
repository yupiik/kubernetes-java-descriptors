package io.yupiik.kubernetes.bindings.v1_7_6.v1;

import java.util.List;
import java.util.Objects;

public class PersistentVolumeSpecFc {
    private String fsType;
    private int lun;
    private Boolean readOnly;
    private List<String> targetWWNs;

    public PersistentVolumeSpecFc() {
        // no-op
    }

    public PersistentVolumeSpecFc(final String fsType,
                                  final int lun,
                                  final Boolean readOnly,
                                  final List<String> targetWWNs) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public int getLun() {
        return lun;
    }

    public void setLun(final int lun) {
        this.lun = lun;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public List<String> getTargetWWNs() {
        return targetWWNs;
    }

    public void setTargetWWNs(final List<String> targetWWNs) {
        this.targetWWNs = targetWWNs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                lun,
                readOnly,
                targetWWNs);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeSpecFc)) {
            return false;
        }
        final PersistentVolumeSpecFc __otherCasted = (PersistentVolumeSpecFc) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(lun, __otherCasted.lun) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(targetWWNs, __otherCasted.targetWWNs);
    }
}
