package io.yupiik.kubernetes.bindings.v1_20_9.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsObjectMetric {
    private String name;
    private HorizontalPodAutoscalerSpecMetricsObjectMetricSelector selector;

    public HorizontalPodAutoscalerSpecMetricsObjectMetric() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsObjectMetric(final String name,
                                                          final HorizontalPodAutoscalerSpecMetricsObjectMetricSelector selector) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HorizontalPodAutoscalerSpecMetricsObjectMetricSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerSpecMetricsObjectMetricSelector selector) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsObjectMetric)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsObjectMetric __otherCasted = (HorizontalPodAutoscalerSpecMetricsObjectMetric) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
