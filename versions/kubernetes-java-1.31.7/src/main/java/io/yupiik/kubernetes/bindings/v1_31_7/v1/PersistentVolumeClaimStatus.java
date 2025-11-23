package io.yupiik.kubernetes.bindings.v1_31_7.v1;

import io.yupiik.kubernetes.bindings.v1_31_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_7.Validable;
import jakarta.json.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PersistentVolumeClaimStatus implements Validable<PersistentVolumeClaimStatus>, Exportable {
    private List<String> accessModes;
    private Map<String, String> allocatedResourceStatuses;
    private JsonObject allocatedResources;
    private JsonObject capacity;
    private List<PersistentVolumeClaimCondition> conditions;
    private String currentVolumeAttributesClassName;
    private ModifyVolumeStatus modifyVolumeStatus;
    private String phase;

    public PersistentVolumeClaimStatus() {
        // no-op
    }

    public PersistentVolumeClaimStatus(final List<String> accessModes,
                                       final Map<String, String> allocatedResourceStatuses,
                                       final JsonObject allocatedResources,
                                       final JsonObject capacity,
                                       final List<PersistentVolumeClaimCondition> conditions,
                                       final String currentVolumeAttributesClassName,
                                       final ModifyVolumeStatus modifyVolumeStatus,
                                       final String phase) {
        this.accessModes = accessModes;
        this.allocatedResourceStatuses = allocatedResourceStatuses;
        this.allocatedResources = allocatedResources;
        this.capacity = capacity;
        this.conditions = conditions;
        this.currentVolumeAttributesClassName = currentVolumeAttributesClassName;
        this.modifyVolumeStatus = modifyVolumeStatus;
        this.phase = phase;
    }

    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public Map<String, String> getAllocatedResourceStatuses() {
        return allocatedResourceStatuses;
    }

    public void setAllocatedResourceStatuses(final Map<String, String> allocatedResourceStatuses) {
        this.allocatedResourceStatuses = allocatedResourceStatuses;
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

    public String getCurrentVolumeAttributesClassName() {
        return currentVolumeAttributesClassName;
    }

    public void setCurrentVolumeAttributesClassName(final String currentVolumeAttributesClassName) {
        this.currentVolumeAttributesClassName = currentVolumeAttributesClassName;
    }

    public ModifyVolumeStatus getModifyVolumeStatus() {
        return modifyVolumeStatus;
    }

    public void setModifyVolumeStatus(final ModifyVolumeStatus modifyVolumeStatus) {
        this.modifyVolumeStatus = modifyVolumeStatus;
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
                allocatedResourceStatuses,
                allocatedResources,
                capacity,
                conditions,
                currentVolumeAttributesClassName,
                modifyVolumeStatus,
                phase);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeClaimStatus)) {
            return false;
        }
        final PersistentVolumeClaimStatus __otherCasted = (PersistentVolumeClaimStatus) __other;
        return Objects.equals(accessModes, __otherCasted.accessModes) &&
            Objects.equals(allocatedResourceStatuses, __otherCasted.allocatedResourceStatuses) &&
            Objects.equals(allocatedResources, __otherCasted.allocatedResources) &&
            Objects.equals(capacity, __otherCasted.capacity) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(currentVolumeAttributesClassName, __otherCasted.currentVolumeAttributesClassName) &&
            Objects.equals(modifyVolumeStatus, __otherCasted.modifyVolumeStatus) &&
            Objects.equals(phase, __otherCasted.phase);
    }

    public PersistentVolumeClaimStatus accessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
        return this;
    }

    public PersistentVolumeClaimStatus allocatedResourceStatuses(final Map<String, String> allocatedResourceStatuses) {
        this.allocatedResourceStatuses = allocatedResourceStatuses;
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

    public PersistentVolumeClaimStatus currentVolumeAttributesClassName(final String currentVolumeAttributesClassName) {
        this.currentVolumeAttributesClassName = currentVolumeAttributesClassName;
        return this;
    }

    public PersistentVolumeClaimStatus modifyVolumeStatus(final ModifyVolumeStatus modifyVolumeStatus) {
        this.modifyVolumeStatus = modifyVolumeStatus;
        return this;
    }

    public PersistentVolumeClaimStatus phase(final String phase) {
        this.phase = phase;
        return this;
    }

    @Override
    public PersistentVolumeClaimStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (accessModes != null ? "\"accessModes\":" + accessModes.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (allocatedResourceStatuses != null ? "\"allocatedResourceStatuses\":" + allocatedResourceStatuses.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (allocatedResources != null ? "\"allocatedResources\":" + allocatedResources : ""),
                    (capacity != null ? "\"capacity\":" + capacity : ""),
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (currentVolumeAttributesClassName != null ? "\"currentVolumeAttributesClassName\":\"" +  JsonStrings.escapeJson(currentVolumeAttributesClassName) + "\"" : ""),
                    (modifyVolumeStatus != null ? "\"modifyVolumeStatus\":" + modifyVolumeStatus.asJson() : ""),
                    (phase != null ? "\"phase\":\"" +  JsonStrings.escapeJson(phase) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
