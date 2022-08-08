package io.yupiik.kubernetes.bindings.v1_16_0.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsObjectMetric {
    private String name;
    private HorizontalPodAutoscalerStatusCurrentMetricsObjectMetricSelector selector;

    public HorizontalPodAutoscalerStatusCurrentMetricsObjectMetric() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsObjectMetric(final String name,
                                                                   final HorizontalPodAutoscalerStatusCurrentMetricsObjectMetricSelector selector) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsObjectMetricSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerStatusCurrentMetricsObjectMetricSelector selector) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsObjectMetric)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsObjectMetric __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsObjectMetric) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
