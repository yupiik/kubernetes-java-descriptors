package io.yupiik.kubernetes.bindings.v1_24_1;

import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatus {
    private List<HorizontalPodAutoscalerListItemsStatusConditions> conditions;
    private List<HorizontalPodAutoscalerListItemsStatusCurrentMetrics> currentMetrics;
    private int currentReplicas;
    private int desiredReplicas;
    private String lastScaleTime;
    private Integer observedGeneration;

    public HorizontalPodAutoscalerListItemsStatus() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatus(final List<HorizontalPodAutoscalerListItemsStatusConditions> conditions,
                                                  final List<HorizontalPodAutoscalerListItemsStatusCurrentMetrics> currentMetrics,
                                                  final int currentReplicas,
                                                  final int desiredReplicas,
                                                  final String lastScaleTime,
                                                  final Integer observedGeneration) {
        // no-op
    }

    public List<HorizontalPodAutoscalerListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<HorizontalPodAutoscalerListItemsStatusConditions> conditions) {
        this.conditions = conditions;
    }

    public List<HorizontalPodAutoscalerListItemsStatusCurrentMetrics> getCurrentMetrics() {
        return currentMetrics;
    }

    public void setCurrentMetrics(final List<HorizontalPodAutoscalerListItemsStatusCurrentMetrics> currentMetrics) {
        this.currentMetrics = currentMetrics;
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
                conditions,
                currentMetrics,
                currentReplicas,
                desiredReplicas,
                lastScaleTime,
                observedGeneration);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatus)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatus __otherCasted = (HorizontalPodAutoscalerListItemsStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(currentMetrics, __otherCasted.currentMetrics) &&
            Objects.equals(currentReplicas, __otherCasted.currentReplicas) &&
            Objects.equals(desiredReplicas, __otherCasted.desiredReplicas) &&
            Objects.equals(lastScaleTime, __otherCasted.lastScaleTime) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration);
    }
}
