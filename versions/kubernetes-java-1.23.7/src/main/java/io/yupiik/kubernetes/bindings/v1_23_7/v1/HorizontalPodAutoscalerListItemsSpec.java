package io.yupiik.kubernetes.bindings.v1_23_7.v1;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpec {
    private int maxReplicas;
    private Integer minReplicas;
    private HorizontalPodAutoscalerListItemsSpecScaleTargetRef scaleTargetRef;
    private Integer targetCPUUtilizationPercentage;

    public HorizontalPodAutoscalerListItemsSpec() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpec(final int maxReplicas,
                                                final Integer minReplicas,
                                                final HorizontalPodAutoscalerListItemsSpecScaleTargetRef scaleTargetRef,
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

    public HorizontalPodAutoscalerListItemsSpecScaleTargetRef getScaleTargetRef() {
        return scaleTargetRef;
    }

    public void setScaleTargetRef(final HorizontalPodAutoscalerListItemsSpecScaleTargetRef scaleTargetRef) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpec)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpec __otherCasted = (HorizontalPodAutoscalerListItemsSpec) __other;
        return Objects.equals(maxReplicas, __otherCasted.maxReplicas) &&
            Objects.equals(minReplicas, __otherCasted.minReplicas) &&
            Objects.equals(scaleTargetRef, __otherCasted.scaleTargetRef) &&
            Objects.equals(targetCPUUtilizationPercentage, __otherCasted.targetCPUUtilizationPercentage);
    }
}
