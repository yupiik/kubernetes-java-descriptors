package io.yupiik.kubernetes.bindings.v1_23_7.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsPodsMetric {
    private String name;
    private HorizontalPodAutoscalerStatusCurrentMetricsPodsMetricSelector selector;

    public HorizontalPodAutoscalerStatusCurrentMetricsPodsMetric() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsPodsMetric(final String name,
                                                                 final HorizontalPodAutoscalerStatusCurrentMetricsPodsMetricSelector selector) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsPodsMetricSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerStatusCurrentMetricsPodsMetricSelector selector) {
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
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsPodsMetric)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsPodsMetric __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsPodsMetric) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
