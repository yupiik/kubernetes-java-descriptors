package io.yupiik.kubernetes.bindings.v1_13_10.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class DeploymentStatus {
    private Integer availableReplicas;
    private Integer collisionCount;
    private List<JsonValue> conditions;
    private Integer observedGeneration;
    private Integer readyReplicas;
    private Integer replicas;
    private Integer unavailableReplicas;
    private Integer updatedReplicas;

    public DeploymentStatus() {
        // no-op
    }

    public DeploymentStatus(final Integer availableReplicas,
                            final Integer collisionCount,
                            final List<JsonValue> conditions,
                            final Integer observedGeneration,
                            final Integer readyReplicas,
                            final Integer replicas,
                            final Integer unavailableReplicas,
                            final Integer updatedReplicas) {
        // no-op
    }

    public Integer getAvailableReplicas() {
        return availableReplicas;
    }

    public void setAvailableReplicas(final Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
    }

    public Integer getCollisionCount() {
        return collisionCount;
    }

    public void setCollisionCount(final Integer collisionCount) {
        this.collisionCount = collisionCount;
    }

    public List<JsonValue> getConditions() {
        return conditions;
    }

    public void setConditions(final List<JsonValue> conditions) {
        this.conditions = conditions;
    }

    public Integer getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    public Integer getReadyReplicas() {
        return readyReplicas;
    }

    public void setReadyReplicas(final Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(final Integer replicas) {
        this.replicas = replicas;
    }

    public Integer getUnavailableReplicas() {
        return unavailableReplicas;
    }

    public void setUnavailableReplicas(final Integer unavailableReplicas) {
        this.unavailableReplicas = unavailableReplicas;
    }

    public Integer getUpdatedReplicas() {
        return updatedReplicas;
    }

    public void setUpdatedReplicas(final Integer updatedReplicas) {
        this.updatedReplicas = updatedReplicas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                availableReplicas,
                collisionCount,
                conditions,
                observedGeneration,
                readyReplicas,
                replicas,
                unavailableReplicas,
                updatedReplicas);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentStatus)) {
            return false;
        }
        final DeploymentStatus __otherCasted = (DeploymentStatus) __other;
        return Objects.equals(availableReplicas, __otherCasted.availableReplicas) &&
            Objects.equals(collisionCount, __otherCasted.collisionCount) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration) &&
            Objects.equals(readyReplicas, __otherCasted.readyReplicas) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(unavailableReplicas, __otherCasted.unavailableReplicas) &&
            Objects.equals(updatedReplicas, __otherCasted.updatedReplicas);
    }
}
