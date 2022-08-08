package io.yupiik.kubernetes.bindings.v1_24_0.v1;

import java.util.Objects;

public class VolumeAttachmentSpecSourceInlineVolumeSpecAzureFile {
    private Boolean readOnly;
    private String secretName;
    private String secretNamespace;
    private String shareName;

    public VolumeAttachmentSpecSourceInlineVolumeSpecAzureFile() {
        // no-op
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecAzureFile(final Boolean readOnly,
                                                               final String secretName,
                                                               final String secretNamespace,
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

    public String getSecretNamespace() {
        return secretNamespace;
    }

    public void setSecretNamespace(final String secretNamespace) {
        this.secretNamespace = secretNamespace;
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
                secretNamespace,
                shareName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentSpecSourceInlineVolumeSpecAzureFile)) {
            return false;
        }
        final VolumeAttachmentSpecSourceInlineVolumeSpecAzureFile __otherCasted = (VolumeAttachmentSpecSourceInlineVolumeSpecAzureFile) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretName, __otherCasted.secretName) &&
            Objects.equals(secretNamespace, __otherCasted.secretNamespace) &&
            Objects.equals(shareName, __otherCasted.shareName);
    }
}
