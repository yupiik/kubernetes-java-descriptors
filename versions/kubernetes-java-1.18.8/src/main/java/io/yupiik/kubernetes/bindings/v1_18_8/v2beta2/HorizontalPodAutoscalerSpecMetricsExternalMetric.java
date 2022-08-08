package io.yupiik.kubernetes.bindings.v1_18_8.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerSpecMetricsExternalMetric {
    private String name;
    private HorizontalPodAutoscalerSpecMetricsExternalMetricSelector selector;

    public HorizontalPodAutoscalerSpecMetricsExternalMetric() {
        // no-op
    }

    public HorizontalPodAutoscalerSpecMetricsExternalMetric(final String name,
                                                            final HorizontalPodAutoscalerSpecMetricsExternalMetricSelector selector) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HorizontalPodAutoscalerSpecMetricsExternalMetricSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerSpecMetricsExternalMetricSelector selector) {
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
        if (!(__other instanceof HorizontalPodAutoscalerSpecMetricsExternalMetric)) {
            return false;
        }
        final HorizontalPodAutoscalerSpecMetricsExternalMetric __otherCasted = (HorizontalPodAutoscalerSpecMetricsExternalMetric) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
