package io.yupiik.kubernetes.bindings.v1_15_1.v2beta1;

import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerSpec {
    private int maxReplicas;
    private List<HorizontalPodAutoscalerSpecMetrics> metrics;
    private Integer minReplicas;
    private HorizontalPodAutoscalerSpecScaleTargetRef scaleTargetRef;

    public HorizontalPodAutoscalerSpec() {
        // no-op
    }

    public HorizontalPodAutoscalerSpec(final int maxReplicas,
                                       final List<HorizontalPodAutoscalerSpecMetrics> metrics,
                                       final Integer minReplicas,
                                       final HorizontalPodAutoscalerSpecScaleTargetRef scaleTargetRef) {
        // no-op
    }

    public int getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(final int maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    public List<HorizontalPodAutoscalerSpecMetrics> getMetrics() {
        return metrics;
    }

    public void setMetrics(final List<HorizontalPodAutoscalerSpecMetrics> metrics) {
        this.metrics = metrics;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                maxReplicas,
                metrics,
                minReplicas,
                scaleTargetRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerSpec)) {
            return false;
        }
        final HorizontalPodAutoscalerSpec __otherCasted = (HorizontalPodAutoscalerSpec) __other;
        return Objects.equals(maxReplicas, __otherCasted.maxReplicas) &&
            Objects.equals(metrics, __otherCasted.metrics) &&
            Objects.equals(minReplicas, __otherCasted.minReplicas) &&
            Objects.equals(scaleTargetRef, __otherCasted.scaleTargetRef);
    }
}
