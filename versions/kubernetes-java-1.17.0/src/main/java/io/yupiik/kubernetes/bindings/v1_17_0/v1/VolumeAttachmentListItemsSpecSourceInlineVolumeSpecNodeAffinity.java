package io.yupiik.kubernetes.bindings.v1_17_0.v1;

import java.util.Objects;

public class VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinity {
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequired required;

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinity() {
        // no-op
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinity(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequired required) {
        // no-op
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequired getRequired() {
        return required;
    }

    public void setRequired(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequired required) {
        this.required = required;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                required);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinity)) {
            return false;
        }
        final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinity __otherCasted = (VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinity) __other;
        return Objects.equals(required, __otherCasted.required);
    }
}
