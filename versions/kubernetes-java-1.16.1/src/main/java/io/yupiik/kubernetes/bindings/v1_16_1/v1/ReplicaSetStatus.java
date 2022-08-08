package io.yupiik.kubernetes.bindings.v1_16_1.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetStatus {
    private Integer availableReplicas;
    private List<ReplicaSetStatusConditions> conditions;
    private Integer fullyLabeledReplicas;
    private Integer observedGeneration;
    private Integer readyReplicas;
    private int replicas;

    public ReplicaSetStatus() {
        // no-op
    }

    public ReplicaSetStatus(final Integer availableReplicas,
                            final List<ReplicaSetStatusConditions> conditions,
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

    public List<ReplicaSetStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<ReplicaSetStatusConditions> conditions) {
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
        if (!(__other instanceof ReplicaSetStatus)) {
            return false;
        }
        final ReplicaSetStatus __otherCasted = (ReplicaSetStatus) __other;
        return Objects.equals(availableReplicas, __otherCasted.availableReplicas) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(fullyLabeledReplicas, __otherCasted.fullyLabeledReplicas) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration) &&
            Objects.equals(readyReplicas, __otherCasted.readyReplicas) &&
            Objects.equals(replicas, __otherCasted.replicas);
    }
}
