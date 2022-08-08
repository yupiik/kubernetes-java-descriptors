package io.yupiik.kubernetes.bindings.v1_11_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_11_2.Validable;
import io.yupiik.kubernetes.bindings.v1_11_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AzureFileVolumeSource implements Validable<AzureFileVolumeSource> {
    private Boolean readOnly;
    private String secretName;
    private String shareName;

    public AzureFileVolumeSource() {
        // no-op
    }

    public AzureFileVolumeSource(final Boolean readOnly,
                                 final String secretName,
                                 final String shareName) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(final String secretName) {
        this.secretName = secretName;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(final String shareName) {
        this.shareName = shareName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                readOnly,
                secretName,
                shareName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AzureFileVolumeSource)) {
            return false;
        }
        final AzureFileVolumeSource __otherCasted = (AzureFileVolumeSource) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretName, __otherCasted.secretName) &&
            Objects.equals(shareName, __otherCasted.shareName);
    }

    public AzureFileVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public AzureFileVolumeSource secretName(final String secretName) {
        this.secretName = secretName;
        return this;
    }

    public AzureFileVolumeSource shareName(final String shareName) {
        this.shareName = shareName;
        return this;
    }

    @Override
    public AzureFileVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (secretName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "secretName", "secretName",
                "Missing 'secretName' attribute.", true));
        }
        if (shareName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "shareName", "shareName",
                "Missing 'shareName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
