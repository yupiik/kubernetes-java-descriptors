package io.yupiik.kubernetes.bindings.v1_23_2.v2;

import io.yupiik.kubernetes.bindings.v1_23_2.Validable;
import io.yupiik.kubernetes.bindings.v1_23_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerStatus implements Validable<HorizontalPodAutoscalerStatus> {
    private List<HorizontalPodAutoscalerCondition> conditions;
    private List<MetricStatus> currentMetrics;
    private Integer currentReplicas;
    private int desiredReplicas;
    private String lastScaleTime;
    private Integer observedGeneration;

    public HorizontalPodAutoscalerStatus() {
        // no-op
    }

    public HorizontalPodAutoscalerStatus(final List<HorizontalPodAutoscalerCondition> conditions,
                                         final List<MetricStatus> currentMetrics,
                                         final Integer currentReplicas,
                                         final int desiredReplicas,
                                         final String lastScaleTime,
                                         final Integer observedGeneration) {
        // no-op
    }

    public List<HorizontalPodAutoscalerCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<HorizontalPodAutoscalerCondition> conditions) {
        this.conditions = conditions;
    }

    public List<MetricStatus> getCurrentMetrics() {
        return currentMetrics;
    }

    public void setCurrentMetrics(final List<MetricStatus> currentMetrics) {
        this.currentMetrics = currentMetrics;
    }

    public Integer getCurrentReplicas() {
        return currentReplicas;
    }

    public void setCurrentReplicas(final Integer currentReplicas) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatus)) {
            return false;
        }
        final HorizontalPodAutoscalerStatus __otherCasted = (HorizontalPodAutoscalerStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(currentMetrics, __otherCasted.currentMetrics) &&
            Objects.equals(currentReplicas, __otherCasted.currentReplicas) &&
            Objects.equals(desiredReplicas, __otherCasted.desiredReplicas) &&
            Objects.equals(lastScaleTime, __otherCasted.lastScaleTime) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration);
    }

    public HorizontalPodAutoscalerStatus conditions(final List<HorizontalPodAutoscalerCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public HorizontalPodAutoscalerStatus currentMetrics(final List<MetricStatus> currentMetrics) {
        this.currentMetrics = currentMetrics;
        return this;
    }

    public HorizontalPodAutoscalerStatus currentReplicas(final Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
        return this;
    }

    public HorizontalPodAutoscalerStatus desiredReplicas(final int desiredReplicas) {
        this.desiredReplicas = desiredReplicas;
        return this;
    }

    public HorizontalPodAutoscalerStatus lastScaleTime(final String lastScaleTime) {
        this.lastScaleTime = lastScaleTime;
        return this;
    }

    public HorizontalPodAutoscalerStatus observedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    @Override
    public HorizontalPodAutoscalerStatus validate() {
        return this;
    }
}
