package io.yupiik.kubernetes.bindings.v1_15_10.v1;

import java.util.List;
import java.util.Objects;

public class PersistentVolumeSpecNodeAffinityRequired {
    private List<PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTerms> nodeSelectorTerms;

    public PersistentVolumeSpecNodeAffinityRequired() {
        // no-op
    }

    public PersistentVolumeSpecNodeAffinityRequired(final List<PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTerms> nodeSelectorTerms) {
        // no-op
    }

    public List<PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTerms> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(final List<PersistentVolumeSpecNodeAffinityRequiredNodeSelectorTerms> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nodeSelectorTerms);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeSpecNodeAffinityRequired)) {
            return false;
        }
        final PersistentVolumeSpecNodeAffinityRequired __otherCasted = (PersistentVolumeSpecNodeAffinityRequired) __other;
        return Objects.equals(nodeSelectorTerms, __otherCasted.nodeSelectorTerms);
    }
}
