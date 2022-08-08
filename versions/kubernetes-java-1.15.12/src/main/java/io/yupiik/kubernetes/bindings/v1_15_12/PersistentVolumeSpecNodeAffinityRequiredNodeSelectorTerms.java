package io.yupiik.kubernetes.bindings.v1_15_12;

import java.util.List;
import java.util.Objects;

public class PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTerms {
    private List<PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> matchExpressions;
    private List<PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> matchFields;

    public PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTerms() {
        // no-op
    }

    public PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTerms(final List<PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> matchExpressions,
                                                                     final List<PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> matchFields) {
        // no-op
    }

    public List<PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public List<PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> getMatchFields() {
        return matchFields;
    }

    public void setMatchFields(final List<PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchFields> matchFields) {
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
        if (!(__other instanceof PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTerms)) {
            return false;
        }
        final PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTerms __otherCasted = (PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTerms) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchFields, __otherCasted.matchFields);
    }
}
