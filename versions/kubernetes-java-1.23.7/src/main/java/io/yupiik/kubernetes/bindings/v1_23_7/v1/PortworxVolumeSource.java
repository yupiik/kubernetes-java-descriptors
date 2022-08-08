package io.yupiik.kubernetes.bindings.v1_23_7.v1;

import io.yupiik.kubernetes.bindings.v1_23_7.Validable;
import io.yupiik.kubernetes.bindings.v1_23_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PortworxVolumeSource implements Validable<PortworxVolumeSource> {
    private String fsType;
    private Boolean readOnly;
    private String volumeID;

    public PortworxVolumeSource() {
        // no-op
    }

    public PortworxVolumeSource(final String fsType,
                                final Boolean readOnly,
                                final String volumeID) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getVolumeID() {
        return volumeID;
    }

    public void setVolumeID(final String volumeID) {
        this.volumeID = volumeID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                readOnly,
                volumeID);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PortworxVolumeSource)) {
            return false;
        }
        final PortworxVolumeSource __otherCasted = (PortworxVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }

    public PortworxVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public PortworxVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public PortworxVolumeSource volumeID(final String volumeID) {
        this.volumeID = volumeID;
        return this;
    }

    @Override
    public PortworxVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (volumeID == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "volumeID", "volumeID",
                "Missing 'volumeID' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
