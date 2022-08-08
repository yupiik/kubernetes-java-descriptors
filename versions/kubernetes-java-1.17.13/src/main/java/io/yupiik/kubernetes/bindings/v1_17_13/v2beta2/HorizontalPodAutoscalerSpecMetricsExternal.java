package io.yupiik.kubernetes.bindings.v1_17_13.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsExternal {
    private HorizontalPodAutoscalerSpecMetricsExternalMetric metric;
    private HorizontalPodAutoscalerSpecMetricsExternalTarget target;

    public HorizontalPodAutoscalerSpecMetricsExternal() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsExternal(final HorizontalPodAutoscalerSpecMetricsExternalMetric metric,
                                                      final HorizontalPodAutoscalerSpecMetricsExternalTarget target) {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsExternalMetric getMetric() {
        return metric;
    }

    public void setMetric(final HorizontalPodAutoscalerSpecMetricsExternalMetric metric) {
        this.metric = metric;
    }

    public HorizontalPodAutoscalerSpecMetricsExternalTarget getTarget() {
        return target;
    }

    public void setTarget(final HorizontalPodAutoscalerSpecMetricsExternalTarget target) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsExternal)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsExternal __otherCasted = (HorizontalPodAutoscalerSpecMetricsExternal) __other;
        return Objects.equals(metric, __otherCasted.metric) &&
            Objects.equals(target, __otherCasted.target);
    }
}
