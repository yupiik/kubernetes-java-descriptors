package io.yupiik.kubernetes.bindings.v1_15_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_15_5.Validable;
import io.yupiik.kubernetes.bindings.v1_15_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PhotonPersistentDiskVolumeSource implements Validable<PhotonPersistentDiskVolumeSource>, Exportable {
    private String fsType;
    private String pdID;

    public PhotonPersistentDiskVolumeSource() {
        // no-op
    }

    public PhotonPersistentDiskVolumeSource(final String fsType,
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
        if (!(__other instanceof PhotonPersistentDiskVolumeSource)) {
            return false;
        }
        final PhotonPersistentDiskVolumeSource __otherCasted = (PhotonPersistentDiskVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(pdID, __otherCasted.pdID);
    }

    public PhotonPersistentDiskVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public PhotonPersistentDiskVolumeSource pdID(final String pdID) {
        this.pdID = pdID;
        return this;
    }

    @Override
    public PhotonPersistentDiskVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (pdID == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "pdID", "pdID",
                "Missing 'pdID' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (fsType != null ? "\"fsType\":\"" +  JsonStrings.escapeJson(fsType) + "\"" : ""),
                    (pdID != null ? "\"pdID\":\"" +  JsonStrings.escapeJson(pdID) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
