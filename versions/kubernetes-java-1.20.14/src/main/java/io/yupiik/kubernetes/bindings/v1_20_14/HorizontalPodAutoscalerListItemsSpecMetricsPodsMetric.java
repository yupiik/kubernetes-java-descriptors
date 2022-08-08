package io.yupiik.kubernetes.bindings.v1_20_14;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsPodsMetric {
    private String name;
    private HorizontalPodAutoscalerListItemsSpecMetricsPodsMetricSelector selector;

    public HorizontalPodAutoscalerListItemsSpecMetricsPodsMetric() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsPodsMetric(final String name,
                                                                 final HorizontalPodAutoscalerListItemsSpecMetricsPodsMetricSelector selector) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsPodsMetricSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerListItemsSpecMetricsPodsMetricSelector selector) {
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsPodsMetric)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsPodsMetric __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsPodsMetric) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
