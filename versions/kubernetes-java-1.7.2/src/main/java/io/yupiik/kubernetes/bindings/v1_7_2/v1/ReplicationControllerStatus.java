package io.yupiik.kubernetes.bindings.v1_7_2.v1;

import io.yupiik.kubernetes.bindings.v1_7_2.Validable;
import io.yupiik.kubernetes.bindings.v1_7_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReplicationControllerStatus implements Validable<ReplicationControllerStatus> {
    private Integer availableReplicas;
    private List<ReplicationControllerCondition> conditions;
    private Integer fullyLabeledReplicas;
    private Integer observedGeneration;
    private Integer readyReplicas;
    private int replicas;

    public ReplicationControllerStatus() {
        // no-op
    }

    public ReplicationControllerStatus(final Integer availableReplicas,
                                       final List<ReplicationControllerCondition> conditions,
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

    public List<ReplicationControllerCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<ReplicationControllerCondition> conditions) {
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
        if (!(__other instanceof ReplicationControllerStatus)) {
            return false;
        }
        final ReplicationControllerStatus __otherCasted = (ReplicationControllerStatus) __other;
        return Objects.equals(availableReplicas, __otherCasted.availableReplicas) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(fullyLabeledReplicas, __otherCasted.fullyLabeledReplicas) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration) &&
            Objects.equals(readyReplicas, __otherCasted.readyReplicas) &&
            Objects.equals(replicas, __otherCasted.replicas);
    }

    public ReplicationControllerStatus availableReplicas(final Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
        return this;
    }

    public ReplicationControllerStatus conditions(final List<ReplicationControllerCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ReplicationControllerStatus fullyLabeledReplicas(final Integer fullyLabeledReplicas) {
        this.fullyLabeledReplicas = fullyLabeledReplicas;
        return this;
    }

    public ReplicationControllerStatus observedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    public ReplicationControllerStatus readyReplicas(final Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
        return this;
    }

    public ReplicationControllerStatus replicas(final int replicas) {
        this.replicas = replicas;
        return this;
    }

    @Override
    public ReplicationControllerStatus validate() {
        return this;
    }
}
