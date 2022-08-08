package io.yupiik.kubernetes.bindings.v1_7_12.v1beta1;

import io.yupiik.kubernetes.bindings.v1_7_12.Validable;
import io.yupiik.kubernetes.bindings.v1_7_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FCVolumeSource implements Validable<FCVolumeSource> {
    private String fsType;
    private int lun;
    private Boolean readOnly;
    private List<String> targetWWNs;

    public FCVolumeSource() {
        // no-op
    }

    public FCVolumeSource(final String fsType,
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
        if (!(__other instanceof FCVolumeSource)) {
            return false;
        }
        final FCVolumeSource __otherCasted = (FCVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(lun, __otherCasted.lun) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(targetWWNs, __otherCasted.targetWWNs);
    }

    public FCVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public FCVolumeSource lun(final int lun) {
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

    @Override
    public FCVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (targetWWNs == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "targetWWNs", "targetWWNs",
                "Missing 'targetWWNs' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
