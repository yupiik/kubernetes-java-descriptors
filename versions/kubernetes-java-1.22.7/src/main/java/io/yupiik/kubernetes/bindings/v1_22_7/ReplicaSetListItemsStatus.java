package io.yupiik.kubernetes.bindings.v1_22_7;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsStatus {
    private Integer availableReplicas;
    private List<ReplicaSetListItemsStatusConditions> conditions;
    private Integer fullyLabeledReplicas;
    private Integer observedGeneration;
    private Integer readyReplicas;
    private int replicas;

    public ReplicaSetListItemsStatus() {
        // no-op
    }

    public ReplicaSetListItemsStatus(final Integer availableReplicas,
                                     final List<ReplicaSetListItemsStatusConditions> conditions,
                                     final Integer fullyLabeledReplicas,
                                     final Integer observedGeneration,
                                     final Integer readyReplicas,
                                     final int replicas) {
        // no-op
    }

    public Integer getAvailableReplicas() {
        return availableReplicas;
    }

    public void setAvailableReplicas(final Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
    }

    public List<ReplicaSetListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<ReplicaSetListItemsStatusConditions> conditions) {
        this.conditions = conditions;
    }

    public Integer getFullyLabeledReplicas() {
        return fullyLabeledReplicas;
    }

    public void setFullyLabeledReplicas(final Integer fullyLabeledReplicas) {
        this.fullyLabeledReplicas = fullyLabeledReplicas;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                availableReplicas,
                conditions,
                fullyLabeledReplicas,
                observedGeneration,
                readyReplicas,
                replicas);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetListItemsStatus)) {
            return false;
        }
        final ReplicaSetListItemsStatus __otherCasted = (ReplicaSetListItemsStatus) __other;
        return Objects.equals(availableReplicas, __otherCasted.availableReplicas) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(fullyLabeledReplicas, __otherCasted.fullyLabeledReplicas) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration) &&
            Objects.equals(readyReplicas, __otherCasted.readyReplicas) &&
            Objects.equals(replicas, __otherCasted.replicas);
    }
}
