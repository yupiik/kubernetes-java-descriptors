package io.yupiik.kubernetes.bindings.v1_9_5.v1alpha1;

import java.util.Objects;

public class VolumeAttachment {
    private String apiVersion;
    private String kind;
    private VolumeAttachmentMetadata metadata;
    private VolumeAttachmentSpec spec;
    private VolumeAttachmentStatus status;

    public VolumeAttachment() {
        // no-op
    }

    public VolumeAttachment(final String apiVersion,
                            final String kind,
                            final VolumeAttachmentMetadata metadata,
                            final VolumeAttachmentSpec spec,
                            final VolumeAttachmentStatus status) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public VolumeAttachmentMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final VolumeAttachmentMetadata metadata) {
        this.metadata = metadata;
    }

    public VolumeAttachmentSpec getSpec() {
        return spec;
    }

    public void setSpec(final VolumeAttachmentSpec spec) {
        this.spec = spec;
    }

    public VolumeAttachmentStatus getStatus() {
        return status;
    }

    public void setStatus(final VolumeAttachmentStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachment)) {
            return false;
        }
        final VolumeAttachment __otherCasted = (VolumeAttachment) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
