package io.yupiik.kubernetes.bindings.v1_16_10.v1beta2;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesFc {
    private String fsType;
    private Integer lun;
    private Boolean readOnly;
    private List<String> targetWWNs;
    private List<String> wwids;

    public DaemonSetSpecTemplateSpecVolumesFc() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesFc(final String fsType,
                                              final Integer lun,
                                              final Boolean readOnly,
                                              final List<String> targetWWNs,
                                              final List<String> wwids) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public Integer getLun() {
        return lun;
    }

    public void setLun(final Integer lun) {
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

    public List<String> getWwids() {
        return wwids;
    }

    public void setWwids(final List<String> wwids) {
        this.wwids = wwids;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                lun,
                readOnly,
                targetWWNs,
                wwids);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesFc)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesFc __otherCasted = (DaemonSetSpecTemplateSpecVolumesFc) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(lun, __otherCasted.lun) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(targetWWNs, __otherCasted.targetWWNs) &&
            Objects.equals(wwids, __otherCasted.wwids);
    }
}
