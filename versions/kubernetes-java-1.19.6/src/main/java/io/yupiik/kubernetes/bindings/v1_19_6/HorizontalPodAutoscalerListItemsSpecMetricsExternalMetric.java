package io.yupiik.kubernetes.bindings.v1_19_6;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsExternalMetric {
    private String name;
    private HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelector selector;

    public HorizontalPodAutoscalerListItemsSpecMetricsExternalMetric() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsExternalMetric(final String name,
                                                                     final HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelector selector) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerListItemsSpecMetricsExternalMetricSelector selector) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsExternalMetric)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsExternalMetric __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsExternalMetric) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
