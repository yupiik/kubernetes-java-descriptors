package io.yupiik.kubernetes.bindings.v1_11_1.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class DaemonSetStatus {
    private Integer collisionCount;
    private List<JsonValue> conditions;
    private int currentNumberScheduled;
    private int desiredNumberScheduled;
    private Integer numberAvailable;
    private int numberMisscheduled;
    private int numberReady;
    private Integer numberUnavailable;
    private Integer observedGeneration;
    private Integer updatedNumberScheduled;

    public DaemonSetStatus() {
        // no-op
    }

    public DaemonSetStatus(final Integer collisionCount,
                           final List<JsonValue> conditions,
                           final int currentNumberScheduled,
                           final int desiredNumberScheduled,
                           final Integer numberAvailable,
                           final int numberMisscheduled,
                           final int numberReady,
                           final Integer numberUnavailable,
                           final Integer observedGeneration,
                           final Integer updatedNumberScheduled) {
        // no-op
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

    public int getCurrentNumberScheduled() {
        return currentNumberScheduled;
    }

    public void setCurrentNumberScheduled(final int currentNumberScheduled) {
        this.currentNumberScheduled = currentNumberScheduled;
    }

    public int getDesiredNumberScheduled() {
        return desiredNumberScheduled;
    }

    public void setDesiredNumberScheduled(final int desiredNumberScheduled) {
        this.desiredNumberScheduled = desiredNumberScheduled;
    }

    public Integer getNumberAvailable() {
        return numberAvailable;
    }

    public void setNumberAvailable(final Integer numberAvailable) {
        this.numberAvailable = numberAvailable;
    }

    public int getNumberMisscheduled() {
        return numberMisscheduled;
    }

    public void setNumberMisscheduled(final int numberMisscheduled) {
        this.numberMisscheduled = numberMisscheduled;
    }

    public int getNumberReady() {
        return numberReady;
    }

    public void setNumberReady(final int numberReady) {
        this.numberReady = numberReady;
    }

    public Integer getNumberUnavailable() {
        return numberUnavailable;
    }

    public void setNumberUnavailable(final Integer numberUnavailable) {
        this.numberUnavailable = numberUnavailable;
    }

    public Integer getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    public Integer getUpdatedNumberScheduled() {
        return updatedNumberScheduled;
    }

    public void setUpdatedNumberScheduled(final Integer updatedNumberScheduled) {
        this.updatedNumberScheduled = updatedNumberScheduled;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                collisionCount,
                conditions,
                currentNumberScheduled,
                desiredNumberScheduled,
                numberAvailable,
                numberMisscheduled,
                numberReady,
                numberUnavailable,
                observedGeneration,
                updatedNumberScheduled);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetStatus)) {
            return false;
        }
        final DaemonSetStatus __otherCasted = (DaemonSetStatus) __other;
        return Objects.equals(collisionCount, __otherCasted.collisionCount) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(currentNumberScheduled, __otherCasted.currentNumberScheduled) &&
            Objects.equals(desiredNumberScheduled, __otherCasted.desiredNumberScheduled) &&
            Objects.equals(numberAvailable, __otherCasted.numberAvailable) &&
            Objects.equals(numberMisscheduled, __otherCasted.numberMisscheduled) &&
            Objects.equals(numberReady, __otherCasted.numberReady) &&
            Objects.equals(numberUnavailable, __otherCasted.numberUnavailable) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration) &&
            Objects.equals(updatedNumberScheduled, __otherCasted.updatedNumberScheduled);
    }
}
