package io.yupiik.kubernetes.bindings.v1_23_6;

import java.util.Objects;

public class VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinity {
    private VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequired required;

    public VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinity() {
        // no-op
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinity(final VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequired required) {
        // no-op
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequired getRequired() {
        return required;
    }

    public void setRequired(final VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequired required) {
        this.required = required;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                required);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinity)) {
            return false;
        }
        final VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinity __otherCasted = (VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinity) __other;
        return Objects.equals(required, __otherCasted.required);
    }
}
