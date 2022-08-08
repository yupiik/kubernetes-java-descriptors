package io.yupiik.kubernetes.bindings.v1_17_6.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsObject {
    private HorizontalPodAutoscalerStatusCurrentMetricsObjectCurrent current;
    private HorizontalPodAutoscalerStatusCurrentMetricsObjectDescribedObject describedObject;
    private HorizontalPodAutoscalerStatusCurrentMetricsObjectMetric metric;

    public HorizontalPodAutoscalerStatusCurrentMetricsObject() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsObject(final HorizontalPodAutoscalerStatusCurrentMetricsObjectCurrent current,
                                                             final HorizontalPodAutoscalerStatusCurrentMetricsObjectDescribedObject describedObject,
                                                             final HorizontalPodAutoscalerStatusCurrentMetricsObjectMetric metric) {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsObjectCurrent getCurrent() {
        return current;
    }

    public void setCurrent(final HorizontalPodAutoscalerStatusCurrentMetricsObjectCurrent current) {
        this.current = current;
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsObjectDescribedObject getDescribedObject() {
        return describedObject;
    }

    public void setDescribedObject(final HorizontalPodAutoscalerStatusCurrentMetricsObjectDescribedObject describedObject) {
        this.describedObject = describedObject;
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsObjectMetric getMetric() {
        return metric;
    }

    public void setMetric(final HorizontalPodAutoscalerStatusCurrentMetricsObjectMetric metric) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsObject)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsObject __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsObject) __other;
        return Objects.equals(current, __otherCasted.current) &&
            Objects.equals(describedObject, __otherCasted.describedObject) &&
            Objects.equals(metric, __otherCasted.metric);
    }
}
