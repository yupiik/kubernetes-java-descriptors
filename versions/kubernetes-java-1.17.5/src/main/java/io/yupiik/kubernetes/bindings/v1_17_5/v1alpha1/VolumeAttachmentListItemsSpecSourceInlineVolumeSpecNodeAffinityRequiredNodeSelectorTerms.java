package io.yupiik.kubernetes.bindings.v1_17_5.v1alpha1;

import java.util.List;
import java.util.Objects;

public class VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms {
    private List<VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> matchExpressions;
    private List<VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> matchFields;

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms() {
        // no-op
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms(final List<VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> matchExpressions,
                                                                                                    final List<VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> matchFields) {
        // no-op
    }

    public List<VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public List<VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> getMatchFields() {
        return matchFields;
    }

    public void setMatchFields(final List<VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> matchFields) {
        this.matchFields = matchFields;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchExpressions,
                matchFields);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms)) {
            return false;
        }
        final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms __otherCasted = (VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchFields, __otherCasted.matchFields);
    }
}
