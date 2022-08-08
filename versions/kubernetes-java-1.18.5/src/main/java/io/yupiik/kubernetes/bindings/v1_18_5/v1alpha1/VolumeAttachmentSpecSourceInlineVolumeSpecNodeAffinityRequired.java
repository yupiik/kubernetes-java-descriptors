package io.yupiik.kubernetes.bindings.v1_18_5.v1alpha1;

import java.util.List;
import java.util.Objects;

public class VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequired {
    private List<VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms> nodeSelectorTerms;

    public VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequired() {
        // no-op
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequired(final List<VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms> nodeSelectorTerms) {
        // no-op
    }

    public List<VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(final List<VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nodeSelectorTerms);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequired)) {
            return false;
        }
        final VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequired __otherCasted = (VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequired) __other;
        return Objects.equals(nodeSelectorTerms, __otherCasted.nodeSelectorTerms);
    }
}
