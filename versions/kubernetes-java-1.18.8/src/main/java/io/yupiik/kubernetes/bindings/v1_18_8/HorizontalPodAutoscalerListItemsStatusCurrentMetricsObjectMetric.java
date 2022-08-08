package io.yupiik.kubernetes.bindings.v1_18_8;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetric {
    private String name;
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetricSelector selector;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetric() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetric(final String name,
                                                                            final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetricSelector selector) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetricSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetricSelector selector) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetric)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetric __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectMetric) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
