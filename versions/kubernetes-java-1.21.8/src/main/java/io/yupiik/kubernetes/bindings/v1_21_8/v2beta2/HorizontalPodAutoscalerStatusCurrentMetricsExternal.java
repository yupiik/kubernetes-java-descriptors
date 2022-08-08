package io.yupiik.kubernetes.bindings.v1_21_8.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsExternal {
    private HorizontalPodAutoscalerStatusCurrentMetricsExternalCurrent current;
    private HorizontalPodAutoscalerStatusCurrentMetricsExternalMetric metric;

    public HorizontalPodAutoscalerStatusCurrentMetricsExternal() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsExternal(final HorizontalPodAutoscalerStatusCurrentMetricsExternalCurrent current,
                                                               final HorizontalPodAutoscalerStatusCurrentMetricsExternalMetric metric) {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsExternalCurrent getCurrent() {
        return current;
    }

    public void setCurrent(final HorizontalPodAutoscalerStatusCurrentMetricsExternalCurrent current) {
        this.current = current;
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsExternalMetric getMetric() {
        return metric;
    }

    public void setMetric(final HorizontalPodAutoscalerStatusCurrentMetricsExternalMetric metric) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsExternal)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsExternal __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsExternal) __other;
        return Objects.equals(current, __otherCasted.current) &&
            Objects.equals(metric, __otherCasted.metric);
    }
}
