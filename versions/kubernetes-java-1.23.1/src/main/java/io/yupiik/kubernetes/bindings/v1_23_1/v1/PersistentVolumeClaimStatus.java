package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PersistentVolumeClaimStatus {
    private List<String> accessModes;
    private Map<String, String> allocatedResources;
    private Map<String, String> capacity;
    private List<PersistentVolumeClaimStatusConditions> conditions;
    private PersistentVolumeClaimStatusPhase phase;
    private String resizeStatus;

    public PersistentVolumeClaimStatus() {
        // no-op
    }

    public PersistentVolumeClaimStatus(final List<String> accessModes,
                                       final Map<String, String> allocatedResources,
                                       final Map<String, String> capacity,
                                       final List<PersistentVolumeClaimStatusConditions> conditions,
                                       final PersistentVolumeClaimStatusPhase phase,
                                       final String resizeStatus) {
        // no-op
    }

    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public Map<String, String> getAllocatedResources() {
        return allocatedResources;
    }

    public void setAllocatedResources(final Map<String, String> allocatedResources) {
        this.allocatedResources = allocatedResources;
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

    public PersistentVolumeClaimStatusPhase getPhase() {
        return phase;
    }

    public void setPhase(final PersistentVolumeClaimStatusPhase phase) {
        this.phase = phase;
    }

    public String getResizeStatus() {
        return resizeStatus;
    }

    public void setResizeStatus(final String resizeStatus) {
        this.resizeStatus = resizeStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accessModes,
                allocatedResources,
                capacity,
                conditions,
                phase,
                resizeStatus);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeClaimStatus)) {
            return false;
        }
        final PersistentVolumeClaimStatus __otherCasted = (PersistentVolumeClaimStatus) __other;
        return Objects.equals(accessModes, __otherCasted.accessModes) &&
            Objects.equals(allocatedResources, __otherCasted.allocatedResources) &&
            Objects.equals(capacity, __otherCasted.capacity) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(phase, __otherCasted.phase) &&
            Objects.equals(resizeStatus, __otherCasted.resizeStatus);
    }
}
