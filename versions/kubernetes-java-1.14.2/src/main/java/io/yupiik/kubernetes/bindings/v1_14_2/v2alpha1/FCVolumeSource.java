package io.yupiik.kubernetes.bindings.v1_14_2.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_14_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_14_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_14_2.Validable;
import io.yupiik.kubernetes.bindings.v1_14_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class FCVolumeSource implements Validable<FCVolumeSource>, Exportable {
    private String fsType;
    private Integer lun;
    private Boolean readOnly;
    private List<String> targetWWNs;
    private List<String> wwids;

    public FCVolumeSource() {
        // no-op
    }

    public FCVolumeSource(final String fsType,
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
        if (!(__other instanceof FCVolumeSource)) {
            return false;
        }
        final FCVolumeSource __otherCasted = (FCVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(lun, __otherCasted.lun) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(targetWWNs, __otherCasted.targetWWNs) &&
            Objects.equals(wwids, __otherCasted.wwids);
    }

    public FCVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public FCVolumeSource lun(final Integer lun) {
        this.lun = lun;
        return this;
    }

    public FCVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public FCVolumeSource targetWWNs(final List<String> targetWWNs) {
        this.targetWWNs = targetWWNs;
        return this;
    }

    public FCVolumeSource wwids(final List<String> wwids) {
        this.wwids = wwids;
        return this;
    }

    @Override
    public FCVolumeSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (fsType != null ? "\"fsType\":\"" +  JsonStrings.escapeJson(fsType) + "\"" : ""),
                    (lun != null ? "\"lun\":" + lun : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (targetWWNs != null ? "\"targetWWNs\":" + targetWWNs.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (wwids != null ? "\"wwids\":" + wwids.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
