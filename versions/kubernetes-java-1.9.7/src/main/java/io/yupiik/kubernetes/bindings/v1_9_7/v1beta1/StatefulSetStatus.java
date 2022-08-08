package io.yupiik.kubernetes.bindings.v1_9_7.v1beta1;

import io.yupiik.kubernetes.bindings.v1_9_7.Validable;
import io.yupiik.kubernetes.bindings.v1_9_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StatefulSetStatus implements Validable<StatefulSetStatus> {
    private Integer collisionCount;
    private List<StatefulSetCondition> conditions;
    private Integer currentReplicas;
    private String currentRevision;
    private Integer observedGeneration;
    private Integer readyReplicas;
    private int replicas;
    private String updateRevision;
    private Integer updatedReplicas;

    public StatefulSetStatus() {
        // no-op
    }

    public StatefulSetStatus(final Integer collisionCount,
                             final List<StatefulSetCondition> conditions,
                             final Integer currentReplicas,
                             final String currentRevision,
                             final Integer observedGeneration,
                             final Integer readyReplicas,
                             final int replicas,
                             final String updateRevision,
                             final Integer updatedReplicas) {
        // no-op
    }

    public Integer getCollisionCount() {
        return collisionCount;
    }

    public void setCollisionCount(final Integer collisionCount) {
        this.collisionCount = collisionCount;
    }

    public List<StatefulSetCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<StatefulSetCondition> conditions) {
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
        if (!(__other instanceof StatefulSetStatus)) {
            return false;
        }
        final StatefulSetStatus __otherCasted = (StatefulSetStatus) __other;
        return Objects.equals(collisionCount, __otherCasted.collisionCount) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(currentReplicas, __otherCasted.currentReplicas) &&
            Objects.equals(currentRevision, __otherCasted.currentRevision) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration) &&
            Objects.equals(readyReplicas, __otherCasted.readyReplicas) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(updateRevision, __otherCasted.updateRevision) &&
            Objects.equals(updatedReplicas, __otherCasted.updatedReplicas);
    }

    public StatefulSetStatus collisionCount(final Integer collisionCount) {
        this.collisionCount = collisionCount;
        return this;
    }

    public StatefulSetStatus conditions(final List<StatefulSetCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public StatefulSetStatus currentReplicas(final Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
        return this;
    }

    public StatefulSetStatus currentRevision(final String currentRevision) {
        this.currentRevision = currentRevision;
        return this;
    }

    public StatefulSetStatus observedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    public StatefulSetStatus readyReplicas(final Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
        return this;
    }

    public StatefulSetStatus replicas(final int replicas) {
        this.replicas = replicas;
        return this;
    }

    public StatefulSetStatus updateRevision(final String updateRevision) {
        this.updateRevision = updateRevision;
        return this;
    }

    public StatefulSetStatus updatedReplicas(final Integer updatedReplicas) {
        this.updatedReplicas = updatedReplicas;
        return this;
    }

    @Override
    public StatefulSetStatus validate() {
        return this;
    }
}
