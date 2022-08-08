package io.yupiik.kubernetes.bindings.v1_17_2.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsObject {
    private HorizontalPodAutoscalerSpecMetricsObjectDescribedObject describedObject;
    private HorizontalPodAutoscalerSpecMetricsObjectMetric metric;
    private HorizontalPodAutoscalerSpecMetricsObjectTarget target;

    public HorizontalPodAutoscalerSpecMetricsObject() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsObject(final HorizontalPodAutoscalerSpecMetricsObjectDescribedObject describedObject,
                                                    final HorizontalPodAutoscalerSpecMetricsObjectMetric metric,
                                                    final HorizontalPodAutoscalerSpecMetricsObjectTarget target) {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsObjectDescribedObject getDescribedObject() {
        return describedObject;
    }

    public void setDescribedObject(final HorizontalPodAutoscalerSpecMetricsObjectDescribedObject describedObject) {
        this.describedObject = describedObject;
    }

    public HorizontalPodAutoscalerSpecMetricsObjectMetric getMetric() {
        return metric;
    }

    public void setMetric(final HorizontalPodAutoscalerSpecMetricsObjectMetric metric) {
        this.metric = metric;
    }

    public HorizontalPodAutoscalerSpecMetricsObjectTarget getTarget() {
        return target;
    }

    public void setTarget(final HorizontalPodAutoscalerSpecMetricsObjectTarget target) {
        this.target = target;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                describedObject,
                metric,
                target);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsObject)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsObject __otherCasted = (HorizontalPodAutoscalerSpecMetricsObject) __other;
        return Objects.equals(describedObject, __otherCasted.describedObject) &&
            Objects.equals(metric, __otherCasted.metric) &&
            Objects.equals(target, __otherCasted.target);
    }
}
