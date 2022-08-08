package io.yupiik.kubernetes.bindings.v1_16_7;

import java.util.List;
import java.util.Objects;

public class PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTerms {
    private List<PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> matchExpressions;
    private List<PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> matchFields;

    public PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTerms() {
        // no-op
    }

    public PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTerms(final List<PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> matchExpressions,
                                                                              final List<PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> matchFields) {
        // no-op
    }

    public List<PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public List<PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> getMatchFields() {
        return matchFields;
    }

    public void setMatchFields(final List<PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> matchFields) {
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
        if (!(__other instanceof PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTerms)) {
            return false;
        }
        final PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTerms __otherCasted = (PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTerms) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchFields, __otherCasted.matchFields);
    }
}
