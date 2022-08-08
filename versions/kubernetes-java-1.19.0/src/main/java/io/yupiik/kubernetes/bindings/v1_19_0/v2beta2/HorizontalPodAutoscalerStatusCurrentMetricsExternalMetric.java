package io.yupiik.kubernetes.bindings.v1_19_0.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsExternalMetric {
    private String name;
    private HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelector selector;

    public HorizontalPodAutoscalerStatusCurrentMetricsExternalMetric() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsExternalMetric(final String name,
                                                                     final HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelector selector) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerStatusCurrentMetricsExternalMetricSelector selector) {
        this.selector = selector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                selector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsExternalMetric)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsExternalMetric __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsExternalMetric) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
