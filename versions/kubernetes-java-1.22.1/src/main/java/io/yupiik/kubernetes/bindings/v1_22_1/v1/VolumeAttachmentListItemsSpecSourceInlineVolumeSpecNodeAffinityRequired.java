package io.yupiik.kubernetes.bindings.v1_22_1.v1;

import java.util.List;
import java.util.Objects;

public class VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequired {
    private List<VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms> nodeSelectorTerms;

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequired() {
        // no-op
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequired(final List<VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms> nodeSelectorTerms) {
        // no-op
    }

    public List<VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(final List<VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nodeSelectorTerms);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequired)) {
            return false;
        }
        final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequired __otherCasted = (VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequired) __other;
        return Objects.equals(nodeSelectorTerms, __otherCasted.nodeSelectorTerms);
    }
}
