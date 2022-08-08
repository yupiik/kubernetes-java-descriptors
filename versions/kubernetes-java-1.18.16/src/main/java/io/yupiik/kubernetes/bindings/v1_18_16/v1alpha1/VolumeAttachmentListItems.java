package io.yupiik.kubernetes.bindings.v1_18_16.v1alpha1;

import java.util.Objects;

public class VolumeAttachmentListItems {
    private String apiVersion;
    private String kind;
    private VolumeAttachmentListItemsMetadata metadata;
    private VolumeAttachmentListItemsSpec spec;
    private VolumeAttachmentListItemsStatus status;

    public VolumeAttachmentListItems() {
        // no-op
    }

    public VolumeAttachmentListItems(final String apiVersion,
                                     final String kind,
                                     final VolumeAttachmentListItemsMetadata metadata,
                                     final VolumeAttachmentListItemsSpec spec,
                                     final VolumeAttachmentListItemsStatus status) {
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

    public VolumeAttachmentListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final VolumeAttachmentListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public VolumeAttachmentListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final VolumeAttachmentListItemsSpec spec) {
        this.spec = spec;
    }

    public VolumeAttachmentListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final VolumeAttachmentListItemsStatus status) {
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
        if (!(__other instanceof VolumeAttachmentListItems)) {
            return false;
        }
        final VolumeAttachmentListItems __otherCasted = (VolumeAttachmentListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
