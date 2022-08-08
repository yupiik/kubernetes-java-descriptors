package io.yupiik.kubernetes.bindings.v1_21_12.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsObject {
    private HorizontalPodAutoscalerListItemsSpecMetricsObjectDescribedObject describedObject;
    private HorizontalPodAutoscalerListItemsSpecMetricsObjectMetric metric;
    private HorizontalPodAutoscalerListItemsSpecMetricsObjectTarget target;

    public HorizontalPodAutoscalerListItemsSpecMetricsObject() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsObject(final HorizontalPodAutoscalerListItemsSpecMetricsObjectDescribedObject describedObject,
                                                             final HorizontalPodAutoscalerListItemsSpecMetricsObjectMetric metric,
                                                             final HorizontalPodAutoscalerListItemsSpecMetricsObjectTarget target) {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsObjectDescribedObject getDescribedObject() {
        return describedObject;
    }

    public void setDescribedObject(final HorizontalPodAutoscalerListItemsSpecMetricsObjectDescribedObject describedObject) {
        this.describedObject = describedObject;
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsObjectMetric getMetric() {
        return metric;
    }

    public void setMetric(final HorizontalPodAutoscalerListItemsSpecMetricsObjectMetric metric) {
        this.metric = metric;
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsObjectTarget getTarget() {
        return target;
    }

    public void setTarget(final HorizontalPodAutoscalerListItemsSpecMetricsObjectTarget target) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsObject)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsObject __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsObject) __other;
        return Objects.equals(describedObject, __otherCasted.describedObject) &&
            Objects.equals(metric, __otherCasted.metric) &&
            Objects.equals(target, __otherCasted.target);
    }
}
