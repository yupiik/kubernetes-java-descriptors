package io.yupiik.kubernetes.bindings.v1_15_5.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsExternal {
    private HorizontalPodAutoscalerListItemsSpecMetricsExternalMetric metric;
    private HorizontalPodAutoscalerListItemsSpecMetricsExternalTarget target;

    public HorizontalPodAutoscalerListItemsSpecMetricsExternal() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsExternal(final HorizontalPodAutoscalerListItemsSpecMetricsExternalMetric metric,
                                                               final HorizontalPodAutoscalerListItemsSpecMetricsExternalTarget target) {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsExternalMetric getMetric() {
        return metric;
    }

    public void setMetric(final HorizontalPodAutoscalerListItemsSpecMetricsExternalMetric metric) {
        this.metric = metric;
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsExternalTarget getTarget() {
        return target;
    }

    public void setTarget(final HorizontalPodAutoscalerListItemsSpecMetricsExternalTarget target) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsExternal)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsExternal __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsExternal) __other;
        return Objects.equals(metric, __otherCasted.metric) &&
            Objects.equals(target, __otherCasted.target);
    }
}
