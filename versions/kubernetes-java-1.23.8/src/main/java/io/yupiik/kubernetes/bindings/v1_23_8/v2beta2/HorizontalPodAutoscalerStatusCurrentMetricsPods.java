package io.yupiik.kubernetes.bindings.v1_23_8.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsPods {
    private HorizontalPodAutoscalerStatusCurrentMetricsPodsCurrent current;
    private HorizontalPodAutoscalerStatusCurrentMetricsPodsMetric metric;

    public HorizontalPodAutoscalerStatusCurrentMetricsPods() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsPods(final HorizontalPodAutoscalerStatusCurrentMetricsPodsCurrent current,
                                                           final HorizontalPodAutoscalerStatusCurrentMetricsPodsMetric metric) {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsPodsCurrent getCurrent() {
        return current;
    }

    public void setCurrent(final HorizontalPodAutoscalerStatusCurrentMetricsPodsCurrent current) {
        this.current = current;
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsPodsMetric getMetric() {
        return metric;
    }

    public void setMetric(final HorizontalPodAutoscalerStatusCurrentMetricsPodsMetric metric) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsPods)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsPods __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsPods) __other;
        return Objects.equals(current, __otherCasted.current) &&
            Objects.equals(metric, __otherCasted.metric);
    }
}
