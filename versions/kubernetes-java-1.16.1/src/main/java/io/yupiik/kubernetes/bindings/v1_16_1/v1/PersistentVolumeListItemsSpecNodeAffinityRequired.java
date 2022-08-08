package io.yupiik.kubernetes.bindings.v1_16_1.v1;

import java.util.List;
import java.util.Objects;

public class PersistentVolumeListItemsSpecNodeAffinityRequired {
    private List<PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTerms> nodeSelectorTerms;

    public PersistentVolumeListItemsSpecNodeAffinityRequired() {
        // no-op
    }

    public PersistentVolumeListItemsSpecNodeAffinityRequired(final List<PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTerms> nodeSelectorTerms) {
        // no-op
    }

    public List<PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTerms> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(final List<PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTerms> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nodeSelectorTerms);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeListItemsSpecNodeAffinityRequired)) {
            return false;
        }
        final PersistentVolumeListItemsSpecNodeAffinityRequired __otherCasted = (PersistentVolumeListItemsSpecNodeAffinityRequired) __other;
        return Objects.equals(nodeSelectorTerms, __otherCasted.nodeSelectorTerms);
    }
}
