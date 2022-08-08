package io.yupiik.kubernetes.bindings.v1_18_11.v1alpha1;

import java.util.Objects;

public class PodPresetSpecVolumesAzureFile {
    private Boolean readOnly;
    private String secretName;
    private String shareName;

    public PodPresetSpecVolumesAzureFile() {
        // no-op
    }

    public PodPresetSpecVolumesAzureFile(final Boolean readOnly,
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
        if (!(__other instanceof PodPresetSpecVolumesAzureFile)) {
            return false;
        }
        final PodPresetSpecVolumesAzureFile __otherCasted = (PodPresetSpecVolumesAzureFile) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretName, __otherCasted.secretName) &&
            Objects.equals(shareName, __otherCasted.shareName);
    }
}
