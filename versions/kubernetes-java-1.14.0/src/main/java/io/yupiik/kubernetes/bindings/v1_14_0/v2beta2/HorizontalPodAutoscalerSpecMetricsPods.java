package io.yupiik.kubernetes.bindings.v1_14_0.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsPods {
    private HorizontalPodAutoscalerSpecMetricsPodsMetric metric;
    private HorizontalPodAutoscalerSpecMetricsPodsTarget target;

    public HorizontalPodAutoscalerSpecMetricsPods() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsPods(final HorizontalPodAutoscalerSpecMetricsPodsMetric metric,
                                                  final HorizontalPodAutoscalerSpecMetricsPodsTarget target) {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsPodsMetric getMetric() {
        return metric;
    }

    public void setMetric(final HorizontalPodAutoscalerSpecMetricsPodsMetric metric) {
        this.metric = metric;
    }

    public HorizontalPodAutoscalerSpecMetricsPodsTarget getTarget() {
        return target;
    }

    public void setTarget(final HorizontalPodAutoscalerSpecMetricsPodsTarget target) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsPods)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsPods __otherCasted = (HorizontalPodAutoscalerSpecMetricsPods) __other;
        return Objects.equals(metric, __otherCasted.metric) &&
            Objects.equals(target, __otherCasted.target);
    }
}
