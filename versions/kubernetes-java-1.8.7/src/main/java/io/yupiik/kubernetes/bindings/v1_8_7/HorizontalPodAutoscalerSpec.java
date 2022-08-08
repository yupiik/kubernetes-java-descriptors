package io.yupiik.kubernetes.bindings.v1_8_7;

import java.util.Objects;

public class HorizontalPodAutoscalerSpec {
    private int maxReplicas;
    private Integer minReplicas;
    private HorizontalPodAutoscalerSpecScaleTargetRef scaleTargetRef;
    private Integer targetCPUUtilizationPercentage;

    public HorizontalPodAutoscalerSpec() {
        // no-op
    }

    public HorizontalPodAutoscalerSpec(final int maxReplicas,
                                       final Integer minReplicas,
                                       final HorizontalPodAutoscalerSpecScaleTargetRef scaleTargetRef,
                                       final Integer targetCPUUtilizationPercentage) {
        // no-op
    }

    public int getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(final int maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    public Integer getMinReplicas() {
        return minReplicas;
    }

    public void setMinReplicas(final Integer minReplicas) {
        this.minReplicas = minReplicas;
    }

    public HorizontalPodAutoscalerSpecScaleTargetRef getScaleTargetRef() {
        return scaleTargetRef;
    }

    public void setScaleTargetRef(final HorizontalPodAutoscalerSpecScaleTargetRef scaleTargetRef) {
        this.scaleTargetRef = scaleTargetRef;
    }

    public Integer getTargetCPUUtilizationPercentage() {
        return targetCPUUtilizationPercentage;
    }

    public void setTargetCPUUtilizationPercentage(final Integer targetCPUUtilizationPercentage) {
        this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                maxReplicas,
                minReplicas,
                scaleTargetRef,
                targetCPUUtilizationPercentage);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerSpec)) {
            return false;
        }
        final HorizontalPodAutoscalerSpec __otherCasted = (HorizontalPodAutoscalerSpec) __other;
        return Objects.equals(maxReplicas, __otherCasted.maxReplicas) &&
            Objects.equals(minReplicas, __otherCasted.minReplicas) &&
            Objects.equals(scaleTargetRef, __otherCasted.scaleTargetRef) &&
            Objects.equals(targetCPUUtilizationPercentage, __otherCasted.targetCPUUtilizationPercentage);
    }
}
