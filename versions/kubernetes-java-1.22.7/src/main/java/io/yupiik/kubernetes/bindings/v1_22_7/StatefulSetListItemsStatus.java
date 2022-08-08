package io.yupiik.kubernetes.bindings.v1_22_7;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsStatus {
    private Integer availableReplicas;
    private Integer collisionCount;
    private List<StatefulSetListItemsStatusConditions> conditions;
    private Integer currentReplicas;
    private String currentRevision;
    private Integer observedGeneration;
    private Integer readyReplicas;
    private int replicas;
    private String updateRevision;
    private Integer updatedReplicas;

    public StatefulSetListItemsStatus() {
        // no-op
    }

    public StatefulSetListItemsStatus(final Integer availableReplicas,
                                      final Integer collisionCount,
                                      final List<StatefulSetListItemsStatusConditions> conditions,
                                      final Integer currentReplicas,
                                      final String currentRevision,
                                      final Integer observedGeneration,
                                      final Integer readyReplicas,
                                      final int replicas,
                                      final String updateRevision,
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

    public List<StatefulSetListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<StatefulSetListItemsStatusConditions> conditions) {
        this.conditions = conditions;
    }

    public Integer getCurrentReplicas() {
        return currentReplicas;
    }

    public void setCurrentReplicas(final Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
    }

    public String getCurrentRevision() {
        return currentRevision;
    }

    public void setCurrentRevision(final String currentRevision) {
        this.currentRevision = currentRevision;
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

    public int getReplicas() {
        return replicas;
    }

    public void setReplicas(final int replicas) {
        this.replicas = replicas;
    }

    public String getUpdateRevision() {
        return updateRevision;
    }

    public void setUpdateRevision(final String updateRevision) {
        this.updateRevision = updateRevision;
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
                currentReplicas,
                currentRevision,
                observedGeneration,
                readyReplicas,
                replicas,
                updateRevision,
                updatedReplicas);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetListItemsStatus)) {
            return false;
        }
        final StatefulSetListItemsStatus __otherCasted = (StatefulSetListItemsStatus) __other;
        return Objects.equals(availableReplicas, __otherCasted.availableReplicas) &&
            Objects.equals(collisionCount, __otherCasted.collisionCount) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(currentReplicas, __otherCasted.currentReplicas) &&
            Objects.equals(currentRevision, __otherCasted.currentRevision) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration) &&
            Objects.equals(readyReplicas, __otherCasted.readyReplicas) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(updateRevision, __otherCasted.updateRevision) &&
            Objects.equals(updatedReplicas, __otherCasted.updatedReplicas);
    }
}
