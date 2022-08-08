package io.yupiik.kubernetes.bindings.v1_15_10;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsStatus {
    private Integer availableReplicas;
    private List<ReplicationControllerListItemsStatusConditions> conditions;
    private Integer fullyLabeledReplicas;
    private Integer observedGeneration;
    private Integer readyReplicas;
    private int replicas;

    public ReplicationControllerListItemsStatus() {
        // no-op
    }

    public ReplicationControllerListItemsStatus(final Integer availableReplicas,
                                                final List<ReplicationControllerListItemsStatusConditions> conditions,
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

    public List<ReplicationControllerListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<ReplicationControllerListItemsStatusConditions> conditions) {
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
        if (!(__other instanceof ReplicationControllerListItemsStatus)) {
            return false;
        }
        final ReplicationControllerListItemsStatus __otherCasted = (ReplicationControllerListItemsStatus) __other;
        return Objects.equals(availableReplicas, __otherCasted.availableReplicas) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(fullyLabeledReplicas, __otherCasted.fullyLabeledReplicas) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration) &&
            Objects.equals(readyReplicas, __otherCasted.readyReplicas) &&
            Objects.equals(replicas, __otherCasted.replicas);
    }
}
