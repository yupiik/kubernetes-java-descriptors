package io.yupiik.kubernetes.bindings.v1_23_7.v1;

import io.yupiik.kubernetes.bindings.v1_23_7.Validable;
import io.yupiik.kubernetes.bindings.v1_23_7.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersistentVolumeClaimStatus implements Validable<PersistentVolumeClaimStatus> {
    private List<String> accessModes;
    private JsonObject allocatedResources;
    private JsonObject capacity;
    private List<PersistentVolumeClaimCondition> conditions;
    private String phase;
    private String resizeStatus;

    public PersistentVolumeClaimStatus() {
        // no-op
    }

    public PersistentVolumeClaimStatus(final List<String> accessModes,
                                       final JsonObject allocatedResources,
                                       final JsonObject capacity,
                                       final List<PersistentVolumeClaimCondition> conditions,
                                       final String phase,
                                       final String resizeStatus) {
        // no-op
    }

    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public JsonObject getAllocatedResources() {
        return allocatedResources;
    }

    public void setAllocatedResources(final JsonObject allocatedResources) {
        this.allocatedResources = allocatedResources;
    }

    public JsonObject getCapacity() {
        return capacity;
    }

    public void setCapacity(final JsonObject capacity) {
        this.capacity = capacity;
    }

    public List<PersistentVolumeClaimCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<PersistentVolumeClaimCondition> conditions) {
        this.conditions = conditions;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(final String phase) {
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

    public PersistentVolumeClaimStatus accessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
        return this;
    }

    public PersistentVolumeClaimStatus allocatedResources(final JsonObject allocatedResources) {
        this.allocatedResources = allocatedResources;
        return this;
    }

    public PersistentVolumeClaimStatus capacity(final JsonObject capacity) {
        this.capacity = capacity;
        return this;
    }

    public PersistentVolumeClaimStatus conditions(final List<PersistentVolumeClaimCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public PersistentVolumeClaimStatus phase(final String phase) {
        this.phase = phase;
        return this;
    }

    public PersistentVolumeClaimStatus resizeStatus(final String resizeStatus) {
        this.resizeStatus = resizeStatus;
        return this;
    }

    @Override
    public PersistentVolumeClaimStatus validate() {
        return this;
    }
}
