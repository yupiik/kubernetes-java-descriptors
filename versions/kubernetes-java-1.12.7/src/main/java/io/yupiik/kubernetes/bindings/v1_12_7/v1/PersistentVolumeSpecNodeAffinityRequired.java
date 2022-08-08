package io.yupiik.kubernetes.bindings.v1_12_7.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PersistentVolumeSpecNodeAffinityRequired {
    private List<JsonValue> nodeSelectorTerms;

    public PersistentVolumeSpecNodeAffinityRequired() {
        // no-op
    }

    public PersistentVolumeSpecNodeAffinityRequired(final List<JsonValue> nodeSelectorTerms) {
        // no-op
    }

    public List<JsonValue> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(final List<JsonValue> nodeSelectorTerms) {
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
