package io.yupiik.kubernetes.bindings.v1_17_12.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal {
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalCurrent current;
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetric metric;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalCurrent current,
                                                                        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetric metric) {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalCurrent getCurrent() {
        return current;
    }

    public void setCurrent(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalCurrent current) {
        this.current = current;
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetric getMetric() {
        return metric;
    }

    public void setMetric(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetric metric) {
        this.metric = metric;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                current,
                metric);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternal) __other;
        return Objects.equals(current, __otherCasted.current) &&
            Objects.equals(metric, __otherCasted.metric);
    }
}
