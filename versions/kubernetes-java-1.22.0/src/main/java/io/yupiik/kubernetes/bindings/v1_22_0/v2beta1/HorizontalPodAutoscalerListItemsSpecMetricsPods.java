package io.yupiik.kubernetes.bindings.v1_22_0.v2beta1;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsSpecMetricsPods {
    private String metricName;
    private HorizontalPodAutoscalerListItemsSpecMetricsPodsSelector selector;
    private String targetAverageValue;

    public HorizontalPodAutoscalerListItemsSpecMetricsPods() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsPods(final String metricName,
                                                           final HorizontalPodAutoscalerListItemsSpecMetricsPodsSelector selector,
                                                           final String targetAverageValue) {
        // no-op
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(final String metricName) {
        this.metricName = metricName;
    }

    public HorizontalPodAutoscalerListItemsSpecMetricsPodsSelector getSelector() {
        return selector;
    }

    public void setSelector(final HorizontalPodAutoscalerListItemsSpecMetricsPodsSelector selector) {
        this.selector = selector;
    }

    public String getTargetAverageValue() {
        return targetAverageValue;
    }

    public void setTargetAverageValue(final String targetAverageValue) {
        this.targetAverageValue = targetAverageValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metricName,
                selector,
                targetAverageValue);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItemsSpecMetricsPods)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsSpecMetricsPods __otherCasted = (HorizontalPodAutoscalerListItemsSpecMetricsPods) __other;
        return Objects.equals(metricName, __otherCasted.metricName) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(targetAverageValue, __otherCasted.targetAverageValue);
    }
}
