package io.yupiik.kubernetes.bindings.v1_21_12;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PersistentVolumeClaimStatus {
    private List<String> accessModes;
    private Map<String, String> capacity;
    private List<PersistentVolumeClaimStatusConditions> conditions;
    private String phase;

    public PersistentVolumeClaimStatus() {
        // no-op
    }

    public PersistentVolumeClaimStatus(final List<String> accessModes,
                                       final Map<String, String> capacity,
                                       final List<PersistentVolumeClaimStatusConditions> conditions,
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

    public List<PersistentVolumeClaimStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<PersistentVolumeClaimStatusConditions> conditions) {
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
        if (!(__other instanceof PersistentVolumeClaimStatus)) {
            return false;
        }
        final PersistentVolumeClaimStatus __otherCasted = (PersistentVolumeClaimStatus) __other;
        return Objects.equals(accessModes, __otherCasted.accessModes) &&
            Objects.equals(capacity, __otherCasted.capacity) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(phase, __otherCasted.phase);
    }
}
