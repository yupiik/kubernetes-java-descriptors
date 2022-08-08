package io.yupiik.kubernetes.bindings.v1_15_11.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsPods {
    private HorizontalPodAutoscalerListItemsSpecMetricsPodsMetric metric;
    private HorizontalPodAutoscalerListItemsSpecMetricsPodsTarget target;

    public HorizontalPodAutoscalerListItemsSpecMetricsPods() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsPods(final HorizontalPodAutoscalerListItemsSpecMetricsPodsMetric metric,
                                                           final HorizontalPodAutoscalerListItemsSpecMetricsPodsTarget target) {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsPodsMetric getMetric() {
        return metric;
    }

    public void setMetric(final HorizontalPodAutoscalerListItemsSpecMetricsPodsMetric metric) {
        this.metric = metric;
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsPodsTarget getTarget() {
        return target;
    }

    public void setTarget(final HorizontalPodAutoscalerListItemsSpecMetricsPodsTarget target) {
        this.target = target;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metric,
                target);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsPods)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsPods __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsPods) __other;
        return Objects.equals(metric, __otherCasted.metric) &&
            Objects.equals(target, __otherCasted.target);
    }
}
