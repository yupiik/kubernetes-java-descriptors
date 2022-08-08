package io.yupiik.kubernetes.bindings.v1_14_5.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_14_5.Validable;
import io.yupiik.kubernetes.bindings.v1_14_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersistentVolumeClaimVolumeSource implements Validable<PersistentVolumeClaimVolumeSource> {
    private String claimName;
    private Boolean readOnly;

    public PersistentVolumeClaimVolumeSource() {
        // no-op
    }

    public PersistentVolumeClaimVolumeSource(final String claimName,
                                             final Boolean readOnly) {
        // no-op
    }

    public String getClaimName() {
        return claimName;
    }

    public void setClaimName(final String claimName) {
        this.claimName = claimName;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                claimName,
                readOnly);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeClaimVolumeSource)) {
            return false;
        }
        final PersistentVolumeClaimVolumeSource __otherCasted = (PersistentVolumeClaimVolumeSource) __other;
        return Objects.equals(claimName, __otherCasted.claimName) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }

    public PersistentVolumeClaimVolumeSource claimName(final String claimName) {
        this.claimName = claimName;
        return this;
    }

    public PersistentVolumeClaimVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    @Override
    public PersistentVolumeClaimVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (claimName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "claimName", "claimName",
                "Missing 'claimName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
