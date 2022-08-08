package io.yupiik.kubernetes.bindings.v1_18_7.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject {
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectCurrent current;
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectDescribedObject describedObject;
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetric metric;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectCurrent current,
                                                                      final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectDescribedObject describedObject,
                                                                      final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetric metric) {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectCurrent getCurrent() {
        return current;
    }

    public void setCurrent(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectCurrent current) {
        this.current = current;
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectDescribedObject getDescribedObject() {
        return describedObject;
    }

    public void setDescribedObject(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectDescribedObject describedObject) {
        this.describedObject = describedObject;
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetric getMetric() {
        return metric;
    }

    public void setMetric(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetric metric) {
        this.metric = metric;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                current,
                describedObject,
                metric);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsObject) __other;
        return Objects.equals(current, __otherCasted.current) &&
            Objects.equals(describedObject, __otherCasted.describedObject) &&
            Objects.equals(metric, __otherCasted.metric);
    }
}
