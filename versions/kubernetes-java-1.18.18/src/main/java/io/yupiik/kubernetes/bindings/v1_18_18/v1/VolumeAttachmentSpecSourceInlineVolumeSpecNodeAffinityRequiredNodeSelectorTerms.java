package io.yupiik.kubernetes.bindings.v1_18_18.v1;

import java.util.List;
import java.util.Objects;

public class VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms {
    private List<VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> matchExpressions;
    private List<VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> matchFields;

    public VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms() {
        // no-op
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms(final List<VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> matchExpressions,
                                                                                           final List<VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> matchFields) {
        // no-op
    }

    public List<VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public List<VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> getMatchFields() {
        return matchFields;
    }

    public void setMatchFields(final List<VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> matchFields) {
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
        if (!(__other instanceof VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms)) {
            return false;
        }
        final VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms __otherCasted = (VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTerms) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchFields, __otherCasted.matchFields);
    }
}
