package io.yupiik.kubernetes.bindings.v1_20_11.v1;

import java.util.Objects;

public class HorizontalPodAutoscalerStatus {
    private Integer currentCPUUtilizationPercentage;
    private int currentReplicas;
    private int desiredReplicas;
    private String lastScaleTime;
    private Integer observedGeneration;

    public HorizontalPodAutoscalerStatus() {
        // no-op
    }

    public HorizontalPodAutoscalerStatus(final Integer currentCPUUtilizationPercentage,
                                         final int currentReplicas,
                                         final int desiredReplicas,
                                         final String lastScaleTime,
                                         final Integer observedGeneration) {
        // no-op
    }

    public Integer getCurrentCPUUtilizationPercentage() {
        return currentCPUUtilizationPercentage;
    }

    public void setCurrentCPUUtilizationPercentage(final Integer currentCPUUtilizationPercentage) {
        this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
    }

    public int getCurrentReplicas() {
        return currentReplicas;
    }

    public void setCurrentReplicas(final int currentReplicas) {
        this.currentReplicas = currentReplicas;
    }

    public int getDesiredReplicas() {
        return desiredReplicas;
    }

    public void setDesiredReplicas(final int desiredReplicas) {
        this.desiredReplicas = desiredReplicas;
    }

    public String getLastScaleTime() {
        return lastScaleTime;
    }

    public void setLastScaleTime(final String lastScaleTime) {
        this.lastScaleTime = lastScaleTime;
    }

    public Integer getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                currentCPUUtilizationPercentage,
                currentReplicas,
                desiredReplicas,
                lastScaleTime,
                observedGeneration);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerStatus)) {
            return false;
        }
        final HorizontalPodAutoscalerStatus __otherCasted = (HorizontalPodAutoscalerStatus) __other;
        return Objects.equals(currentCPUUtilizationPercentage, __otherCasted.currentCPUUtilizationPercentage) &&
            Objects.equals(currentReplicas, __otherCasted.currentReplicas) &&
            Objects.equals(desiredReplicas, __otherCasted.desiredReplicas) &&
            Objects.equals(lastScaleTime, __otherCasted.lastScaleTime) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration);
    }
}
