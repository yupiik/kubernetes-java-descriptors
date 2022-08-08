package io.yupiik.kubernetes.bindings.v1_18_11.v2beta2;

import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpec {
    private HorizontalPodAutoscalerListItemsSpecBehavior behavior;
    private int maxReplicas;
    private List<HorizontalPodAutoscalerListItemsSpecMetrics> metrics;
    private Integer minReplicas;
    private HorizontalPodAutoscalerListItemsSpecScaleTargetRef scaleTargetRef;

    public HorizontalPodAutoscalerListItemsSpec() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpec(final HorizontalPodAutoscalerListItemsSpecBehavior behavior,
                                                final int maxReplicas,
                                                final List<HorizontalPodAutoscalerListItemsSpecMetrics> metrics,
                                                final Integer minReplicas,
                                                final HorizontalPodAutoscalerListItemsSpecScaleTargetRef scaleTargetRef) {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecBehavior getBehavior() {
        return behavior;
    }

    public void setBehavior(final HorizontalPodAutoscalerListItemsSpecBehavior behavior) {
        this.behavior = behavior;
    }

    public int getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(final int maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    public List<HorizontalPodAutoscalerListItemsSpecMetrics> getMetrics() {
        return metrics;
    }

    public void setMetrics(final List<HorizontalPodAutoscalerListItemsSpecMetrics> metrics) {
        this.metrics = metrics;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                behavior,
                maxReplicas,
                metrics,
                minReplicas,
                scaleTargetRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpec)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpec __otherCasted = (HorizontalPodAutoscalerListItemsSpec) __other;
        return Objects.equals(behavior, __otherCasted.behavior) &&
            Objects.equals(maxReplicas, __otherCasted.maxReplicas) &&
            Objects.equals(metrics, __otherCasted.metrics) &&
            Objects.equals(minReplicas, __otherCasted.minReplicas) &&
            Objects.equals(scaleTargetRef, __otherCasted.scaleTargetRef);
    }
}
