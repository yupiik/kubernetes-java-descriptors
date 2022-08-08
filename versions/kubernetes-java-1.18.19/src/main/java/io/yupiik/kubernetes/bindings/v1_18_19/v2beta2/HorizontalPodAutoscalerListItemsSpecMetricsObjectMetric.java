package io.yupiik.kubernetes.bindings.v1_18_19.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsObjectMetric {
    private String name;
    private HorizontalPodAutoscalerListItemsSpecMetricsObjectMetricSelector selector;

    public HorizontalPodAutoscalerListItemsSpecMetricsObjectMetric() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsObjectMetric(final String name,
                                                                   final HorizontalPodAutoscalerListItemsSpecMetricsObjectMetricSelector selector) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsObjectMetricSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerListItemsSpecMetricsObjectMetricSelector selector) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsObjectMetric)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsObjectMetric __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsObjectMetric) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
