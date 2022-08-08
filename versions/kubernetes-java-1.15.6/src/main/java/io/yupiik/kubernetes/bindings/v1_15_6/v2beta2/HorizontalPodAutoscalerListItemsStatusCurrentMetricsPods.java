package io.yupiik.kubernetes.bindings.v1_15_6.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods {
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsCurrent current;
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetric metric;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsCurrent current,
                                                                    final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetric metric) {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsCurrent getCurrent() {
        return current;
    }

    public void setCurrent(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsCurrent current) {
        this.current = current;
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetric getMetric() {
        return metric;
    }

    public void setMetric(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetric metric) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsPods) __other;
        return Objects.equals(current, __otherCasted.current) &&
            Objects.equals(metric, __otherCasted.metric);
    }
}
