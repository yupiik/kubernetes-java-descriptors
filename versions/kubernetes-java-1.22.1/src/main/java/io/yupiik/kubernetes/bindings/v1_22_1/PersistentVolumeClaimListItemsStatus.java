package io.yupiik.kubernetes.bindings.v1_22_1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PersistentVolumeClaimListItemsStatus {
    private List<String> accessModes;
    private Map<String, String> capacity;
    private List<PersistentVolumeClaimListItemsStatusConditions> conditions;
    private String phase;

    public PersistentVolumeClaimListItemsStatus() {
        // no-op
    }

    public PersistentVolumeClaimListItemsStatus(final List<String> accessModes,
                                                final Map<String, String> capacity,
                                                final List<PersistentVolumeClaimListItemsStatusConditions> conditions,
                                                final String phase) {
        // no-op
    }

    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public Map<String, String> getCapacity() {
        return capacity;
    }

    public void setCapacity(final Map<String, String> capacity) {
        this.capacity = capacity;
    }

    public List<PersistentVolumeClaimListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<PersistentVolumeClaimListItemsStatusConditions> conditions) {
        this.conditions = conditions;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(final String phase) {
        this.phase = phase;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accessModes,
                capacity,
                conditions,
                phase);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeClaimListItemsStatus)) {
            return false;
        }
        final PersistentVolumeClaimListItemsStatus __otherCasted = (PersistentVolumeClaimListItemsStatus) __other;
        return Objects.equals(accessModes, __otherCasted.accessModes) &&
            Objects.equals(capacity, __otherCasted.capacity) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(phase, __otherCasted.phase);
    }
}
