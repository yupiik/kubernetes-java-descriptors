package io.yupiik.kubernetes.bindings.v1_23_3.v2;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsPodsMetric {
    private String name;
    private HorizontalPodAutoscalerSpecMetricsPodsMetricSelector selector;

    public HorizontalPodAutoscalerSpecMetricsPodsMetric() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsPodsMetric(final String name,
                                                        final HorizontalPodAutoscalerSpecMetricsPodsMetricSelector selector) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HorizontalPodAutoscalerSpecMetricsPodsMetricSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerSpecMetricsPodsMetricSelector selector) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsPodsMetric)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsPodsMetric __otherCasted = (HorizontalPodAutoscalerSpecMetricsPodsMetric) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
