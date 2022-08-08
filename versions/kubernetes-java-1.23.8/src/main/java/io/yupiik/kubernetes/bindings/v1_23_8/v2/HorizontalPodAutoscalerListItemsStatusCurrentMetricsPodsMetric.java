package io.yupiik.kubernetes.bindings.v1_23_8.v2;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetric {
    private String name;
    private HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelector selector;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetric() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetric(final String name,
                                                                          final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelector selector) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetricSelector selector) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetric)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetric __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsPodsMetric) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
