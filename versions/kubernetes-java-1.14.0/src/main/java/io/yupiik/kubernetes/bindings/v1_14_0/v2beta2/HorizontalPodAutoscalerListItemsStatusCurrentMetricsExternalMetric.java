package io.yupiik.kubernetes.bindings.v1_14_0.v2beta2;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetric {
    private String name;
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelector selector;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetric() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetric(final String name,
                                                                              final HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelector selector) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetricSelector selector) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetric)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetric __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsExternalMetric) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
